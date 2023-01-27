package codes.xworkz.codingQuestions;

public class FlowerPetals {
	
	public static boolean isTrue(int numOfPetals1, int numOfPetals2) {
		boolean result = false;
		if ((numOfPetals1 % 2 == 0 && numOfPetals2 % 2 != 0) || (numOfPetals1 % 2 != 0 && numOfPetals2 % 2 == 0) ){
			result = true;
		}
		else {
			result = false;
		}
	return result;
		
	}

	public static void main(String[] args) {
		
		boolean flower = isTrue(23,34);
		System.out.println("They are in love : " + flower);

	}

}
