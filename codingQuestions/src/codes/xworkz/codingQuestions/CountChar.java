package codes.xworkz.codingQuestions;

public class CountChar {

	public static void main(String[] args) {
		
	    String str = "Muttu";
	    char[] c = str.toCharArray();
		int count = 0;
		for (int i=0; i<=c.length-1; i++) {
				count++;
		}
		System.out.println("The length of string is : "+ 
				count);
	}

}
