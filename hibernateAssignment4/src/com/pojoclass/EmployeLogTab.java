package com.pojoclass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table
public class EmployeLogTab {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int employe_code;
	private String emp_name;
	private String emp_designation;
	private int emp_lastdrawnsalary;
	private int emp_leavingdate;
	
	public EmployeLogTab() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeLogTab(String emp_name, String emp_designation, int emp_lastdrawnsalary,
			int emp_leavingdate) {
		super();
		
		this.emp_name = emp_name;
		this.emp_designation = emp_designation;
		this.emp_lastdrawnsalary = emp_lastdrawnsalary;
		this.emp_leavingdate = emp_leavingdate;
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

	public int getEmp_lastdrawnsalary() {
		return emp_lastdrawnsalary;
	}

	public void setEmp_lastdrawnsalary(int emp_lastdrawnsalary) {
		this.emp_lastdrawnsalary = emp_lastdrawnsalary;
	}

	public int getEmp_leavingdate() {
		return emp_leavingdate;
	}

	public void setEmp_leavingdate(int emp_leavingdate) {
		this.emp_leavingdate = emp_leavingdate;
	}

	@Override
	public String toString() {
		return "Employe_Code = " + employe_code + ", Emp_Name = " + emp_name + ", Emp_Designation = "
				+ emp_designation + ", Emp_LastDrawnSalary = " + emp_lastdrawnsalary + ", Emp_LeavingDate = "
				+ emp_leavingdate;
	}
	
	
	
	

}
