package com.xworkz.boot;

import com.xworkz.encapsulation.Product;
import com.xworkz.encapsulation.SuperMarket;

public class SuperMarketRunner {

	public static void main(String[] args) {

		Product item = new Product();

		item.display();

		SuperMarket market2 = new SuperMarket();

		market2.setProductCode(77666768l);

		market2.setShopNo(72);
		
		System.out.println(market2.getProductCode());
		
		System.out.println(market2.getShopNo());

		market2.maxNoOfItems = 87;

		market2.shopFruits = true;

		market2.specialDiscountItem = "Vegetables";

		System.out.println(market2.maxNoOfItems);

		System.out.println(market2.shopFruits);

		System.out.println(market2.specialDiscountItem);

	}

}
