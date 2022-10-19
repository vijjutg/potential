package instance.xworkz.instancemethods;

public class Fridge {

	public String[] brands;
	public String[] colors;
	public String configuration;
	public double[] heights;
	public double[] weights;
	public double capacity;
	public int[] numberOfDoors;
	public boolean withWheels;
	public long[] fridgeID;
	public double price;
	public int quantity;

	public Fridge(String[] brands, String[] colors, String configuration, double[] heights, double[] weights,
			double capacity, int[] numberOfDoors, boolean withWheels, long[] fridgeID, double price, int quantity) {

		this.brands = brands;
		this.colors = colors;
		this.configuration = configuration;
		this.heights = heights;
		this.weights = weights;
		this.capacity = capacity;
		this.numberOfDoors = numberOfDoors;
		this.withWheels = withWheels;
		this.fridgeID = fridgeID;
		this.price = price;
		this.quantity = quantity;
	}

	public void display() {

		System.out.println("The configuration of the fridge is : " + configuration);
		System.out.println("The capacity of the fridge is : " + capacity);
		System.out.println("Is the fridge with wheels : " + withWheels);
		System.out.println("The price of the fridge is : " + price);
		System.out.println("The quantity of the fridge is : " + quantity);

		for (int i = 0; i < this.brands.length; i++) {
			String string = this.brands[i];
			System.out.println(string);
		}

		for (int j = 0; j < this.colors.length; j++) {
			String string = this.colors[j];
			System.out.println(string);
		}

		for (int i = 0; i < this.heights.length; i++) {
			double hight = this.heights[i];
			System.out.println(hight);
		}

		for (int i = 0; i < this.weights.length; i++) {
			double weight = this.weights[i];
			System.out.println(weight);
		}

		for (int i = 0; i < this.numberOfDoors.length; i++) {
			int doors = this.numberOfDoors[i];
			System.out.println(doors);
		}

		for (int i = 0; i < this.fridgeID.length; i++) {
			long id = this.fridgeID[i];
			System.out.println(id);
		}

	}

}
