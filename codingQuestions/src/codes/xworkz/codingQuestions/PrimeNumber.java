//A program to check whether given number is prime number or not.

package codes.xworkz.codingQuestions;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int num = 69;
		boolean flag = false;
		for (int i=2; i<=num/2; ++i)
		{
			if(num%i==0)
			{
				flag = true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println(num + " is a prime number ");
		}
		else
		{
			System.out.println(num + " is  not a prime number");
		}
	}

}
