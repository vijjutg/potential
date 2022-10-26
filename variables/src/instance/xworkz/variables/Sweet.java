package instance.xworkz.variables;

public class Sweet {

	public static String name;
	public double price;
	public int quantity = 30;
	public String color;
	public String[] ingredients;

	public Sweet(String[] ingredients) {
		this.ingredients = ingredients;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void display() {
		System.out.println("The name of the sweet is : " + name);
		System.out.println("The price of the sweet is : " + this.price);
		System.out.println("The quantity of the sweet is : " + this.quantity);
		System.out.println("The color of the sweet is : " + this.color);

		for (int i = 0; i < ingredients.length; i++) {
			String string = ingredients[i];
			System.out.println("The ingredients of the sweet is : " + string);
		}
	}

	static {
		name = "Shavige paysa";
	}

}
