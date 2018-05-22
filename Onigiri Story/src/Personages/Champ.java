package Personages;

import java.awt.Image;
import javax.swing.ImageIcon;

import Personages.Personage;
import objecten.Object;

public class Champ extends Personage implements Runnable {
	
	///***** VARIABELEN *****///
	private Image imgChamp;
	private ImageIcon icoChamp;
	
	private final int PAUSE= 15;// wachttijd tussen 2 lussen
	private int dxChamp;// geen verplaatsing van Champ
	
	///***** CONSTRUCTOR *****///
	public Champ(int x, int y) {
		super(x, y, 27, 30);//size van vijand1
		super.setNaarRechts(true);
		super.setStap(true);
		this.dxChamp = 1;
		
		this.icoChamp = new ImageIcon(getClass().getResource("/images/makinaarrechts.png"));
		this.imgChamp = this.icoChamp.getImage();
		
		Thread chronoChamp = new Thread(this);
		chronoChamp.start();
	}
	///***** GETTERS *****///
	public Image getImgChamp() {return imgChamp;}
	
	
	///***** SETERS *****///
	
	///***** METHODES *****///
	public void beweegt(){//verplaatsing van champ
		if(super.isNaarRechts() == true){this.dxChamp = 1;}
		else{this.dxChamp = -1;}
		super.setX(super.getX() + this.dxChamp);//gaat abscis van champ elke keer updaten
	}
	
	@Override
	public void run() {
		try{Thread.sleep(20);}
		catch(InterruptedException e){}
		
		while(true){//oneindige lus
			this.beweegt();
			try{Thread.sleep(PAUSE);}
			catch (InterruptedException e){}
		}
	}
	/*public void contact(Object object){
		if(super.contactVoor(object) == true && this.isNaarRechts() == true){
			super.setNaarRechts(false);
			this.dxChamp = -1;
		}else if (super.contactAchter(object) == true && this.isNaarRechts() == false){
			super.setNaarRechts(true);
			this.dxChamp = 1;
		}*/
	}
//}
	
