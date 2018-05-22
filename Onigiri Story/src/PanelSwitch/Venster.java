package PanelSwitch;

import javax.swing.*;

public class Venster extends JFrame
{
	private JPanel activePanel;
	
	public Venster()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Onigiri Story");
		this.setLocation(100, 100);//standaard in de hoek van het scherm
		this.setSize(400, 250);	
		activePanel = new MenuPanel(this);
		this.add(activePanel);
		this.setVisible(true);
	}
	
	public void switchPanel(JPanel toActivate)
	{
		this.remove(activePanel);
		activePanel = toActivate;
		this.add(activePanel);	
		
		validate();
		repaint();
	}
	
	public void switchPanel()
	{
		switchPanel(new MenuPanel(this));
	}
	

	// @param args
	 
	public static void main(String[] args)	
	{
		new Venster();
	}

}
