//A program to find the largest element in a given array

package codes.xworkz.codingQuestions;

public class LargestElement {

	public static void main(String[] args) {
		int[] array = new int[] {25, 11, 7, 75, 56};
		int max = array[0];
		for (int i=0; i<array.length; i++)
		{
			if (array[i]>max)
				max= array[i];
		}
		System.out.println("Largest elements present in given array : " + max);

	}

}
