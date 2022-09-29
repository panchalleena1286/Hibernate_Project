package com.to;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity(name="Car")
@Table(name = "car")
public class Car {
	@Id
	private int  Id;
	private String RegNo;
	private String Model;
	private String Color;
	private String Manufacture;
	private int Price;
	
	
	public String getRegNo() {
		return RegNo;
	}

	public void setRegNo(String regNo) {
		RegNo = regNo;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getManufacture() {
		return Manufacture;
	}

	public void setManufacture(String manufacture) {
		Manufacture = manufacture;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	

	public int getId() { 
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
	
	
	
}
