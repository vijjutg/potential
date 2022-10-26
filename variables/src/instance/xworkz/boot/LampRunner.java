package instance.xworkz.boot;

import instance.xworkz.variables.Lamp;

public class LampRunner {

	public static void main(String[] args) {
		
		Lamp lamp = new Lamp("Red");
		
		lamp.setPrice(350);
		
		lamp.isOn = false;
		
		lamp.display();

	}

}
