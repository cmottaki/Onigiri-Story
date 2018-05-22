//https://www.youtube.com/playlist?list=PLDKRpuLSe0f_4YgSROSWf_3wsdXwqefw9 hulp bij schrijven van code
package Game;

import javax.swing.JFrame;

public class Main {
		
		public static Background background;// gaat ons helpen om overal in programme te kunnen accederen aan info van deze class
			
			public static void main(String[] args) {
				
				JFrame frame = new JFrame("Onigiri Story <3");
			
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//sluiten van programe op X
				frame.setSize(1500, 940);// grootte van onze venster
				frame.setLocationRelativeTo(null);// venster komt in het midden van ons scherm
				frame.setResizable(false);// grootte van venster kan niet aangepast worden
				frame.setAlwaysOnTop(true);// bij openen van spel komt boven al de andere vensters
			
				background = new Background ();
			
				frame.setContentPane(background);// we gaan de panel associeren aan venster
				frame.setVisible(true);// we maken ons venster zichtbaaar
			
			}
	}
