/*A program "Jack really likes his number five: the trick here is that you have multiply each number by
5 raised to the number of digits of each numbers , so, for example
multiply(3) == 15 // 3*5^1
multiply(10) == 250 // 10*5^2
 multiply(200) == 25000 // 200*5^3 */


package codes.xworkz.codingQuestions;

public class Jack {

	public static void main(String[] args) {
		
		int num = 200;
		int temp = num;
		int count = 0;
		while (num > 0) {
			num = num/10;
			count++;
		}
		System.out.println(((int) Math.pow(5,count)) * temp);

	}

}
