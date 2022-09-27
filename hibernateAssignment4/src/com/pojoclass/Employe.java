package com.pojoclass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity

@Table
public class Employe {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int employe_code;
	private String emp_name;
	private String emp_designation;
	private int emp_DOB;
	private int emp_JOD;
	private int emp_age;
	private int emp_basicpay;
	
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employe(String emp_name, String emp_designation, int emp_DOB, int emp_JOD, int emp_age, int emp_basicpay) {
		super();
		this.emp_name = emp_name;
		this.emp_designation = emp_designation;
		this.emp_DOB = emp_DOB;
		this.emp_JOD = emp_JOD;
		this.emp_age = emp_age;
		this.emp_basicpay = emp_basicpay;
	}

	public int getEmploye_code() {
		return employe_code;
	}

	public void setEmploye_code(int employe_code) {
		this.employe_code = employe_code;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_designation() {
		return emp_designation;
	}

	public void setEmp_designation(String emp_designation) {
		this.emp_designation = emp_designation;
	}

	public int getEmp_DOB() {
		return emp_DOB;
	}

	public void setEmp_DOB(int emp_DOB) {
		this.emp_DOB = emp_DOB;
	}

	public int getEmp_JOD() {
		return emp_JOD;
	}

	public void setEmp_JOD(int emp_JOD) {
		this.emp_JOD = emp_JOD;
	}

	public int getEmp_age() {
		return emp_age;
	}

	public void setEmp_age(int emp_age) {
		this.emp_age = emp_age;
	}

	public int getEmp_basicpay() {
		return emp_basicpay;
	}

	public void setEmp_basicpay(int emp_basicpay) {
		this.emp_basicpay = emp_basicpay;
	}

	@Override
	public String toString() {
		return "Employe_Code = " + employe_code + ", Emp_Name = " + emp_name + ", Emp_Designation = "
				+ emp_designation + ", Emp_DOB = " + emp_DOB + ", Emp_JOD = " + emp_JOD + ", Emp_Age = " + emp_age
				+ ", Emp_BasicPay = " + emp_basicpay;
	}
	
	
	
	
}
