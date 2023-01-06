package com.xworkz.pizza.dto;

import java.io.Serializable;

import com.xworkz.pizza.constant.Type;

public class WeaponDto implements Serializable, Comparable<WeaponDto> {

	private String name;
	private String madeBy;
	private String madeOn;
	private double price;
	private Type type;

	public WeaponDto() {

	}

	public WeaponDto(String name, String madeBy, String madeOn, double price, Type type) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.madeOn = madeOn;
		this.price = price;
		this.type = type;
	}

	@Override
	public String toString() {
		return "WeaponDto [name=" + name + ", madeBy=" + madeBy + ", madeOn=" + madeOn + ", price=" + price + ", type="
				+ type + "]";
	}

	@Override
	public int hashCode() {
		return 56;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			if (obj instanceof WeaponDto) {
				WeaponDto weaponDto = (WeaponDto) obj;
				{
					if (weaponDto.name.equals(this.name) && (weaponDto.type.equals(this.type))) {
						return true;
					}
				}
			}
		}

		return false;
	}
	
	@Override
	public int compareTo(WeaponDto o) {
		return this.madeBy.compareTo(o.madeBy);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public String getMadeOn() {
		return madeOn;
	}

	public void setMadeOn(String madeOn) {
		this.madeOn = madeOn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

}
