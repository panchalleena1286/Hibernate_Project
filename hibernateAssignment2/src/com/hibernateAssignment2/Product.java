package com.hibernateAssignment2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int product_Id;
	private String product_Name;
	private int product_Price;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Product(String product_Name, int product_Price) {
		super();
		this.product_Name = product_Name;
		this.product_Price = product_Price;
	}



	public int getProduct_Id() {
		return product_Id;
	}

	public void setProduct_Id(int product_Id) {
		this.product_Id = product_Id;
	}

	public String getProduct_Name() {
		return product_Name;
	}

	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}

	public int getProduct_Price() {
		return product_Price;
	}

	public void setProduct_Price(int product_Price) {
		this.product_Price = product_Price;
	}

	@Override
	public String toString() {
		return "product_Id = " + product_Id + ", product_Name = " + product_Name + ", product_Price = "
				+ product_Price;
	}
	
	
	

}
