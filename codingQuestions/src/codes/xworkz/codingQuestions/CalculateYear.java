/* Function takes two arguments : 
 * current fathers name age (years)
 * current age of his son 
 * Calculate how many years ago the father was twice as old as his son (or in how many years he will be twice as old)
 * The answer is always greater or equal to 0, no matter if it was in the past or it is in the future */

package codes.xworkz.codingQuestions;

public class CalculateYear {

	public static int TwiceAsOld(int dadYears, int sonYears) {
		int dadYearsTemp = dadYears;
		int years = 0;
		int yearsAgo = 0;
		for (int i = 0; i <= dadYears; i++) {
			if (dadYearsTemp / 2 == sonYears) {
				
				years = dadYearsTemp;
				yearsAgo = dadYears - years;
				System.out.println(yearsAgo);
				return yearsAgo;
			}
			else if (sonYears * 2 > dadYears) {
				years = (sonYears * 2) - dadYears;
				System.out.println(years);
				return years;
			}
			dadYearsTemp = dadYearsTemp-1;
		}
		return dadYearsTemp;
	}

	public static void main(String[] args) {
		
		int res = TwiceAsOld(48,22);
		System.out.println(res);

	}

}
