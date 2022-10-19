package instance.xworkz.instancemethods;

public class Geyser {

	public String[] brands;
	public double capacity;
	public double[] lengths;
	public double[] weights;
	public double[] heights;
	public String[] colours;
	public int wattage;
	public String material;
	public double[] costs;
	public double time;
	public boolean easyInstallation;

	public Geyser(String[] brands, double capacity, double[] lengths, double[] weights, double[] heights, String[] colours,
			int wattage, String material, double[] costs, double time, boolean easyInstallation) {
		
		this.brands = brands;
		this.capacity = capacity;
		this.lengths = lengths;
		this.weights = weights;
		this.heights = heights;
		this.colours = colours;
		this.wattage = wattage;
		this.material = material;
		this.costs = costs;
		this.time = time;
		this.easyInstallation = easyInstallation;

	}
	
	public void display()
	{
		System.out.println(capacity);
		System.out.println(wattage);
		System.out.println(material);
		System.out.println(time);
		System.out.println(easyInstallation);
		
		for (int i = 0; i < this.brands.length; i++) {
			String string = this.brands[i];
			System.out.println(string);
		}
		
		for (int i = 0; i < this.lengths.length; i++) {
			double len = this.lengths[i];
			System.out.println(len);
		}
		
		for (int i = 0; i < this.weights.length; i++) {
			double weight = this.weights[i];
			System.out.println(weight);
		}
		
		for (int i = 0; i < this.heights.length; i++) {
			double height = this.heights[i];
			System.out.println(height);
		}
		
		for (int i = 0; i < this.colours.length; i++) {
			String color = this.colours[i];
			System.out.println(color);
		}
		
		for (int i = 0; i < this.costs.length; i++) {
			double cost = this.costs[i];
			System.out.println(cost);
		}
	}

}
