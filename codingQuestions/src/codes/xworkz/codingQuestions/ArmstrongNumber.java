package codes.xworkz.codingQuestions;

import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber {

	static boolean isArmstrong(int n) {
		int temp;
		int digits = 0;
		int last = 0;
		int sum = 0;
		temp = n;
		while (temp > 0) {
			temp = temp / 10;
			digits++;
		}
		temp = n;
		while (temp > 0) {
			last = temp % 10;
			sum = (int) (sum + (Math.pow(last, digits)));
			temp = temp / 10;
		}
		if (n == sum) {
			System.out.println("Number is Armstrong");
			return true;
		}
		else {
			System.out.println("Number is not Armstrong");
			return false;
		}
	}
	public static void main(String[] args) {
		
		int num;
		Scanner scan = new Scanner (System.in);
		System.out.println("enter the limit : ");
		num = scan.nextInt();
		isArmstrong(num);
	}

}
