package codes.xworkz.codingQuestions;

public class FrequencyOfCharacter {

	public static void main(String[] args) {

		String str = "picture perfect";
		int[] freq = new int[str.length()];
		int i, j;
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

	}

}
