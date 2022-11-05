package com.xworkz.encapsulation;

public class SuperMarket {

	String name = "More";
	String owner = "Goutham";
	String location = "Rajajinagara";
	int noOfFloors = 4;
	double visitingPrice = 10;
	int noOfVisitors = 250;
	public boolean shopFruits;
	public int maxNoOfItems;
	public String specialDiscountItem;
	private long productCode = 86756454678l;
	private int shopNo = 75;

	public void setProductCode(long productCode) {
		this.productCode = productCode;
	}

	public long getProductCode() {
		return productCode;
	}

	public void setShopNo(int shopNo) {
		this.shopNo = shopNo;
	}

	public long getShopNo() {
		return shopNo;
	}

}
