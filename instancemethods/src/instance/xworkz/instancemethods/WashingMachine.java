package instance.xworkz.instancemethods;

public class WashingMachine {

	public String[] brands;
	public String[] accessLocations;
	public String[] colors;
	public String humanInterface;
	public int voltage;
	public String displayType;
	public double[] price;
	public double[] weights;
	public boolean runs;
	public int[] stars;
	public Rate rating;

	public WashingMachine(String[] brands, String[] accessLocations, String[] colors, String humanInterface, int voltage,
			String displayType, double[] price, double[] weights, boolean runs, int[] stars, Rate rating) {
		
		this.brands = brands;
		this.accessLocations = accessLocations;
		this.colors = colors;
		this.humanInterface = humanInterface;
		this.voltage = voltage;
		this.displayType = displayType;
		this.price = price;
		this.weights = weights;
		this.runs = runs;
		this.stars = stars;
		this.rating = rating;

	}
	
	public void display() {
		
		System.out.println(humanInterface);
		System.out.println(voltage);
		System.out.println(displayType);
		System.out.println(runs);
		System.out.println(rating);
		
		for (int i = 0; i < this.brands.length; i++) {
			String string = this.brands[i];
			System.out.println(string);
		}
		
		for (int i = 0; i < accessLocations.length; i++) {
			String string = accessLocations[i];
			System.out.println(string);
		}
		
		for (int i = 0; i < this.colors.length; i++) {
			String string = this.colors[i];
			System.out.println(string);
		}
		
		for (int i = 0; i < this.price.length; i++) {
			double cost = this.price[i];
			System.out.println(cost);
		}
		
		for (int i = 0; i < this.weights.length; i++) {
			double weight = this.weights[i];
			System.out.println(weight);
		}
		
		for (int i = 0; i < this.stars.length; i++) {
			int star = this.stars[i];
			System.out.println(star);
		}
	}

}
