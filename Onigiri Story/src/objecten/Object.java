package objecten;

import java.awt.Image;

import javax.swing.ImageIcon;

import Game.Main;

public class Object {
	
	///***** VARIABELEN *****///
	private int breedte, hoogte;//dimensie van object
	private int x,y;//positie van object
	protected Image imgObject;
	protected ImageIcon icoObject;


	///***** CONSTRUCTOR *****///
	public Object(int x, int y, int breedte, int hoogte){
		
		this.x = x;
		this.y = y;
		this.breedte = breedte;
		this.hoogte = hoogte;

	}

	///***** GETTERS*****///
	public int getX() {return x;}

	public int getY() {return y;}
	
	public int getBreedte() {return breedte;}

	public int getHoogte() {return hoogte;}

	
	public Image getImgObject() {return imgObject;}
	///***** SETTERS *****///
	public void setX(int x) {this.x = x;}

	public void setY(int y) {this.y = y;}
	
	public void setBreedte(int breedte) {this.breedte = breedte;}

	public void setHoogte(int hoogte) {this.hoogte = hoogte;}

	
	///***** METHODES *****///
	public void verplaatsing(){ // update de pos van x van mijn object door steeds de verplaatsing dx af te trekken
		
		if (Main.background.getxPos() >= 0){
			this.x = this.x - Main.background.getDx();
			
		}
	}
	
}
