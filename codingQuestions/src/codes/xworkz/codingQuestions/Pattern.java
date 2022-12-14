package codes.xworkz.codingQuestions;

public class Pattern {

	public static void main(String[] args) {
		
		int n= 4;
		
		for (int i=1; i<=n; i++)   // i=rows   
		{
			for(int j=n-1; j>=i; j--)   // j=spaces
			{
				System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++) {
				System.out.print("* ");  // k=columns
			} 
			System.out.println("");
		}

	}

}
