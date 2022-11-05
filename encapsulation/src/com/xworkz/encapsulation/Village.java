package com.xworkz.encapsulation;

public class Village {
	
	String name = "Maraba";
	String taluk = "Kudligi";
	String district = "Vijayanagara";
	private String villageGod = "Veerabhadreswara";
	double totalArea = 26839;
	long population = 91173;
	int noOfFamilies = 57;
	private long pincode = 583135l;
	public boolean waterFacility;
	public boolean panchayat;
	public String mainPerson;
	
	
	public void setVillageGod(String villageGod) {
		this.villageGod = villageGod;
	}

	public String getVillageGod() {
		return villageGod;
	}
	
	
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public long getPincode() {
		return pincode;
	}
	
	
}	