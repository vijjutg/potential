package codes.xworkz.codingQuestions;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int first = 12;
		int second = 24;
		System.out.println("Before swap : ");
		System.out.println("First number : "+ first);
		System.out.println("Second number : "+ second);
		int temp = first;
		first = second;
		second = temp;
		System.out.println("After swap : ");
		System.out.println("First number : "+ first);
		System.out.println("Second number : "+ second);

	}

}
