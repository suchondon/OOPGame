
public class main {
	public static void main(String[] args) {
		network frame = new network();
		frame.setVisible(true);
	}
<<<<<<< HEAD
=======
}



class rungame extends Thread{
	network network;
	public rungame(network network) {
		// TODO Auto-generated constructor stub
		this.network = network;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while (network.getServerIP().equals("")) {
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
		network.playgame.setVisible(true);
		
	}
>>>>>>> parent of 81944e7... Add FindIP
}