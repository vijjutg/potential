//write a program to count the number of characters in the given string without using length() method.

package codes.xworkz.codingQuestions;

public class CountCharacter {

	public static void main(String[] args) {
		
		String str = "sampleString";
	      int i = 0;
	      for(@SuppressWarnings("unused") char c: str.toCharArray()) {  
	         i++;
	      }
	      System.out.println("Length of the given string : "+i);
	}

}
