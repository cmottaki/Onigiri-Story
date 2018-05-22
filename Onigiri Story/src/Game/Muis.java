
package Game;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Muis implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		int mx = e.getX(); // mx waarde neemt e waarde: get() => returns x waarde vd muis
		int my = e.getY(); // returns y-waarde van de muis
		
		/*g2.drawRect(645,240,180,80); 
		g2.drawRect(645,340,180,80); 
		g2.drawRect(645,440,180,80);*/
		
		//StartKnop
		if(mx >= 645 && mx <= 825){ //645 + breedte = 645 + 180 = 825
			if(my >= 240 && my <= 320){//240 + hoogte = 240+80 = 320
				//Gedrukt op StartKnop
				
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

}
