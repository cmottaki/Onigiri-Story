package objecten;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Munt extends Object implements Runnable{
	
	///***** VARIABELEN *****///
	private int teller;
	private final int PAUSE = 15;//wachttijd tussen twee lussen
	
	///***** CONSTRUCTOR*****///
	public Munt(int x, int y) {
		super(x, y, 75, 70);//30 size van munt
		
		super.icoObject = new ImageIcon(getClass().getResource("/images/munt1.png"));
		super.imgObject = super.icoObject.getImage();
		
	}
	
	
	///***** GETTERS *****///
	
	
	///***** SETTERS *****///
	
	
	///***** METHODES *****///
	public Image beweegt(){ //beweging van munt
		String str;
		ImageIcon ico;
		Image img;
		
		this.teller++;
		if(this.teller /50 == 0){str = "/images/munt1.png";}
		else{str = "/images/munt2.png";}
		if(this.teller == 100){this.teller = 0;}
		
		// het tonen van afbeelding van personage
		ico = new ImageIcon(getClass().getResource(str));
		img = ico.getImage();
		return img;
	}


	@Override
	public void run() {
		try{Thread.sleep(20);}//we wachten 20 ms voordat we functie beweegt aanroepen
		catch (InterruptedException e){}
		
		while(true){//oneindige lus
			this.beweegt();
			try{Thread.sleep(PAUSE);}
			catch(InterruptedException e){}
		}
		
	}

}
