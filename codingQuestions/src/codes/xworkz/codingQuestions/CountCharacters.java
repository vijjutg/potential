//Program to count the number of characters in the given string without using length() method

package codes.xworkz.codingQuestions;

public class CountCharacters {

	public static void main(String[] args) {
		
		int length = 0;
		String str = "Vijayalakshmi";
		for (@SuppressWarnings("unused") char c1 : str.toCharArray())
			length++;
		System.out.println("Length of string is : "+ length);

	}

}
