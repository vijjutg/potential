package codes.xworkz.codingQuestions;

public class PatternTest {

	public static void main(String[] args) {

		int n = 6;

		for (int i = 0; i < 4; i++) {
			System.out.print("*   ");
		}
		System.out.println();
		for (int i = 0; i <= n; i++) {
			System.out.print("* ");
		}
		System.out.println();
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 3; i++) {
				System.out.print("*     ");
			}
			System.out.println();
		}
		for (int i = 0; i <= n; i++) {
			System.out.print("* ");
		}
	}

}
