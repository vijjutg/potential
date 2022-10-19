package instance.xworkz.boot;

import instance.xworkz.instancemethods.Colors;
import instance.xworkz.instancemethods.Tablet;

public class TabletRunner {

	public static void main(String[] args) {
		
		String[] parts = {"Chemicals", "water"};
		String[] factories = {"Bharath Chemicals", "Indian Chemicals"};
		boolean[] prob = {true, true, false};
		String[] store = {"Medical shop", "Hospital", "Generals"};
		String[] avail = {"Tablet", "Syrup"};
		
		Tablet tablet = new Tablet("Cold",'s',0.23,450,true,Colors.GREEN,parts,factories,prob,store,avail);
		
		tablet.display();

	}

}
