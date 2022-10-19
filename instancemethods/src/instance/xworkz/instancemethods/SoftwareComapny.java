package instance.xworkz.instancemethods;

public class SoftwareComapny {

	public String companyName;
	public String ownerName;
	public int noOfTechnicalStaff;
	public int noOfNonTechnicalStaff;
	public double investment;
	public String[] nameOfTechnicalStaff;
	public Position positions;
	public double[] packages;
	public String[] nameOfNonTechnicalStaff;
	public int[] noOfTeams;
	public int[] ratings;
	public boolean[] goodFacility;

	public SoftwareComapny(String companyName, String ownerName, int noOfTechnicalStaff, int noOfNonTechnicalStaff,
			double investment, String[] nameOfTechnicalStaff, Position positions, double[] packages,
			String[] nameOfNonTechnicalStaff, int[] noOfTeams, int[] ratings, boolean[] goodFacility) {

		this.companyName = companyName;
		this.ownerName = ownerName;
		this.noOfTechnicalStaff = noOfTechnicalStaff;
		this.noOfNonTechnicalStaff = noOfNonTechnicalStaff;
		this.investment = investment;
		this.nameOfTechnicalStaff = nameOfTechnicalStaff;
		this.positions = positions;
		this.packages = packages;
		this.nameOfNonTechnicalStaff = nameOfNonTechnicalStaff;
		this.noOfTeams = noOfTeams;
		this.ratings = ratings;
		this.goodFacility = goodFacility;

	}

	public void display() {
		
		System.out.println(companyName);
		System.out.println(ownerName);
		System.out.println(noOfTechnicalStaff);
		System.out.println(noOfNonTechnicalStaff);
		System.out.println(investment);
		System.out.println(positions);
		
		for (int i = 0; i < this.nameOfTechnicalStaff.length; i++) {
			String names = this.nameOfTechnicalStaff[i];
			System.out.println(names);
		}
		
		for (int i = 0; i < this.packages.length; i++) {
			double salary = this.packages[i];
			System.out.println(salary);
		}
		
		for (int i = 0; i < this.nameOfNonTechnicalStaff.length; i++) {
			String names = this.nameOfNonTechnicalStaff[i];
			System.out.println(names);
		}
		
		for (int i = 0; i < this.noOfTeams.length; i++) {
			int number = this.noOfTeams[i];
			System.out.println(number);
		}
		
		for (int i = 0; i < this.ratings.length; i++) {
			int stars = this.ratings[i];
			System.out.println(stars);
		}
		
		for (int i = 0; i < goodFacility.length; i++) {
			boolean b = goodFacility[i];
			System.out.println(b);
		}

	}

}
