package instance.xworkz.instancemethods;

public class MicroOven {

	public String[] modelNames;
	public String companyOwnername;
	public String brand;
	public String[] colours;
	public String installationType;
	public double[] capacities;
	public double price;
	public double[] widths;
	public double[] weights;
	public int quantity;
	public boolean[] heated;

	public MicroOven(String[] modelNames, String companyOwnername, String brand, String[] colours,
			String installationType, double[] capacities, double price, double[] widths, double[] weights, int quantity,
			boolean[] heated) {

		this.modelNames = modelNames;
		this.companyOwnername = companyOwnername;
		this.brand = brand;
		this.colours = colours;
		this.installationType = installationType;
		this.capacities = capacities;
		this.price = price;
		this.widths = widths;
		this.weights = weights;
		this.quantity = quantity;
		this.heated = heated;

	}

	public void display() {

		System.out.println(companyOwnername);
		System.out.println(brand);
		System.out.println(installationType);
		System.out.println(price);
		System.out.println(quantity);

		for (int i = 0; i < this.modelNames.length; i++) {
			String model = this.modelNames[i];
			System.out.println(model);
		}

		for (int i = 0; i < this.colours.length; i++) {
			String colors = this.colours[i];
			System.out.println(colors);
		}

		for (int i = 0; i < capacities.length; i++) {
			double cabability = capacities[i];
			System.out.println(cabability);
		}

		for (int i = 0; i < this.widths.length; i++) {
			double width = this.widths[i];
			System.out.println(width);
		}

		for (int i = 0; i < this.weights.length; i++) {
			double weight = this.weights[i];
			System.out.println(weight);
		}

		for (int i = 0; i < this.heated.length; i++) {
			boolean isIt = this.heated[i];
			System.out.println(isIt);
		}
	}

}
