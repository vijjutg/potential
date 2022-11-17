/*A program to print
 1 2 3 4 5
 1 2 3 4
 1 2 3
 1 2
 1
 */

package codes.xworkz.codingQuestions;

public class PrintNumbers {

	public static void main(String[] args) {
		
		int count =1;
		for (int i=0; i<=5; i++)
		{
			for (int j=5; j<=i; j--) {
				System.out.print(count);
				count++;
			}
			System.out.println();
		}

	}

}
