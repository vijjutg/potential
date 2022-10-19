package instance.xworkz.instancemethods;

public class Hotel {

	public String hotelName;
	public String[] tiffinNames;
	public String[] lunchItems;
	public String[] serverNames;
	public int[] noOfTablesToServe;
	public int[] noOfVisitors;
	public double[] bills;
	public boolean teaIsThere;
	public boolean coffeeIsThere;
	public String ownerName;
	public boolean orderOnline;

	public Hotel(String hotelName, String[] tiffinNames, String[] lunchItems, String[] serverNames,
			int[] noOfTablesToServe, int[] noOfVisitors, double[] bills, boolean teaIsThere, boolean coffeeIsThere,
			String ownerName, boolean orderOnline) {

		this.hotelName = hotelName;
		this.tiffinNames = tiffinNames;
		this.lunchItems = lunchItems;
		this.serverNames = serverNames;
		this.noOfTablesToServe = noOfTablesToServe;
		this.noOfVisitors = noOfVisitors;
		this.bills = bills;
		this.teaIsThere = teaIsThere;
		this.coffeeIsThere = coffeeIsThere;
		this.ownerName = ownerName;
		this.orderOnline = orderOnline;

	}

	public void display() {

		System.out.println(hotelName);
		System.out.println(teaIsThere);
		System.out.println(coffeeIsThere);
		System.out.println(ownerName);
		System.out.println(orderOnline);

		for (int i = 0; i < this.bills.length; i++) {
			double bill = this.bills[i];
			System.out.println(bill);
		}

		for (int i = 0; i < this.tiffinNames.length; i++) {
			String names = this.tiffinNames[i];
			System.out.println(names);
		}

		for (int i = 0; i < this.lunchItems.length; i++) {
			String names = this.lunchItems[i];
			System.out.println(names);
		}

		for (int i = 0; i < this.serverNames.length; i++) {
			String names = this.serverNames[i];
			System.out.println(names);
		}

		for (int i = 0; i < this.noOfTablesToServe.length; i++) {
			int number = this.noOfTablesToServe[i];
			System.out.println(number);
		}

		for (int i = 0; i < this.noOfVisitors.length; i++) {
			int number = this.noOfVisitors[i];
			System.out.println(number);
		}

	}

}
