package instance.xworkz.boot;

import instance.xworkz.variables.Mango;

public class MangoRunner {

	public static void main(String[] args) {
		
		Mango mango = new Mango(35);
		
		mango.setMeasuringType("Pieces");
		
		mango.riped = true;
		
		mango.show();

	}

}
