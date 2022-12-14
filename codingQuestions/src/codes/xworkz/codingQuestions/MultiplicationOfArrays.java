//Write a program to get the multiplication of a given matrix.

package codes.xworkz.codingQuestions;

public class MultiplicationOfArrays {

	public static void main(String[] args) {
		
		int a[][] = { {1, 1, 1}, {2, 2, 2}, {3, 3, 3} };
		int b[][] = { {1, 1, 1}, {2, 2, 2}, {3, 3, 3} };
		int c[][] = new int[3][3];
		
		for (int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++)
			{
				c[i][j] = 0;
				for (int k=0; k<3; k++) 
				{
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
