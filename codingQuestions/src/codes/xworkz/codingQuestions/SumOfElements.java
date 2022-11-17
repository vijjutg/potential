//A program to get the sum of all elements in a given array

package codes.xworkz.codingQuestions;

public class SumOfElements {
	
	static int array[] = {12, 3, 4, 15};
	static int sum()
	{
		int sum = 0;
		int i;
		for(i=0; i<array.length; i++)
			sum=sum+array[i];
		return sum;
	}

	public static void main(String[] args) {
		
		System.out.println("Sum of given array is : "+ sum());

	}

}
