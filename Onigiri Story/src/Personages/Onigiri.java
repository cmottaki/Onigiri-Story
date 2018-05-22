package Personages;

import java.awt.Image;

import javax.swing.ImageIcon;

import Game.Main;
import objecten.Munt;
import objecten.Object;

public class Onigiri extends Personage {
	
	///***** VARIABELEN *****///
	private Image imgOnig;
	private ImageIcon icoOnig;
	private boolean spring; // true als onigiri springt
	private int sprongenteller; // hoe lang en hoe hoog de onigiri springt
	//private int tellerDood;

	///***** CONSTRUCTOR *****///
	public Onigiri(int x, int y) {// initialiseren van positie van onigiri( voor onigiri niet echt nodig want we hebben 1 enkele onigiri)
	
		super(x, y, 168, 142); //pos en afmetingen van onigiri
		this.icoOnig = new ImageIcon (getClass().getResource("/images/onigirinaarrechts.png"));
		this.imgOnig = this.icoOnig.getImage();
		
		this.spring = false;
		this.sprongenteller = 0;
		//this.tellerDood = 0;
		
	}
	

	///***** GETTERS *****///
	public Image getImgOnig(){return imgOnig;} //get image onigiri om die op background te tekenen
	
	public boolean isSpring() {return spring;}
	
	///***** SETTERS *****///
	public void setSpring(boolean spring) {this.spring = spring;}
	
	///***** METHODES *****///
	public Image spring(){// gaat afbeelding weergeven
		
		ImageIcon ico;
		Image img;
		String str;
		
		//naar boven gaan van sprong
		this.sprongenteller++;//methode spring gaat geroepen worden door background en elke keer gaat dan de sprongenteller geincrementeerd worden met 1 (hoogte stijgt) tot de onigiri een bepaalde hoogte bereikt
		if(this.sprongenteller <= 40){// als hij 40 is gaan we het naar boven gaan van de sprong stoppen en we gaan onigiri laten dalen
			if(this.getY()> Main.background.getHoogtePlafond()){this.setY(this.getY() - 12);}// onigiri gaat naar boven gaan met 4 pixels
			else{ this.sprongenteller = 41;}
			str = "/images/onigiri2_spring.png";
			
		}
		// het neervallen van sprong
		else if (this.getY() + this.getHoogte() < Main.background.getyGrond()){
			this.setY(this.getY() + 3);// onigiri laten dalen met 1 pixel
			str = "/images/onigiri2_spring.png";
		}
		// einde sprong : afbeelding moet terug veranderen want hij is dan niet meer aan het springen
		else{
			if(this.isNaarRechts() == true){str = "/images/onigirinaarrechts.png";}
			else{ str = "/images/onigirinaarlinks.png";}
			this.spring = false;
			this.sprongenteller = 0;
		}
		// weergeven van afbeelding van onigiri
		ico = new ImageIcon(getClass().getResource(str));
		img = ico.getImage();
		return img;			
			
	}
	
	public void contact(Object object){
		// contact horizontaal
		if(super.contactVoor(object) && this.isNaarRechts()||(super.contactAchter(object) 
			|| this.isNaarRechts() == false)){
			Main.background.setDx(0);
			this.setStap(false);
		}
		// contact met object onder
		if(super.contactBeneden(object) && this.spring){ // onigiri springt op object
			Main.background.setyGrond(object.getY());
		}else if (super.contactBeneden(object) == false){ // onigiri valt terug op grond
			Main.background.setyGrond(720); // initiele altitude van de grond
			if(this.spring == false){ this.setY(720	);}//initiele altitude van onigiri
		}
		// contact met object boven
		if (super.contactOp(object)){
			Main.background.setHoogtePlafond(object.getY() + object.getHoogte());// plafond word onderkant van object (bv;blok)
		}else if(super.contactOp(object) == false && this.spring == false){
			Main.background.setHoogtePlafond(0); // initiele altitude van plafond (lucht)
		}
	}
	
	public boolean contactMunt(objecten.Munt munt){
		if(this.contactAchter(munt)|| this.contactVoor(munt)|| this.contactBeneden(munt)
				|| this.contactOp(munt)){return true;}
		else{return false;}
	}
	/*public Image dood(){
		String str;
		ImageIcon ico;
		Image img;
		
		str ="/images/naam afbellding.png";//een bom ofzo
		this.tellerDood++;
		if(this.tellerDood> 100){
			str = "/images/naam afbeelding.png";//onigiri dood
			this.setY(this.getY()-1);
		}
		img = ico.getImage();
		return img;
	}*/


}

