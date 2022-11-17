//A program to count the number of vowels and consonants in given string

package codes.xworkz.codingQuestions;

public class VowelsConsonants {

	public static void main(String[] args) {
		
		int vCount = 0;
		int cCount = 0;
		String str = "This is a really simple sentence";
		str = str.toLowerCase();
		for (int i=0; i<str.length(); i++)
		{
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == '0' || str.charAt(i) == 'u')
			{
				vCount++;
			}
			else  if(str.charAt(i)>='a' && str.charAt(i)<'z')
			{
				cCount++;
			}
		}
		System.out.println("Number of vowels : " + vCount);
		System.out.println("Number of consonants : " + cCount);

	}

}
