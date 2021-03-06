import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.logging.Logger;

public class BroadcastServer extends Thread {
	DatagramSocket socket;
	network network;
	int count = 1;
	public BroadcastServer(network network) {
		// TODO Auto-generated constructor stub
		this.network = network;
	}
	
	  @Override
	  public void run() {
	    try {
	      //Keep a socket open to listen to all the UDP trafic that is destined for this port
	      socket = new DatagramSocket(4062, InetAddress.getByName("0.0.0.0"));
	      socket.setBroadcast(true);
	      
	      while (count==1) {
	        System.out.println(getClass().getName() + ">>>Ready to receive broadcast packets!");
	        //Receive a packet
	        byte[] recvBuf = new byte[15000];
	        DatagramPacket packet = new DatagramPacket(recvBuf, recvBuf.length);
	        socket.receive(packet);
	        //Packet received
	        System.out.println(getClass().getName() + ">>>Discovery packet received from: " + packet.getAddress().getHostAddress());
	        System.out.println(getClass().getName() + ">>>Packet received; data: " + new String(packet.getData()));
	
	        //See if the packet holds the right command (message)
	
	        String message = new String(packet.getData()).trim();
	        if (message.equals("Fighter_spirit_Player")) {
	          byte[] sendData = "Fighter_spirit_Player_RESPONSE".getBytes();
	          //Send a response
	          DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, packet.getAddress(), packet.getPort());
	          socket.send(sendPacket);
	          System.out.println(getClass().getName() + ">>>Sent packet to: " + sendPacket.getAddress().getHostAddress());
	          count+=1;
	          
	          network.setServerIP(sendPacket.getAddress().getHostAddress());
	        }
	        
	      }
	      
	      System.out.println("End ServerB");
	      
	    } catch (IOException ex) {
	
	     // Logger.getLogger(DiscoveryThread.class.getName()).log(Level.SEVERE, null, ex);
	
	    }
	
	  }

}
