// Find a square root of a given number without using built in methods

package codes.xworkz.codingQuestions;

public class SquareRoot {
	
	static double square (double n, double i, double j)
	{
		double mid = (i+j)/2;
		double mul = mid*mid;
		if((mul == n) || (Math.abs(mul-n)<0.0001))
			return mid;
		else if (mul<n)
			return square (n, mid, j);
		else 
			return square (n,i,mid);
	}
	
	static void findSqrt (double n)
	{
		double i = 0;
		boolean found = false;
		while(!found)
		{
			if(i*i == n)
			{
				System.out.println(i);
				found = true;
			}
			else if (i*i>n)
			{
				double res = square (n,i-1,i);
				System.out.println(res);
				found = true;
			}
			i++;
		}
	}

	public static void main(String[] args) {		
		
		double n = 5;
		findSqrt(n);

	}
}
