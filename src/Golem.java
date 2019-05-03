import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Golem extends JPanel{
	Image bg = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator +"Battleground3.png");
	Image Ice_IdleR = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "IceGolem_Idle.gif");
	Image Ice_IdleL = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "IceGolem_Idle2.gif");
	Image Ice_DieL = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "IceGolem_Dying2.gif");
	Image Ice_DieR = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "IceGolem_Dying.gif");
	Image Ice_KickL = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "IceGolem_Kicking2.gif");
	Image Ice_KickR = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "IceGolem_Kicking.gif");
	Image Ice_RunL = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "IceGolem_Running2.gif");
	Image Ice_RunR = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "IceGolem_Running.gif");
	Image Ice_RunSlashL = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "IceGolem_RunSlashing2.gif");
	Image Ice_RunSlashR = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "IceGolem_RunSlashing.gif");
	Image Ice_SlashL = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "IceGolem_Slashing2.gif");
	Image Ice_SlashR = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "IceGolem_Slashing.gif");
	
	
	Image Lava_IdleR = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "LavaGolem_Idle.gif");
	Image Lava_IdleL = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "LavaGolem_Idle2.gif");
	Image Lava_DieL = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "LavaGolem_Dying2.gif");
	Image Lava_DieR = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "LavaGolem_Dying.gif");
	Image Lava_KickL = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "LavaGolem_Kicking2.gif");
	Image Lava_KickR = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "LavaGolem_Kicking.gif");
	Image Lava_RunL = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "LavaGolem_Running2.gif");
	Image Lava_RunR = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "LavaGolem_Running.gif");
	Image Lava_RunSlashL = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "LavaGolem_RunSlashing2.gif");
	Image Lava_RunSlashR = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "LavaGolem_RunSlashing.gif");
	Image Lava_SlashL = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "LavaGolem_Slashing2.gif");
	Image Lava_SlashR = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "LavaGolem_Slashing.gif");
	
	Image Orc_IdleR = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "Orc_Idle.gif");
	Image Orc_IdleL = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "Orc_Idle2.gif");
	Image Orc_DieL = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "Orc_Dying2.gif");
	Image Orc_DieR = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "Orc_Dying.gif");
	Image Orc_KickL = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "Orc_KickingL.png");
	Image Orc_KickR = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "Orc_KickingR.png");
	Image Orc_RunL = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "Orc_Running2.gif");
	Image Orc_RunR = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "Orc_Running.gif");
	Image Orc_RunSlashL = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "Orc_RunSlashing2.gif");
	Image Orc_RunSlashR = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "Orc_RunSlashing.gif");
	Image Orc_SlashL = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "Orc_Slashing2.gif");
	Image Orc_SlashR = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "Orc_Slashing.gif");
	
	Image Angel_IdleR = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "FallenAngels_Idle.gif");
	Image Angel_IdleL = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "FallenAngels_Idle2.gif");
	Image Angel_DieL = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "FallenAngels_Dying2.gif");
	Image Angel_DieR = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "FallenAngels_Dying.gif");
	Image Angel_KickL = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "FallenAngels_Kicking2.gif");
	Image Angel_KickR = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "FallenAngels_Kicking.gif");
	Image Angel_RunL = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "FallenAngels_Running2.gif");
	Image Angel_RunR = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "FallenAngels_Running.gif");
	Image Angel_RunSlashL = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "FallenAngels_RunSlashing2.gif");
	Image Angel_RunSlashR = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "FallenAngels_RunSlashing.gif");
	Image Angel_SlashL = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "FallenAngels_Slashing2.gif");
	Image Angel_SlashR = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") 
			+ File.separator +"image"+ File.separator + "Golem" + File.separator + "FallenAngels_Slashing.gif");
//	int xIce=0,xLava=0,xOrc=1180,xAngel=1180;
//	int yIce=300,yLava=500,yOrc=300,yAngle=500;
	
	int xIce,xLava,xOrc,xAngel;
	int yIce,yLava,yOrc,yAngle;
	boolean IceKick,AngelKick,OrcKick,LavaKick,
			IceL,AngelL,OrcL,LavaL,
			IceR,AngelR,OrcR,LavaR;
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.drawImage(bg, 0, 0, this);
		g.drawImage(Ice_IdleR, xIce, yIce,120,120, this);
		g.drawImage(Angel_IdleL, xAngel, yAngle,120,120, this);
		g.drawImage(Orc_IdleL, xOrc, yOrc,120,120, this);
		g.drawImage(Lava_IdleR, xLava, yLava,120,120, this);
		if (IceKick) {
			g.drawImage(Ice_KickR, xIce, yIce,120,120, this);
			IceKick=false;
		}if(AngelKick){
			g.drawImage(Angel_KickR, xAngel, yAngle,120,120, this);
			AngelKick=false;
		}if(OrcKick){
			g.drawImage(Orc_KickR, xOrc, yOrc,120,120, this);
			OrcKick=false;
		}if(LavaKick){
			g.drawImage(Lava_KickR, xLava, yLava,120,120, this);
			LavaKick=false;
		}
		
		
		repaint();
	}

	public void setxIce(int xIce) {
		this.xIce = xIce;
	}

	public void setxLava(int xLava) {
		this.xLava = xLava;
	}

	public void setxOrc(int xOrc) {
		this.xOrc = xOrc;
	}

	public void setxAngel(int xAngel) {
		this.xAngel = xAngel;
	}

	public void setyIce(int yIce) {
		this.yIce = yIce;
	}

	public void setyLava(int yLava) {
		this.yLava = yLava;
	}

	public void setyOrc(int yOrc) {
		this.yOrc = yOrc;
	}

	public void setyAngle(int yAngle) {
		this.yAngle = yAngle;
	}

	public void setIceKick(boolean iceKick) {
		IceKick = iceKick;
	}

	public void setAngelKick(boolean angelKick) {
		AngelKick = angelKick;
	}

	public void setOrcKick(boolean orcKick) {
		OrcKick = orcKick;
	}

	public void setLavaKick(boolean lavaKick) {
		LavaKick = lavaKick;
	}
	
	
}