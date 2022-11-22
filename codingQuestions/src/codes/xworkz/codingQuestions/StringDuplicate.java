//A program to remove all duplicates from a given string.

package codes.xworkz.codingQuestions;

import java.util.Arrays;

public class StringDuplicate {

	static String removeDuplicate(char[] str, int num) {
		int index = 0;
		for (int i = 0; i < num; i++) {
			int j;
			for ( j = 0; j<i; j++) {
				if (str[i] == str[j]) {
					break;
				}
			}
			if (j == i) {
				str[index++] = str[i];
			}
		}
		return String.valueOf(Arrays.copyOf(str,index));
	}

	public static void main(String[] args) {
		
		char[] str = "Vijayalakshmi".toCharArray();
		int num = str.length;
		System.out.println(removeDuplicate(str, num));

	}

}
