import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class network extends JFrame{
	BroadcastServer serverBroad = new BroadcastServer();
	ClientFind findServer;
	JPanel panel1 = new JPanel(new GridLayout(3, 1));
	JButton join = new JButton("Join");
	JButton server = new JButton("Server");
	int x,y;
	String me;
	boolean kick;
	String serverIP = "";
	List<String> clientIP = new ArrayList<String>();
	
	public network(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setBounds(10, 10, 300, 300);
		
		panel1.setBounds(10, 50, 300, 300);
		panel1.add(join);
		panel1.add(server);

		
		add(panel1);
		
		join.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				findServer = new ClientFind();
				
			}
		});
		
		server.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				serverBroad.start();
			}
		});
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setMe(String me) {
		this.me = me;
	}
	
	public void setKick(boolean kick) {
		this.kick = kick;
	}
	
	public void setServerIP(String ip) {
		this.serverIP = ip;
	}
	
	public void setClientIP(String ip) {
		this.clientIP.add(ip);
	}
	
	public String getServerIP() {
		return this.serverIP;
	}

	public void send() {
		
			try {
				MessageChat chat = new MessageChat();
				
				chat.setX(x);
				chat.setY(y);
				chat.setMe(me);
				chat.setKick(kick);
				
				
				byte[] serializedObject = new byte[2048];
				
				ByteArrayOutputStream bo =new ByteArrayOutputStream();
				ObjectOutputStream so = new ObjectOutputStream(bo);
				so.writeObject(chat);
				so.flush();
				serializedObject = bo.toByteArray();
				
				Socket socket = new Socket(serverIP, 4062);
				
				PrintStream dataOut = new PrintStream(socket.getOutputStream());
				dataOut.write(serializedObject);
				dataOut.close();
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2);
			}
	
		
	}
}

class server extends Thread{
	Golem golem;
	ServerSocket servSocket;
	
	public server(Golem golem){
		this.golem = golem;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			servSocket = new ServerSocket(4062);
			while (true) {
				try {
					
					Socket socket = servSocket.accept();
					
					socket.setTcpNoDelay(true);
					InputStream input = socket.getInputStream();
					
					byte[] data = new byte[2048];
					input.read(data);
					ByteArrayInputStream bi = new ByteArrayInputStream(data);
					ObjectInputStream si = new ObjectInputStream(bi);
					MessageChat chat = (MessageChat)si.readObject();
			
					if (chat.getMe().equals("orc")) {
						golem.setOrcKick(chat.isKick());
						golem.setxOrc(chat.getX());
						golem.setyOrc(chat.getY());

						System.out.println(chat.getMe());

					}
					else if (chat.getMe().equals("ice")) {
						golem.setIceKick(chat.isKick());
						golem.setxIce(chat.getX());
						golem.setyIce(chat.getY());

						System.out.println(chat.getMe());

					}
					else if (chat.getMe().equals("lava")) {
						golem.setLavaKick(chat.isKick());
						golem.setxLava(chat.getX());
						golem.setyLava(chat.getY());

						System.out.println(chat.getMe());

					}
					else if (chat.getMe().equals("angel")) {
						golem.setAngelKick(chat.isKick());
						golem.setxAngel(chat.getX());
						golem.setyAngle(chat.getY());

					}
					
//					network.send(network.getClientIP(0));
//					network.send(network.getClientIP(1));
//					network.send(network.getClientIP(2));

					System.out.println(chat.getX());
					System.out.println(chat.getY());
					System.out.println(chat.isKick());
					
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
}

class MessageChat implements Serializable{
	private static final long serialVersionUID = 239582389;
	private String me;
	private int x;
	private int y;
	private boolean kick = false;
	private boolean attack = false;
	private boolean skill = false;
	private String target;
	
	
	public String getMe() {
		return me;
	}
	public void setMe(String me) {
		this.me = me;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public boolean isKick() {
		return kick;
	}
	public void setKick(boolean kick) {
		this.kick = kick;
	}
	public boolean isAttack() {
		return attack;
	}
	public void setAttack(boolean attack) {
		this.attack = attack;
	}
	public boolean isSkill() {
		return skill;
	}
	public void setSkill(boolean skill) {
		this.skill = skill;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}


}