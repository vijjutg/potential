package instance.xworkz.instancemethods;

public class Home {

	public String homeName;
	public String[] nameOfMembers;
	public int noOfChildren;
	public int noOfAdults;
	public double price;
	public String[] nameOfChildren;
	public String[] nameOfAdults;
	public int noOfRooms;
	public int[] ageOfChildren;
	public double[] hieghtOfAdults;
	public double[] weightOfChildren;

	public Home(String homeName, String[] nameOfMembers, int noOfChildren, int noOfAdults, double price,
			String[] nameOfChildren, String[] nameOfAdults, int noOfRooms, int[] ageOfChildren, double[] hieghtOfAdults,
			double[] weightOfChildren) {

		this.homeName = homeName;
		this.nameOfMembers = nameOfMembers;
		this.noOfChildren = noOfChildren;
		this.noOfAdults = noOfAdults;
		this.price = price;
		this.nameOfChildren = nameOfChildren;
		this.nameOfAdults = nameOfAdults;
		this.noOfRooms = noOfRooms;
		this.ageOfChildren = ageOfChildren;
		this.hieghtOfAdults = hieghtOfAdults;
		this.weightOfChildren = weightOfChildren;

	}

	public void display() {

		System.out.println(homeName);
		System.out.println(noOfChildren);
		System.out.println(noOfAdults);
		System.out.println(price);
		System.out.println(noOfRooms);

		for (int i = 0; i < this.nameOfMembers.length; i++) {
			String name = this.nameOfMembers[i];
			System.out.println(name);
		}

		for (int i = 0; i < this.nameOfChildren.length; i++) {
			String name = this.nameOfChildren[i];
			System.out.println(name);
		}

		for (int i = 0; i < this.nameOfAdults.length; i++) {
			String name = this.nameOfAdults[i];
			System.out.println(name);
		}

		for (int i = 0; i < this.ageOfChildren.length; i++) {
			int age = this.ageOfChildren[i];
			System.out.println(age);
		}

		for (int i = 0; i < this.hieghtOfAdults.length; i++) {
			double height = this.hieghtOfAdults[i];
			System.out.println(height);
		}

		for (int i = 0; i < this.weightOfChildren.length; i++) {
			double weight = this.weightOfChildren[i];
			System.out.println(weight);
		}

	}

}
