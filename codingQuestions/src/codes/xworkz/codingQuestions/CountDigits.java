//Count the number of digits in the given number.

package codes.xworkz.codingQuestions;
import java.util.Scanner;	

public class CountDigits {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int count=0;
		System.out.println("Enter a number: ");
        int num = scan.nextInt();
        while(num!=0)
        {
        	num=num/10;
        	count++;
        }
        System.out.println("number of digits in the given number is : "+ count);
	}

}
