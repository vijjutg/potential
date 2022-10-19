package instance.xworkz.instancemethods;

public class Tablet {

	public String type;
	public char size;
	public double width;
	public int capacity;
	public boolean isSafe;
	public Colors colors;
	public String[] ingredients;
	public String[] companies;
	public boolean[] cure;
	public String[] availability;
	public String[] forms;

	public Tablet(String type, char size, double width, int capacity, boolean isSafe, Colors colors,
			String[] ingredients, String[] companies, boolean[] cure, String[] availability, String[] forms) {

		this.type = type;
		this.size = size;
		this.width = width;
		this.capacity = capacity;
		this.isSafe = isSafe;
		this.colors = colors;
		this.ingredients = ingredients;
		this.companies = companies;
		this.cure = cure;
		this.availability = availability;
		this.forms = forms;

	}

	public void display() {
		System.out.println(type);
		System.out.println(size);
		System.out.println(width);
		System.out.println(capacity);
		System.out.println(isSafe);
		System.out.println(colors);

		for (int i = 0; i < this.ingredients.length; i++) {
			String string = this.ingredients[i];
			System.out.println(string);
		}

		for (int i = 0; i < this.companies.length; i++) {
			String string = this.companies[i];
			System.out.println(string);
		}

		for (int i = 0; i < this.cure.length; i++) {
			boolean probability = this.cure[i];
			System.out.println(probability);
		}

		for (int i = 0; i < availability.length; i++) {
			String string = availability[i];
			System.out.println(string);
		}

		for (int i = 0; i < this.forms.length; i++) {
			String takenAs = this.forms[i];
			System.out.println(takenAs);
		}
	}

}
