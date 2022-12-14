package codes.xworkz.codingQuestions;
	
	public class ThirdLargestInArrayExample{  
		
		public static void main(String[] args) {
			
			int[] array = {2,37,23,12,6};
			
			int temp;
			
			for (int i=0; i<array.length; i++) {
				
				for (int j=i+1; j<array.length; j++) { 
					
					if(array[i] > array[j]) {
						
						temp = array[i];
						array[i] = array[j];
						array[j] = temp;
						
					}
				}
			}
			System.out.println("The third largest element is : "+ array[array.length-3]);
		}
	
	}
