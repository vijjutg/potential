//A program to print N*N matrix

package codes.xworkz.codingQuestions;

import java.util.Scanner;

public class NMatrix {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Input a number : ");
		int number = scan.nextInt();
		printMatrix(number);
	}
	public static void printMatrix(int number) {
		for (int i=0; i<number; i++) {
			for (int j=0; j<number; j++) {
				System.out.print((int)(Math.random()*2) + "  ");
			}
			System.out.println();
		}
	}

}
