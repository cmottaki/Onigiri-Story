package Personages;

//import java.awt.Image;

import java.awt.Image;

import javax.swing.ImageIcon;

import Game.Main;
//import Game.Main;
import objecten.Object;

public class Personage {
	
	///***** VARIABELEN *****///
	private int breedte, hoogte;// dimensie van personage
	private int x, y; // positie van personage
	private boolean stap; //true als personage stapt
	private boolean naarRechts;
	private boolean naarLinks; // true als personage  naar links gedraaid is
	public int teller; // stappenteller van personage
	
	///***** CONSTRUCTOR *****///
	public Personage(int x, int y, int breedte, int hoogte){
		
		this.x = x;
		this.y = y;
		this.breedte = breedte;
		this.teller = 0;
		this.stap = false;
		this.naarRechts = true;
	}
	
	///***** GETTERS *****///
	public int getBreedte() {return breedte;}

	public int getHoogte() {return hoogte;}

	public int getX() {return x;} //get pos vh personage

	public int getY() {return y;}

	public boolean isStap() {return stap;}

	public boolean isNaarLinks() {return naarLinks;}

	public int getTeller() {return teller;}
	
	public boolean isNaarRechts() {return naarRechts;}
	
	
	///***** SETTERS *****///
	public void setX(int x) {this.x = x;} // setbreedte en sethoogte zijn er niet want we gaan nooit de breedte of lengte van personage aanpassen

	public void setY(int y) {this.y = y;}

	public void setStap(boolean stap) {this.stap = stap;}

	public void setNaarLinks(boolean naarLinks) {this.naarLinks = naarLinks;}

	public void setTeller(int teller) {this.teller = teller;}

	public void setNaarRechts(boolean naarRechts) {this.naarRechts = naarRechts;}
	

	
	///***** METHODES *****///
	public Image Stap(String naam,int frequentie){
	 	String str = null;
	 	ImageIcon ico;
	 	Image img;
	 	
		if (this.stap == false) {// personage stapt niet
			if(this.naarRechts == true){str = "/images/"+ naam + ".png";}
			else{str = "/images/"+naam+"naarlinks.png";}
		}else{
			this.teller++;
			if (this.teller / frequentie == 0){
				if(this.naarRechts == true){str = "/images/" + naam+".png";}
				else{str = "/images/" + naam +"naarlinks.png";}
			}
			if(this.teller == 2 *frequentie){this.teller = 0;}
		}
		//displayt de afbeelding van personage
		ico = new ImageIcon(getClass().getResource(str));
		img = ico.getImage();
		return img;
	}
	public void deplacement(){
		if(Main.background.getxPos() >= 0){this.x = this.x - Main.background.getDx();}
	}

	
	 //detectie van contact rechts 
	public boolean contactVoor(Object object){
			if((this.x + this.breedte) < object.getX() ||(this.x +this.breedte) > object.getX() + 5  //contact horizontaal
				|| (this.y + this.hoogte) <= object.getY() || this.y >= (object.getY() + object.getHoogte())){//contact verticaal
				return false;}
			else{return true;}
	}
		
	//detectie van contact links
	public boolean contactAchter (Object object){
		if(this.x > object.getY() +object.getBreedte()||this.x + this.breedte < object.getX() + object.getBreedte()
		|| this.y +this.hoogte <= object.getY() || this.y >= object.getY() +object.getHoogte()){
			return false;}
		else{return true;}
	}
	//detectie contact onder onigiri
	public boolean contactBeneden(Object object){
		if(this.x +this.breedte < object.getX()+5|| this.x > object.getX() + object.getBreedte ()-5
				|| this.y + this.hoogte < object.getY() || this.y + this.hoogte > object.getY()+5){
			return false;}
		else{return true;}
	}
	// detectie contact boven op onigiri
	public boolean contactOp (Object object){
		if (this.x + this.breedte < object.getX() + 5 || this.x > object.getX() + object.getBreedte() -5
				|| this.y < object.getY() + object.getHoogte() || this.y > object.getY() + object.getHoogte() +5){
			return false;}
		else{return true;}
		}
	public boolean Dichtbij(Object object){
		if((this.x > object.getX() - 5 && this.x < object.getX() + object.getBreedte() +5)
				||(this.x + this.breedte > object.getX() - 5 && this.x + this.breedte < object.getX() + object.getBreedte() +5)){
			return true;}
		else{return false;}
		
	}

	
	
		
}

