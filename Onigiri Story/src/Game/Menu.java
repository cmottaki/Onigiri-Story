/*package Game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.*;
import javax.swing.*;


@SuppressWarnings("serial")
public class Menu extends JPanel implements ActionListener{
	
	private ImageIcon icoMenu;
	private Image imgMenu;
	
	//private JTextField inputVeld;
	//private JButton okKnop;
	private JButton StartKnop, InfoKnop, QuitKnop;
	
	//private JTextArea outputVeld;

	public Menu(){
		
		//inputVeld = new JTextField(20);
		//okKnop = new JButton("OK");
				
				
		StartKnop = new JButton("START");
		StartKnop.addActionListener(this);
				
		InfoKnop = new JButton("INFO");
		InfoKnop.addActionListener(this);
				
		QuitKnop = new JButton("QUIT");
		QuitKnop.addActionListener(this);
		
				
		//outputVeld = new JTextArea(1,1);
				
		//veldjes toevoegen aan de GUI
		//this.add(new JLabel("Name: "));
		//this.add(inputVeld);
		//this.add(okKnop);
		this.add(StartKnop);
		this.add(InfoKnop);
		this.add(QuitKnop);
		
		
		
		//achtergrond menu
		icoMenu = new ImageIcon(getClass().getResource("/images/Menu.png"));
		this.imgMenu = this.icoMenu.getImage();
		
}
	 
	@Override
	public void actionPerformed(ActionEvent e) {
		
		 if(e.getActionCommand().equals("START")){
		        // ga naar GameState als speler op start drukt
			 	
			 
		    }
		    else if(e.getActionCommand().equals("INFO")){
		        // doe ... als speler op info drukt 
		        
		    	
		    	
		    }
		    else if(e.getActionCommand().equals("QUIT")){
		        // doe ... als speler op info drukt 
		        //dan moet die een file lezen mss? met info erop, of nieuwe frame maken met info
		    	
		    }
	}

	
	public void paintComponent(Graphics g)	{
		super.paintComponent(g);
		Graphics g2 = (Graphics2D)g;
		
		g2.drawImage(this.imgMenu,0,0, null);// tekenen van de Menu-achtergrond
		Font fnt0 = new Font("arial",Font.BOLD,50); //tekst 'onigiri story' op menuframe
		g2.setFont(fnt0);
		g2.setColor(Color.white);
		g2.drawString("ONIGIRI STORY", 550 , 100); 
		
		//g2.drawRect(645,240,180,80); //rechthoek voor startknop
		//g2.drawRect(645,340,180,80); //rechthoek voor infoknop
		//g2.drawRect(645,440,180,80); //rechthoek voor quitknop
		
		//g2.setColor(Color.white);
		//g2.drawString("START", 650, 300); //tekst startknop
		//g2.drawString("INFO", 670, 400); //tekst infoknop
		//g2.drawString("QUIT", 670, 500); //tekst quitknop
	}
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Onigiri Story <3");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//sluiten van programe op X
		frame.setSize(1500, 940);// dimensies van het venster
		frame.setLocationRelativeTo(null);// venster komt in het midden van ons scherm
		frame.setAlwaysOnTop(true);// bij openen van spel komt boven al de andere vensters
	    
		JPanel hoofdpaneel = new Menu(); //maak menupaneel aan
		frame.add(hoofdpaneel);
		
		frame.setVisible(true); //venster wordt geactiveerd

	}
}

	
*/

