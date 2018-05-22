package Game;

public class Chrono implements Runnable{
	
	private final int PAUSE = 3; //  pause tijd tussen 2 tijdslussen, gaat ons helepen om venster te kunnen hertekenen, na elke lus 3 milliseconde pause
	

	@Override
	public void run() {
		
		while(true){ // oneindige lus, dus gaat altijd werken
			
			Main.background.repaint(); // na elke gaat lus gaat background hertekent worden
			
			
			try {// voor zou het mislopen (we gaan er van uit van niet)
				Thread.sleep(PAUSE);
			} catch (InterruptedException e) {}
			
		}
		
	}
	

}
