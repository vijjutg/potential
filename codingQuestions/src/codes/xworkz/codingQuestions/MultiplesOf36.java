package codes.xworkz.codingQuestions;

public class MultiplesOf36 {

	public static void main(String[] args) {
		
		int[] array = { 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i=0; i<array.length-1; i++)
		{
			if (array[i]%3==0 && array[i]%6==0)
			{
				System.out.println(array[i]);
			}
		}

	}

}
