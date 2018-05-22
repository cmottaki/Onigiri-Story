package Display;

public class Score {
	
	///***** VARIABELEN *****///
	private final int Totaal_Munten = 10;
	private int AantalMunten;
	
	///***** CONSTRUCTOR *****///
	public Score(){
		this.AantalMunten = 0; // in begin van spel is deze waarde nul
	}

	///***** GETTERS *****///

	public int getAantalMunten() {return AantalMunten;}

	public int getTotaal_Munten() {return Totaal_Munten;}
	
	///***** SETTERS *****///

	public void setAantalMunten(int aantalMunten) {AantalMunten = aantalMunten;}


}
