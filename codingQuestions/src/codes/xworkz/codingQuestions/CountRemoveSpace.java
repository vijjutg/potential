package codes.xworkz.codingQuestions;

import java.util.Scanner;

public class CountRemoveSpace {

	public static void main(String[] args) {

		String str1 = "Remove white spaces";
		//String s = "";
		//int count = 0;
		

		String  s[]=str1.split(" ");
		
		Scanner sp=new Scanner(System.in);
		String rev=sp.next();
		String name="";
		
		for(int i=0; i<s.length;i++) {
			if(s[i].equals(rev)) {
				char ch[]=rev.toCharArray();
				for(int j=ch.length-1;j>=0;j--)
				{
					name=name+ch[j];
				}
			}
		}
		System.out.println(name);
		
		for(int i=0; i<s.length;i++) {
			if(s[i].equals(rev)) {
				s[i]=name;
			}
			}
		
		for(int i=0; i<s.length;i++) {
			System.out.println(s[i]+" ");
		/*for (char ch : str1.toCharArray()) {
			if (ch == ' ') {
				count += 1; // count=count+1
			} else {
				s += ch; // s=s+ch
			}
		}
		System.out.println("The number of white spaces are : " + count);

		System.out.println("String after removing all the white spaces : " + s);
*/
		
	}
 }
}
