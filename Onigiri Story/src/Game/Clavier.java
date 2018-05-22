package Game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



public class Clavier implements KeyListener{
	
	@Override
	public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT){
				
				if(Main.background.getxPos() == -1){
					Main.background.setxPos(0);
					Main.background.setxBack1(-50);// er zal een plaatsverschil zijn bij -1 en dit gaan we tegen gaan met deze if
					Main.background.setxBack2(1550);// als onze positie -1 gaan we de positie veranderen naar 0
				}
				Main.background.onigiri.setStap(true);
				Main.background.onigiri.setNaarRechts(true);
				Main.background.setDx(2); // verplaatsing naar links van background als we op rechts drukken
				
			}else if (e.getKeyCode() == KeyEvent.VK_LEFT){
				
				
				if(Main.background.getxPos() == 16601){
					Main.background.setxPos(16600);
					Main.background.setxBack1(0);
					Main.background.setxBack2(1600);
				}
				
				Main.background.onigiri.setStap(true);
				Main.background.onigiri.setNaarRechts(false);
				Main.background.setDx(-2);} // background beweegt naar rechts als we op links drukken
			
			
			// onigiri springt
			if(e.getKeyCode() == KeyEvent.VK_SPACE){
				Main.background.onigiri.setSpring(true);
			}
			
		}
	

	@Override
	public void keyReleased(KeyEvent e) {
		
		Main.background.setDx(0);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {}
	

}
