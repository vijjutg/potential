//Given an array of integers, return a new array with each value doubled.

package codes.xworkz.codingQuestions;

public class Array {
	public static void main(String[] args) {
		int[] array = {1,2,3};
		for (int i=0;i<=array.length-1;i++)
		{
			array[i] = 2 * array[i];
			System.out.println(array[i]);
		}
	}

}
