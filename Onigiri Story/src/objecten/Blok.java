package objecten;

import javax.swing.ImageIcon;

public class Blok extends Object{
	
	///***** VARIABELEN *****///
	
	
	///***** CONSTRUCTOR *****///
	public Blok(int x, int y){
		
		super(x, y, 75, 76);// 75, 76 dimensies van blok(blijven altijd dezelfde) //halen uit superklasse object
		super.icoObject = new ImageIcon(getClass().getResource("/images/blok.png"));
		super.imgObject = this.icoObject.getImage();
		
	}

	///***** GETTERS *****///
	
	///***** SETTERS *****///
	
	///***** METHODES *****///

}


