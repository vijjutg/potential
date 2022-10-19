package instance.xworkz.boot;

import instance.xworkz.instancemethods.Names;
import instance.xworkz.instancemethods.ToothPaste;

public class ToothPasteRunner {

	public static void main(String[] args) {

		String[] items = { "Salt", "Clove", "Sodium Fluoride" };

		boolean[] probability = { true, true, true };

		double[] weightInGram = { 25, 50, 100 };
		
		long[] codes = {9274028l, 97380190l, 98272190l};
		
		int[] number = {3, 6, 10};
		
		String[] usedBy = { "Madhura", "Nisha", "Prajwal"};
		
		ToothPaste toothPaste = new ToothPaste(50, Names.CLOSE_UP,"Unilever",items, 8, probability, weightInGram, 10, codes, number, usedBy);
		
		toothPaste.display();

	}

}
