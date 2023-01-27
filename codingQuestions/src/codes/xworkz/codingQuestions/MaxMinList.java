package codes.xworkz.codingQuestions;

public class MaxMinList {

	public static int maximum(int[] numbers) {
		int max = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		return max;
	}
	
	public static int minimum(int[] numbers) {
		int min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {

		int[] integers = { 45, 333, 76, 29, 900, 23, 474, 654, 29, 454 };

		int maxResult = maximum(integers);
		System.out.println("Maximum number is : " + maxResult);
		
		int minResult = minimum(integers);
		System.out.println("Minimum number is : " + minResult);

	}

}
