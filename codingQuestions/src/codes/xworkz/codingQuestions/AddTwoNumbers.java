//Add two numbers without using + operator.

package codes.xworkz.codingQuestions;

public class AddTwoNumbers {
	
	public static int add(int x, int y)
	{
		int carry;
		while(y!=0)
		{
			carry = x&y;
			x = x^y;
			y = carry<<1;
		}
		return x;
	}

}
