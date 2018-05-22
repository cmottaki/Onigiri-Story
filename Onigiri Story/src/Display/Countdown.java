package Display;

public class Countdown implements Runnable{
	
	///***** VARIABELEN *****///
	private final int PAUSE = 1000;
	private int afteller;
	private String str;

	///***** CONSTRUCTOR *****///
	public Countdown(){
		this.afteller = 100;
		this.str = "Overblijvende tijd : 100 ";
		
		Thread countdown = new Thread(this);
		countdown.start();
	}
	
	///***** GETTERS *****///

	public int getAfteller() {return afteller;}

	public String getStr() {return str;}
	
	///***** SETTERS *****///
	
	///***** METHODES *****///
	
	@Override
	public void run() {
		
		while(true){// oneindige lus
			try{Thread.sleep(PAUSE);}
			catch (InterruptedException e){}
			this.afteller --;
			this.str = "Overblijvende tijd : "+ afteller;
		}
	}


}
