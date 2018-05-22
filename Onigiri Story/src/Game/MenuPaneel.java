/*package Game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuPaneel extends JPanel implements ActionListener{
	
	private ImageIcon icoMenu;
	private Image imgMenu;

	private final String BACKGROUND_PATH = "comic.png";
		
	private JButton playKnop,infoKnop, highScoreKnop, quitKnop;
	private Window mainWindow;
		
		public MenuPaneel(Window mainVenster) 
		{
			this.mainWindow = mainVenster;
			playKnop = new JButton("Play");
			playKnop.addActionListener(this);
			quitKnop = new JButton("Quit");
			highScoreKnop = new JButton("High Scores");
			
			this.add(playKnop);
			this.add(quitKnop);
			this.add(highScoreKnop);
			
			icoMenu = new ImageIcon(getClass().getResource("/images/Menu.png"));
		}
		
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			Graphics g2 = (Graphics2D)g;
			
			g2.drawImage(this.imgMenu,0,0, null);// tekenen van de Menu-achtergrond
			Font fnt0 = new Font("arial",Font.BOLD,50); //tekst 'onigiri story' op menuframe
			g2.setFont(fnt0);
			g2.setColor(Color.white);
			g2.drawString("ONIGIRI STORY", 550 , 100); 
		}

		
		public void actionPerformed(ActionEvent ae)
		{
			if (ae.getSource() == playKnop)
			{
				mainWindow.switchPanel(new GameState(mainWindow));
			}
			
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
	}*/


