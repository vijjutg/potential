package instance.xworkz.boot;

import instance.xworkz.variables.Sweet;

public class SweetRunner {

	public static void main(String[] args) {
		
		String[] items = {"Shavige", "Milk", "Sugar", "Ghee"};
		
		Sweet sweet = new Sweet(items);
		
		sweet.setPrice(50);
		
		sweet.color = "White";
		
		sweet.display();
		

	}

}
