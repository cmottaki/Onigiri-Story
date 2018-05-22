/*package Game;
import javax.swing.*;

public class Window extends JFrame{
	
	private JPanel activePanel;
		
	public Window()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Switching Panels");
		this.setLocation(100, 100);//standaard in de hoek van het scherm
		this.setSize(400, 250);	
		activePanel = new MenuPaneel(this);
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
		switchPanel(new MenuPaneel(this));
	}
		

		/**
		 * @param args
		 
	public void main(String[] args)	
	{
		new Window();
	}

}*/


