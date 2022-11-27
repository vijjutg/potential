package com.xworkz.string;

public class StringMethods {
	
	public static char onliDigits(char[] ch, int num) {
		for (int i=0; i<num; i++ )
		{
			if  (ch[i]<'0' || ch[i]>'9') {
				return ch[i];
			}
		}
		return ' ';
	}


	public static void main(String[] args) {
		
		String str = "Triple Riding is a romantic action entertainer movie directed by Mahesh Gowda. The movie casts Ganesh1, Megha Shetty2, Rachana Inder3, and Aditi Prabhudeva4 in the main lead roles along with Sadhu Kokila, Kuri Pratap, Ravishankar, Rangayana Raghu, Shobaraj, Sharath Lohitashwa, and many others have seen in supporting roles.";
		
		String[] str1 = str.split(" ");
		
		for(int i=0; i<str1.length; i++) {
			System.out.println(str1[i]);
		}
		System.out.println("------------------------------------------------------------------");
		
		int count = 0;
		char[] str2 = str.toCharArray();
		
		for(int i=0; i<str2.length; i++) {
			if(str2[i] == 'r' || str2[i] == 'R') { 
				count++;
			}
		}
		System.out.println("Number of R in given string : "+ count);
		System.out.println("------------------------------------------------------------------");
		
		int len = str.length();
		System.out.println(onliDigits(str2,len));
		
		System.out.println("-------------------------------------------------------------------");
		
		String[] str3 = str.split("i");
		
		for(int i=0; i<str3.length; i++) {
			System.out.println(str3[i]);
		}
		System.out.println("------------------------------------------------------------------");
		
		for(int i=0; i<str2.length; i++) {
			System.out.println("chars at index : " + i + " is : " + str2[i]);
		}
		System.out.println("-----------------------------------------------------------");
		
		String str4 = str.toUpperCase();
		System.out.println("Upper case : "+ str4);
		System.out.println("-------------------------------------------------------------");
		
		String str5 = str.toLowerCase();
		System.out.println("Lower case : "+ str5);
		System.out.println("-------------------------------------------------------------");
		
		int i, j;
		int[] freq = new int[str.length()];
		char String[] = str.toCharArray();
		for (i = 0; i < str.length(); i++) {
			freq[i] = 1;
			for (j = i + 1; j < str.length(); j++) {
				if (String[i] == String[j]) {
					freq[i]++;
					String[j] = 'o';
				}
			}
		}
		System.out.println("Characters and their corresponding fruequencies ");
		for (i=0; i<freq.length; i++)
		{
			if (String[i]!=' ' && String[i]!='o')
				System.out.println(String[i] + " - " + freq[i]);
		}
		System.out.println("----------------------------------------------------------");
		
		
		String reversestr = "";
		for(i=0; i<str1.length; i++) {
			int length = str1[i].length();
			for ( j = length - 1; j >=0; --i) {
			      reversestr = reversestr + str1[i].charAt(j);
			    }
			if (str1[i].toLowerCase().equals(reversestr.toLowerCase())) {
			      System.out.println(str1 [i]+ " is a Palindrome String.");
			    }
			    else {
			      System.out.println(str1[i] + " is not a Palindrome String.");
			    }
		}
		
	}

}
