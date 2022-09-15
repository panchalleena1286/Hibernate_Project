package com.to;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table
public class Employee {
	
	@Id
	private int empID;
	private String empName;
	private String empDesignation;
	private int empSalary;
	
	
	public Employee() {
		
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int empID, String empName, String empDesignation, int empSalary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.empSalary = empSalary;
	}


	public int getEmpID() {
		return empID;
	}


	public void setEmpID(int empID) {
		this.empID = empID;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmpDesignation() {
		return empDesignation;
	}


	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}


	public int getEmpSalary() {
		return empSalary;
	}


	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}


	@Override
	public String toString() {
		return "EmpID = " + empID + ", empName = " + empName + ", empDesignation = " + empDesignation
				+ ", empSalary = " + empSalary ;
	}
	
	
	
	

}
