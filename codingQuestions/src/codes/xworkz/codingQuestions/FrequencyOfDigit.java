package codes.xworkz.codingQuestions;

public class FrequencyOfDigit {
	
	public static int frequency(int number, int digit)
	{
		int freq = 0;
		while(number!=0)
		{
			if(number%10 == digit)
				freq++;
			number = number/10;
		}
		return freq;
	}

}
