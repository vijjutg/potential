//A program to find duplicate element in an given array

package codes.xworkz.codingQuestions;

public class DuplicteElement {

	public static void main(String[] args) {
		
		int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 8, 3};
		System.out.println("Duplicate elements in given array : ");
		for (int i=0; i<array.length; i++) {
			for (int j=i+1; j<array.length; j++) {
				if (array[i] == array[j]) {
					System.out.println(array[j]);	
				}
			}
		}

	}

}
