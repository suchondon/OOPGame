import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

public class ClientFind {{
	DatagramSocket c;
	try {
		  //Open a random port to send the package
		  c = new DatagramSocket();
		  c.setBroadcast(true);

		  byte[] sendData = "Fighter_spirit_Player".getBytes();

		  //Try the 255.255.255.255 first
		  try {
		    DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, InetAddress.getByName("255.255.255.255"), 4062);
		    c.send(sendPacket);
		    System.out.println(">>> Request packet sent to: 255.255.255.255 (DEFAULT)");
		  } catch (Exception e) {
		  }

		  // Broadcast the message over all the network interfaces
		  Enumeration interfaces = NetworkInterface.getNetworkInterfaces();
		  while (interfaces.hasMoreElements()) {
		    NetworkInterface networkInterface = (NetworkInterface)interfaces.nextElement();

		    if (networkInterface.isLoopback() || !networkInterface.isUp()) {
		      continue; // Don't want to broadcast to the loopback interface
		    }

		    for (InterfaceAddress interfaceAddress : networkInterface.getInterfaceAddresses()) {
		      InetAddress broadcast = interfaceAddress.getBroadcast();
		      if (broadcast == null) {
		        continue;
		      }

		      // Send the broadcast package!
		      try {
		        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, broadcast, 4062);
		        c.send(sendPacket);
		      } catch (Exception e) {
		      }

		      System.out.println( ">>> Request packet sent to: " + broadcast.getHostAddress() + "; Interface: " + networkInterface.getDisplayName());
		    }
		  }

		  System.out.println( ">>> Done looping over all network interfaces. Now waiting for a reply!");

		  //Wait for a response
		  byte[] recvBuf = new byte[15000];
		  DatagramPacket receivePacket = new DatagramPacket(recvBuf, recvBuf.length);
		  c.receive(receivePacket);

		  //We have a response
		  
		  System.out.println( ">>> Broadcast response from server: " + receivePacket.getAddress().getHostAddress());
		  

		  c.close();
		} catch (IOException ex) {
		  //Logger.getLogger(LoginWindow.class.getName()).log(Level.SEVERE, null, ex);
		}
}
}
