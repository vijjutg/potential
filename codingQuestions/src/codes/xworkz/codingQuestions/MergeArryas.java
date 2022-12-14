package codes.xworkz.codingQuestions;

public class MergeArryas {

	public static void main(String[] args) {

		int[] firstArray = { 23, 45, 12, 78, 4, 90, 1 };
		int[] secondArray = { 77, 11, 45, 88, 32, 56, 3 };

		int[] result = new int[firstArray.length + secondArray.length];

		for (int i = 0; i < firstArray.length; i++) {
			result[i] = firstArray[i];
		}

		int count = result.length - firstArray.length;

		for (int j = 0; j < secondArray.length; j++) {
			result[count] = secondArray[j];
			count++;

		}

		for (int k = 0; k < result.length; k++) {
			System.out.println(result[k]);
		}

	}
}
