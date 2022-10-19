package instance.xworkz.instancemethods;

public class Forest {

	public String name;
	public double totalArea;
	public String type;
	public String region;
	public int totalAnimals;
	public String[] primaryAnimals;
	public String[] birds;
	public String[] vegAnimals;
	public String[] nonVegAnimals;
	public String[] underWaterAnimals;
	public int[] noOfVisitors;

	public Forest(String name, double totalArea, String type, String region, int totalAnimals, String[] primaryAnimals,
			String[] birds, String[] vegAnimals, String[] nonVegAnimals, String[] underWaterAnimals, int[] noOfVisitors) {
		this.name = name;
		this.totalArea = totalArea;
		this.type = type;
		this.region = region;
		this.totalAnimals = totalAnimals;
		this.primaryAnimals = primaryAnimals;
		this.birds = birds;
		this.vegAnimals = vegAnimals;
		this.nonVegAnimals = nonVegAnimals;
		this.underWaterAnimals = underWaterAnimals;
		this.noOfVisitors = noOfVisitors;
		System.out.println("Entered Forest constructor...");
	}

	public void display() {
		System.out.println("The name of the forest : " + name);
		System.out.println("The total area of the forest : " + totalArea);
		System.out.println("The type of the forest : " + type);
		System.out.println("The region of the forest : " + region);
		System.out.println("The total animals of the forest : " + totalAnimals);

		for (int i = 0; i < this.primaryAnimals.length; i++) {
			String string = this.primaryAnimals[i];
			System.out.println("The primary animal is : " + string);
		}

		for (int i = 0; i < this.birds.length; i++) {
			String string = this.birds[i];
			System.out.println("The bird name is : " + string);
		}

		for (int i = 0; i < this.vegAnimals.length; i++) {
			String string = this.vegAnimals[i];
			System.out.println("The veg animal is : " + string);
		}

		for (int i = 0; i < this.nonVegAnimals.length; i++) {
			String string = this.nonVegAnimals[i];
			System.out.println("The non veg animal is : " + string);
		}

		for (int i = 0; i < this.underWaterAnimals.length; i++) {
			String string = this.underWaterAnimals[i];
			System.out.println("The under water animal is : " + string);
		}
		
		for (int i = 0; i < this.noOfVisitors.length; i++) {
			int number = this.noOfVisitors[i];
			System.out.println("The number of visitors is : " + number);
		}
	}

}
