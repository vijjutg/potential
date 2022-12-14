// A program to print the below output 
//input -> abcd
//output -> A-Bb-Ccc-Dddd

package codes.xworkz.codingQuestions;

public class PatternProgram {

	public static void main(String[] args) {
		
		String str = "abcd";
		char[] ch = str.toCharArray();
		for (int i=0; i<= ch.length-1; i++)
		{
			if (ch[i]>='a' && ch[i]<='z')
			{
				ch[i] = (char) ((int) ch[i]+32);
				System.out.println(ch[i]);
				if( i >=1)
				{
					for (int j=0; j<i; j++)
					{
						System.out.print(ch[i]);
					}
				}
				System.out.println();
			}
		}
	}
}

