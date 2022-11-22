//Write a program that returns a string in which firstname is swapped with last name

package codes.xworkz.codingQuestions;

public class SwapString {

	public static void main(String[] args) {

		String name = "Vijaya lakshmi";
		System.out.println("Before Swap: " + name);
		String firstName = name.substring(0, name.indexOf(" "));
		String lastName = name.substring(name.indexOf(" "));
		String swapName = lastName + " " + firstName;
		System.out.println("After Swap: " + swapName);

	}

}
