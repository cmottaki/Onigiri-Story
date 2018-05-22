package objecten;

import javax.swing.ImageIcon;

public class Vaas extends Object{
	
	///***** VARIABELEN *****///

	
	///***** CONSTRUCTOR *****///
	public Vaas(int x, int y){
		
		super(x, y, 207, 188);// 207, 188   dimensies van vaas(blijven altijd dezelfde)
		super.icoObject = new ImageIcon(getClass().getResource("/images/vaas.png"));
		super.imgObject = this.icoObject.getImage();
		
	}

	///***** GETTERS *****///
	
	///***** SETTERS *****///
	
	///***** METHODES *****///

}
