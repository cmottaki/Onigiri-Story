package PanelSwitch;

import java.awt.event.*;
import javax.swing.*;

public class PlayPanel extends JPanel implements ActionListener
{

	private JButton quitKnop;
	private Venster mainVenster;
	
	public PlayPanel(Venster mainVenster)
	{
		this.mainVenster = mainVenster;
		
		quitKnop = new JButton("Quit");
		quitKnop.addActionListener(this);		


		this.add(new JLabel("We are playing ... "));
		this.add(quitKnop);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource() == quitKnop)
		{
			mainVenster.switchPanel();
		}
		
	}

}
