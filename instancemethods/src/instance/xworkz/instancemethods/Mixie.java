package instance.xworkz.instancemethods;

public class Mixie {

	public String brand;
	public String[] colors;
	public String[] materials;
	public String bladeMaterial;
	public int[] noOfSpeeds;
	public int volts;
	public int jars;
	public double[] amounts;
	public boolean working;
	public int[] ratings;
	public long[] productCode;

	public Mixie(String brand, String[] colors, String[] materials, String bladeMaterial, int[] noOfSpeeds, int volts,
			int jars, double[] amounts, boolean working, int[] ratings, long[] productCode) {

		this.brand = brand;
		this.colors = colors;
		this.materials = materials;
		this.bladeMaterial = bladeMaterial;
		this.noOfSpeeds = noOfSpeeds;
		this.volts = volts;
		this.jars = jars;
		this.amounts = amounts;
		this.working = working;
		this.ratings = ratings;
		this.productCode = productCode;

	}
	
	public void display() {
		
		System.out.println(brand);
		System.out.println(bladeMaterial);
		System.out.println(volts);
		System.out.println(jars);
		System.out.println(working);
		
		for (int i = 0; i < this.colors.length; i++) {
			String color = this.colors[i];
			System.out.println(color);
		}
		
		for (int i = 0; i < this.materials.length; i++) {
			String material = this.materials[i];
			System.out.println(material);
		}
		
		for (int i = 0; i < this.noOfSpeeds.length; i++) {
			int  speed = this.noOfSpeeds[i];
			System.out.println(speed);
		}
		
		for (int i = 0; i < this.amounts.length; i++) {
			double cost = this.amounts[i];
			System.out.println(cost);
		}
		
		for (int i = 0; i < this.ratings.length; i++) {
			int star = this.ratings[i];
			System.out.println(star);
		}
		
		for (int i = 0; i < this.productCode.length; i++) {
			long code = this.productCode[i];
			System.out.println(code);
		}
		
	}

}
