//A program to find second largest element in a given array

package codes.xworkz.codingQuestions;

public class SecondLargest {
	
	public static int getSecondLargest(int[] a, int total)
	{
		int temp;
		for (int i=1; i<total; i++)
		{
			for (int j=i+1; j<total; j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total-2];
	}

	public static void main(String[] args) {
		
		int a[] = {1, 2, 3, 4, 6, 3, 2};
		System.out.println("Second largest " + getSecondLargest(a,6));

	}

}
