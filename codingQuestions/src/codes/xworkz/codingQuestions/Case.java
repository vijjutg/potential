//Write a program to convert lower case to upper case and upper case to lower case. without using built in methods 

package codes.xworkz.codingQuestions;

public class Case {

	public static void main(String[] args) {
		
		String str = "Vijayalakshmi";
		char[] ch = str.toCharArray();
		for (int i=0; i<ch.length; i++) {
			if (ch[i] >='A' && ch[i] <='Z') {
				ch[i] = (char)((int) ch[i]+32);
			}
		}
       System.out.println("The string in lowercase is : ");
       for ( int i=0; i<ch.length; i++) {
    	   System.out.print(ch[i]);
       }
       System.out.println();
       
       for (int i=0; i<ch.length; i++) {
			if (ch[i] >='a' && ch[i] <='z') {
				ch[i] = (char)((int) ch[i]-32);
			}
		}
      System.out.println("The string in Uppercase is : ");
      for ( int i=0; i<ch.length; i++) {
   	   System.out.print(ch[i]);
      }
	}
}
