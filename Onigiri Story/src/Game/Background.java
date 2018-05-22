
package Game;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Menu;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import Display.Countdown;
import Display.Score;
//import Personages.Champ;
import Personages.Onigiri;
import objecten.Blok;
import objecten.Munt;
import objecten.Object;
import objecten.Vaas;

@SuppressWarnings("serial")
public class Background extends JPanel{
	
	
		///***** VARIABELEN *****///
		private ImageIcon icoBack;// imageIcon gebruikt de afbeelding
		private Image imgBack1;// image voegt een afbeelding toe
		private Image imgBack2;
		
		private ImageIcon icoSushiHouse;
		private Image imgSushiHouse;
		private ImageIcon icoStart;
		private Image imgStart;
		
		private int xBack1; // = abscis links bovenaan van ons scherm
		private int xBack2;
		private int dx; // gaat background horizontaal verplaatsen
		private int xPos; // gaat ons helpen om onze start en kom op hun plaats te houden (bewegen niet mee met onig) hun x pos bepalen
		private int yGrond; //hoogte grond op dit moment (als je OP de blok/vaas gaat verandert de hoogte van de grond)
		private int hoogtePlafond; //hoogte plafond op dit moment (wanneer je onder een blokje gaat "verandert" de hoogte van het plafond, want je kunt enkel tot het blokje springen"
		
		public Onigiri onigiri;
		
		//public Champ champ;
		
		public Vaas vaas1;
		public Vaas vaas2;
		public Vaas vaas3;
		public Vaas vaas4;
		public Vaas vaas5;
		public Vaas vaas6;
		public Vaas vaas7;
		public Vaas vaas8;
		
		public Blok blok1;
		public Blok blok2;
		public Blok blok3;
		public Blok blok4;
		public Blok blok5;
		public Blok blok6;
		public Blok blok7;
		public Blok blok8;
		public Blok blok9;
		public Blok blok10;
		public Blok blok11;
		public Blok blok12;
		
		public Munt munt1;
		public Munt munt2;
		public Munt munt3;
		public Munt munt4;
		public Munt munt5;
		public Munt munt6;
		public Munt munt7;
		public Munt munt8;
		public Munt munt9;
		public Munt munt10;
		
		private ImageIcon IcoMochiHouse;
		private Image imgMochiHouse;
		
		private ArrayList<Object> tabObject; // tabel waarin alle objecten van spel gesaved zijn
		private ArrayList<Munt> tabMunt; //tabel waarin alle munten gesaved zijn //apart van blok want actie is verschillend

		private Score score;
		private Font police;
		
		private Countdown countdown;
		
		private Menu menu;
		
		
		///***** CONSTRUCTOR *****///
		public Background (){
		
			super(); 
			
			this.xBack1 = -50;// background gaat groter zijn langs elke kant van venster
			this.xBack2 = 1550; // breedte afbeelding - xBack 1
			this.dx = 0;
			this.xPos = -1;
			this.yGrond = 720; // van lucht tot waar onigiri staat 
			this.hoogtePlafond = 0;// hoogte van lucht in begin
			
			
			icoBack = new ImageIcon(getClass().getResource("/images/Fond.png"));// deze methode gebuiken want andere methode werkt niet voor jar bestanden
			this.imgBack1 = this.icoBack.getImage();// gaat onze afbeelfing associeren aan icon
			this.imgBack2 = this.icoBack.getImage();
			
			this.icoSushiHouse = new ImageIcon(getClass().getResource("/images/sushi_house.png"));
			this.imgSushiHouse = this.icoSushiHouse.getImage();
			this.icoStart = new ImageIcon(getClass().getResource("/images/pijl.png"));
			this.imgStart = this.icoStart.getImage();
		
			
			onigiri = new Onigiri(500,720);
			//champ = new Champ(350,720);
			
			vaas1 = new Vaas(2000,665);
			vaas2 = new Vaas(3330,665);
			vaas3 = new Vaas(5328,665);
			vaas4 = new Vaas(6327,665);
			vaas5 = new Vaas(8325,665);
			vaas6 = new Vaas(9990,665);
			vaas7 = new Vaas(12654,665);
			vaas8 = new Vaas(14985,665);
			
			blok1 = new Blok(1500,500);
			blok2 = new Blok(4500,500);
			blok3 = new Blok(4763,472);
			blok4 = new Blok(5025,445);
			blok5 = new Blok(7500,500);
			blok6 = new Blok(9500,445);
			blok7 = new Blok(9700,500);
			blok8 = new Blok(13125,445);
			blok9 = new Blok(13313,389);
			blok10 = new Blok(14550,472);
			blok11= new Blok(15750,556);
			blok12= new Blok(16125,584);
			
			munt1 = new Munt(1500,430);
			munt2 = new Munt(4500,413);
			munt3 = new Munt(4763,290);
			munt4 = new Munt(5025,200);
			munt5 = new Munt(7500,430);
			munt6 = new Munt(9500,330);
			munt7 = new Munt(9700,397);
			munt8 = new Munt(13125,363);
			munt9 = new Munt(13313,490);
			munt10 = new Munt(14550,180);
			
			menu = new Menu();
			
			this.IcoMochiHouse = new ImageIcon(getClass().getResource("/images/mochi house.png"));
			this.imgMochiHouse = this.IcoMochiHouse.getImage();
			//instantiatie arrayylist
			tabObject = new ArrayList<Object>(); //tabel invullen; ik vul eerst aale vazen in, dan alle blokken
			
			this.tabObject.add(this.vaas1);
			this.tabObject.add(this.vaas2);
			this.tabObject.add(this.vaas3);
			this.tabObject.add(this.vaas4);
			this.tabObject.add(this.vaas5);
			this.tabObject.add(this.vaas6);
			this.tabObject.add(this.vaas7);
			this.tabObject.add(this.vaas8);
			
			this.tabObject.add(this.blok1);
			this.tabObject.add(this.blok2);
			this.tabObject.add(this.blok3);
			this.tabObject.add(this.blok4);
			this.tabObject.add(this.blok5);
			this.tabObject.add(this.blok6);
			this.tabObject.add(this.blok7);
			this.tabObject.add(this.blok8);
			this.tabObject.add(this.blok9);
			this.tabObject.add(this.blok10);
			this.tabObject.add(this.blok11);
			this.tabObject.add(this.blok12);
			
			tabMunt = new ArrayList<Munt>();
			this.tabMunt.add(munt1);
			this.tabMunt.add(munt2);
			this.tabMunt.add(munt3);
			this.tabMunt.add(munt4);
			this.tabMunt.add(munt5);
			this.tabMunt.add(munt6);
			this.tabMunt.add(munt7);
			this.tabMunt.add(munt8);
			this.tabMunt.add(munt9);
			this.tabMunt.add(munt10);
			
			this.setFocusable(true);
			this.requestFocusInWindow();
			this.addKeyListener(new Clavier());
			
			
			score = new Score();
			police = new Font("Korean_Calligraphy_Normal", Font.PLAIN, 18);
			countdown = new Countdown();
			
			Thread chronoWindow = new Thread(new Chrono());// we implementeren onze chrono
			chronoWindow.start();
		
	}
		///***** GETTERS *****/// // om aan variabele dx te accederen zonder rechtstreeks variabele dx  *clavier
		
				public int getDx() {return dx;}
				public int getxPos() {return xPos;}
				public int getyGrond() {return yGrond;}
				public int getHoogtePlafond() {return hoogtePlafond;}
				
		///***** SETTERS *****/// // om de variable dx te kunnen aanpassen *clavier


				public void setDx(int dx) {this.dx = dx;}
				public void setxPos(int xPos) {this.xPos = xPos;}
				public void setyGrond(int yGrond) {this.yGrond = yGrond;}
				public void setHoogtePlafond(int hoogtePlafond) {this.hoogtePlafond = hoogtePlafond;}
				public void setxBack1(int xBack1) {this.xBack1 = xBack1;}
				public void setxBack2(int xBack2) {this.xBack2 = xBack2;}
		
		///***** METHODES *****///
		public void movingBackground(){// bijwerken van positie van onze background
				if (this.xPos >= 0 && this.xPos<= 16600){
					//update van posities van elementen in spel tijdens verplaatsing van onigiri
					this.xPos = this.xPos + this.dx;
					this.xBack1 = this.xBack1 - this.dx;// alles in if want we willen niet dat we oneindig ver naar links kunnen want kom is ons startpunt
					this.xBack2 = this.xBack2 - this.dx;
				}
				//het verplaatsen van scherm
				if (this.xBack1 == -1600){ // heel de afbeelding is links dus we zien het niet (1600 = breedte afbeelding)
					this.xBack1 = 1600;}
				else if (this.xBack2 == -1600){
					this.xBack2 = 1600;}
				else if(this.xBack1 == 1600){ // heel de afbeelding is rechts dus we zien het niet (1600 = breedte afbeelding)
					this.xBack1 = -1600;}
				else if (this.xBack2 == 1600){
					this.xBack2 = -1600;}
			}
		
		
		/*private boolean spelGewonnen(){
			if(this.countdown.getAfteller() > 0 && this.onigiri.isLevend && this.score.getAantalMunten() == 10 
					&& this.xPos > 16600){ //16600: einde => mochihouse
				return true;
			}else {return false;}
			
		}
		private boolean spelVerloren(){
			if(this.onigiri.isLevend() == false || this.countdown.getAfteller() < = 0){
				return true;
			}else{return false;}
		}*/

		public void paintComponent(Graphics g){//tekent alle afbeeldingen in vensters (gevraagd elke 3 ms)
				super.paintComponent(g);
				Graphics g2 = (Graphics2D)g;
				
				//detectie contact met objecten
				for (int i = 0; i < this.tabObject.size(); i++){
					// onigiri
					if(this.onigiri.Dichtbij(this.tabObject.get(i))) {this.onigiri.contact(this.tabObject.get(i));}
					//if(this.champ.Dichtbij(this.tabObject.get(i))) {this.champ.contact(this.tabObject.get(i));}
				}
				
				// detectie contact van onigiri met munt
				for(int i = 0; i > this.tabMunt.size();i++){
					if(this.onigiri.Dichtbij(this.tabMunt.get(i))){
						if(this.onigiri.contactMunt(this.tabMunt.get(i))){
							this.score.setAantalMunten(this.score.getAantalMunten()+1);
							this.tabMunt.remove(i);
						}
					}
				}
				
	
				//verplaatsing van vaste "objecten" in spel
				this.movingBackground();
				if(this.xPos >= 0 && this.xPos <= 16600){
					for (int i = 0; i<this.tabObject.size();i++){this.tabObject.get(i).verplaatsing();}
					for(int i = 0; i < this.tabMunt.size(); i++){this.tabMunt.get(i).verplaatsing();}
					//this.champ.verplaatsing();
				}
				
				
				
				g2.drawImage(this.imgBack1, this.xBack1,0, null);// tekenen van de Background
				g2.drawImage(this.imgBack2, this.xBack2,0, null);
				
				
				g2.drawImage(imgSushiHouse, -70-this.xPos, -170, null);
				g2.drawImage(imgStart,1000-this.xPos, 700, null);
	
				// afbeeldingen van tabel
				for(int i = 0; i< this.tabObject.size(); i++){// gaat van 0 tot grootte van tabel en toont alle afbeeldingen van tabel
					g2.drawImage(this.tabObject.get(i).getImgObject(),this.tabObject.get(i).getX(), this.tabObject.get(i).getY(), null);
				}
				
				// afbeelding Munt
				
				for(int i = 0; i< this.tabMunt.size(); i++){// gaat van 0 tot grootte van tabel en toont alle afbeeldingen van tabel
					g2.drawImage(this.tabMunt.get(i).beweegt(),this.tabMunt.get(i).getX(), this.tabMunt.get(i).getY(), null);
				}
				
				
				g2.drawImage(imgMochiHouse, 16600 - this.xPos,35, null);
				//SPRONG
				if(this.onigiri.isSpring()){ //springt onigiri? => jumpface, anders walkface
					g2.drawImage(this.onigiri.spring(), this.onigiri.getX(), this.onigiri.getY(), null);}
				else{
					g2.drawImage(this.onigiri.getImgOnig(), this.onigiri.getX(),this.onigiri.getY(),null);}
				
				//afbeelding champ
				//g2.drawImage(this.champ.Stap("champ",45), this.champ.getX(), this.champ.getY(), null);
				
				// het updaten van score
				g2.setFont(police);
				g2.drawString(this.score.getAantalMunten() + " pruimen gevonden op " + this.score.getTotaal_Munten(),1250,25);
				
				// updaten van countdown
				g2.drawString(this.countdown.getStr(), 5, 25);
				
				// einde van spel
				/*if(this.eindespel()){
					Font policeEinde = new Font("Arial", Font.BOLD, 50);
					g2.setFont(policeEinde);
					if(this.spelGewonnen()){g2.drawString("Je hebt gewonnen !!", 120, 180);}
					else{g2.drawString("je hebt verloren ... :(", 120, 180);}
				}*/
			
		}
	}