package instance.xworkz.instancemethods;

public class Hospital {

	public String hospitalName;
	public boolean isGood;
	public int noOfStaff;
	public int noOfWards;
	public double investment;
	public char[] grades;
	public String[] doctorsName;
	public String[] diseiesNames;
	public double[] patientsBill;
	public int[] noOfGuards;
	public long[] patientsMobileNo;

	public Hospital(String hospitalName, boolean isGood, int noOfStaff, int noOfWards, double investment, char[] grades,
			String[] doctorsName, String[] diseiesNames, double[] patientsBill, int[] noOfGuards,
			long[] patientsMobileNo) {
		this.hospitalName = hospitalName;
		this.isGood = isGood;
		this.noOfStaff = noOfStaff;
		this.noOfWards = noOfWards;
		this.investment = investment;
		this.grades = grades;
		this.doctorsName = doctorsName;
		this.diseiesNames = diseiesNames;
		this.patientsBill = patientsBill;
		this.noOfGuards = noOfGuards;
		this.patientsMobileNo = patientsMobileNo;
		System.out.println("Entered the hospital constructor...");
	}

	public void display() {
		System.out.println("The name of the hospital is : " + hospitalName);
		System.out.println("The status of the hospital is : " + isGood);
		System.out.println("The number of staffs in the hospital is : " + noOfStaff);
		System.out.println("The number of wards in the hospital is : " + noOfWards);
		System.out.println("The investment of the hospital is : " + investment);

		for (int i = 0; i < this.grades.length; i++) {
			char string = this.grades[i];
			System.out.println("The grades of the hospital are : " + string);
		}

		for (int i = 0; i < this.doctorsName.length; i++) {
			String string = this.doctorsName[i];
			System.out.println("The name of doctor : " + string);
		}

		for (int i = 0; i < this.diseiesNames.length; i++) {
			String string = this.diseiesNames[i];
			System.out.println("The name of diseise is : " + string);
		}

		for (int i = 0; i < this.patientsBill.length; i++) {
			double bill = this.patientsBill[i];
			System.out.println("The bill of patient is : " + bill);
		}

		for (int i = 0; i < this.noOfGuards.length; i++) {
			int guard = this.noOfGuards[i];
			System.out.println("The number of guards of patient is : " + guard);
		}

		for (int i = 0; i < this.patientsMobileNo.length; i++) {
			long no = this.patientsMobileNo[i];
			System.out.println("The number of patient is : " + no);
		}
	}

}
