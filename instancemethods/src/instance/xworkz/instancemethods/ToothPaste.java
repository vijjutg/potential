package instance.xworkz.instancemethods;

public class ToothPaste {

	public double price;
	public Names names;
	public String brandName;
	public String[] ingredients;
	public int noOfIngredients;
	public boolean[] safe;
	public double[] weights;
	public double quantity;
	public long[] productCodes;
	public int[] noOfPieces;
	public String[] users;

	public ToothPaste(double price, Names names, String brandName, String[] ingredients, int noOfIngredients,
			boolean[] safe, double[] weights, double quantity, long[] productCodes, int[] noOfPieces, String[] users) {

		this.price = price;
		this.names = names;
		this.brandName = brandName;
		this.ingredients = ingredients;
		this.noOfIngredients = noOfIngredients;
		this.safe = safe;
		this.weights = weights;
		this.quantity = quantity;
		this.productCodes = productCodes;
		this.noOfPieces = noOfPieces;
		this.users = users;

	}

	public void display() {

		System.out.println(price);
		System.out.println(brandName);
		System.out.println(noOfIngredients);
		System.out.println(quantity);
		System.out.println(names);

		for (int i = 0; i < this.ingredients.length; i++) {
			String string = this.ingredients[i];
			System.out.println(string);
		}

		for (int i = 0; i < this.safe.length; i++) {
			boolean condition = this.safe[i];
			System.out.println(condition);
		}

		for (int i = 0; i < this.weights.length; i++) {
			double weight = this.weights[i];
			System.out.println(weight);
		}

		for (int i = 0; i < this.productCodes.length; i++) {
			long code = this.productCodes[i];
			System.out.println(code);
		}

		for (int i = 0; i < this.noOfPieces.length; i++) {
			int number = this.noOfPieces[i];
			System.out.println(number);
		}

		for (int i = 0; i < this.users.length; i++) {
			String string = this.users[i];
			System.out.println(string);
		}

	}

}
