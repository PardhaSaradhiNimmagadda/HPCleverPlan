package com.bean;

public class ControlBean {
	
	private String id;
	private String brand;
	private int year;
	private String color;
	private int price;
	private boolean soldState;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isSoldState() {
		return soldState;
	}

	public void setSoldState(boolean soldState) {
		this.soldState = soldState;
	}

	public ControlBean(String randomId, String randomBrand, int randomYear,
			String randomColor, int randomPrice, boolean randomSoldState) {
		id=randomId;
		brand=randomBrand;
		year=randomYear;
		color=randomColor;
		price=randomPrice;
		soldState=randomSoldState;
		// TODO Auto-generated constructor stub
	}


}
