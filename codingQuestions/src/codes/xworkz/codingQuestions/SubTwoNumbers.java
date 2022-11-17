package codes.xworkz.codingQuestions;

public class SubTwoNumbers {
	
	public static int substract(int x, int y)
	{
		int borrow;
		while(y!=0)
		{
			borrow = (~x)&y;
			x = x^y;
			y = borrow<<1;
		}
		return x;
	}

}
