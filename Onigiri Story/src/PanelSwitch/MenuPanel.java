package PanelSwitch;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MenuPanel extends JPanel implements ActionListener
{
	
	private JButton playKnop,infoKnop,quitKnop;
	private Image img;
	private Venster mainVenster;
	
	public MenuPanel(Venster mainVenster) 
	{
		this.mainVenster = mainVenster;
		playKnop = new JButton("Play");
		playKnop.addActionListener(this);
		
		quitKnop = new JButton("Quit");
		quitKnop.addActionListener(this);
		
		infoKnop = new JButton("Info");
		infoKnop.addActionListener(this);
		
		this.add(playKnop);
		this.add(quitKnop);
		this.add(infoKnop);
		
		img = new ImageIcon(getClass().getResource("/images/Menu.png")).getImage();
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	}

	
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource() == playKnop){
			mainVenster.switchPanel(new PlayPanel(mainVenster));
		}//else if(ae.getSource() == infoKnop){
			//mainVenster.switchPanel(new infoKnop));
		//}
		
	}

}
