import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;




public class game extends JFrame implements KeyListener{
	network network;
	Golem golem = new Golem();
	server s1 = new server(golem,network);
	int xIce=0,xLava=0,xOrc=1180,xAngel=1180;
	int yIce=300,yLava=500,yOrc=300,yAngle=500;
	String myGolem;
	public game(network network) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Fighter spirit");
		setSize(1320,729);
		setLocationRelativeTo(null);
		
		this.network = network;
		
		addKeyListener(this);
		s1.start();
		
		golem.setxIce(xIce);
		golem.setxLava(xLava);
		golem.setxOrc(xOrc);
		golem.setxAngel(xAngel);
		golem.setyIce(yIce);
		golem.setyLava(yLava);
		golem.setyOrc(yOrc);
		golem.setyAngle(yAngle);
		
		
		
		add(golem);
		
		myGolem="orc";

	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode()==39) {
			if (myGolem.equals("ice")) {
				if (xIce<=1180) {
					xIce+=10;
				}
				network.setKick(false);
				golem.setxIce(xIce);
				golem.setyIce(yIce);
				network.setX(xIce);
				network.setY(yIce);
				network.setMe("ice");
				network.send();
			}else if (myGolem.equals("lava")) {
				if (xLava<=1180) {
					xLava+=10;
				}
				network.setKick(false);
				golem.setxLava(xLava);
				golem.setyLava(yLava);
				network.setY(yLava);
				network.setX(xLava);
				network.setMe("lava");
				network.send();
			}
			else if (myGolem.equals("orc")) {
				if (xOrc<=1180) {
					xOrc+=10;
				}
				network.setKick(false);
				golem.setxOrc(xOrc);
				golem.setyOrc(yOrc);
				network.setX(xOrc);
				network.setY(yOrc);
				network.setMe("orc");
				network.send();
			}
			else if (myGolem.equals("angel")) {
				if (xAngel<=1180) {
					xAngel+=10;
				}
				network.setKick(false);
				golem.setxAngel(xAngel);
				golem.setyAngle(yAngle);
				network.setX(xAngel);
				network.setY(yAngle);
				network.setMe("angel");
				network.send();
			}
			
		}else if (e.getKeyCode()==37) {
			if (myGolem.equals("ice")) {
				if (xIce>=0) {
					xIce-=10;
				}
				network.setKick(false);
				golem.setxIce(xIce);
				golem.setyIce(yIce);
				network.setX(xIce);
				network.setY(yIce);
				network.setMe("ice");
				network.send();
			}else if (myGolem.equals("lava")) {
				if (xLava>=0) {
					xLava-=10;
				}
				network.setKick(false);
				golem.setxLava(xLava);
				golem.setyLava(yLava);
				network.setX(xLava);
				network.setY(yLava);
				network.setMe("lava");
				network.send();
			}
			else if (myGolem.equals("orc")) {
				if (xOrc>=0) {
					xOrc-=10;
				}
				network.setKick(false);
				golem.setxOrc(xOrc);
				golem.setyOrc(yOrc);
				network.setX(xOrc);
				network.setY(yOrc);
				network.setMe("orc");
				network.send();
			}
			else if (myGolem.equals("angel")) {
				if (xAngel>=0) {
					xAngel-=10;
				}
				network.setKick(false);
				golem.setxAngel(xAngel);
				golem.setyAngle(yAngle);
				network.setX(xAngel);
				network.setY(yAngle);
				network.setMe("angel");
				network.send();
			}
		}else if (e.getKeyCode()==38) {
			//UP
			if (myGolem.equals("ice")) {
				if (yIce>=300) {
					yIce-=10;
				}
				network.setKick(false);
				golem.setxIce(xIce);
				golem.setyIce(yIce);
				network.setX(xIce);
				network.setY(yIce);
				network.setMe("ice");
				network.send();
			}else if (myGolem.equals("lava")) {
				if (yLava>=300) {
					yLava-=10;
				}
				network.setKick(false);
				golem.setxLava(xLava);
				golem.setyLava(yLava);
				network.setY(yLava);
				network.setX(xLava);
				network.setMe("lava");
				network.send();
			}
			else if (myGolem.equals("orc")) {
				if (yOrc>=300) {
					yOrc-=10;
				}
				network.setKick(false);
				golem.setxOrc(xOrc);
				golem.setyOrc(yOrc);
				network.setX(xOrc);
				network.setY(yOrc);
				network.setMe("orc");
				network.send();
			}
			else if (myGolem.equals("angel")) {
				if (yAngle>=300) {
					yAngle-=10;
				}
				network.setKick(false);
				golem.setxAngel(xAngel);
				golem.setyAngle(yAngle);
				network.setX(xAngel);
				network.setY(yAngle);
				network.setMe("angel");
				network.send();
			}
		}else if (e.getKeyCode()==40) {
			//DOWN
			if (myGolem.equals("ice")) {
				if (yIce<=550) {
					yIce+=10;
				}
				network.setKick(false);
				golem.setxIce(xIce);
				golem.setyIce(yIce);
				network.setX(xIce);
				network.setY(yIce);
				network.setMe("ice");
				network.send();
			}else if (myGolem.equals("lava")) {
				if (yLava<=550) {
					yLava+=10;
				}
				network.setKick(false);
				golem.setxLava(xLava);
				golem.setyLava(yLava);
				network.setY(yLava);
				network.setX(xLava);
				network.setMe("lava");
				network.send();
			}
			else if (myGolem.equals("orc")) {
				if (yOrc<=550) {
					yOrc+=10;
				}
				network.setKick(false);
				golem.setxOrc(xOrc);
				golem.setyOrc(yOrc);
				network.setX(xOrc);
				network.setY(yOrc);
				network.setMe("orc");
				network.send();
			}
			else if (myGolem.equals("angel")) {
				if (yAngle<=550) {
					yAngle+=10;
				}
				network.setKick(false);
				golem.setxAngel(xAngel);
				golem.setyAngle(yAngle);
				network.setX(xAngel);
				network.setY(yAngle);
				network.setMe("angel");
				network.send();
			}
		}else {}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println(e);
		if (e.getKeyCode()==68) {
			if (myGolem.equals("ice")) {
				network.setKick(true);
				network.setMe("ice");
				golem.setxIce(xIce);
				golem.setyIce(yIce);
				network.setX(xIce);
				network.setY(yIce);
				network.send();
			}else if (myGolem.equals("lava")) {
				network.setKick(true);
				network.setMe("lava");
				golem.setxLava(xLava);
				golem.setyLava(yLava);
				network.setX(xLava);
				network.setY(yLava);
				network.send();
			}
			else if (myGolem.equals("orc")) {
				network.setKick(true);
				network.setMe("orc");
				golem.setxOrc(xOrc);
				golem.setyOrc(yOrc);
				network.setX(xOrc);
				network.setY(yOrc);
				network.send();
			}
			else if (myGolem.equals("angel")) {
				network.setKick(true);
				network.setMe("angel");
				golem.setxAngel(xAngel);
				golem.setyAngle(yAngle);
				network.setX(xAngel);
				network.setY(yAngle);
				network.send();
			}
	}
}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
