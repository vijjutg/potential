//How do you check if a string contains only digits 

package codes.xworkz.codingQuestions;

public class StringDigit {

	public static boolean onliDigits(String str, int num) {
		for (int i = 0; i < num; i++) {
			if (str.charAt(i) < '0' || str.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		String str = "1a234";
		int len = str.length();
		System.out.println(onliDigits(str,len));
	}
}
