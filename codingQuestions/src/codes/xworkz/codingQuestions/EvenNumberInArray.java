//A program to print and count the even numbers in the array.

package codes.xworkz.codingQuestions;

import java.util.Scanner;

public class EvenNumberInArray {

	public static void main(String[] args) {
		
		int size;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of elements in an array : ");
		size = scan.nextInt();
		int[] array = new int[size];
		System.out.println("Enter " + size + " elements of an array : ");
		for (int i=0; i<size; i++)
		{
			array[i] = scan.nextInt();
		}
		System.out.println("Even number list is : ");
		for (int i=0; i<size; i++)
		{
			if (array[i]%2==0)
			{
				System.out.println(array[i]);
				count++;
			}
		}
		System.out.println("total no of even numbers in this array  : " + count);

	}

}
