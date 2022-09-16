package com.to;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employe {
	
	@Id
	private int employe_Id;
	private String employe_Name;
	private String employe_Band;
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employe(int employe_Id, String employe_Name, String employe_Band) {
		super();
		this.employe_Id = employe_Id;
		this.employe_Name = employe_Name;
		this.employe_Band = employe_Band;
	}

	public int getEmploye_Id() {
		return employe_Id;
	}

	public void setEmploye_Id(int employe_Id) {
		this.employe_Id = employe_Id;
	}

	public String getEmploye_Name() {
		return employe_Name;
	}

	public void setEmploye_Name(String employe_Name) {
		this.employe_Name = employe_Name;
	}

	public String getEmploye_Band() {
		return employe_Band;
	}

	public void setEmploye_Band(String employe_Band) {
		this.employe_Band = employe_Band;
	}

	@Override
	public String toString() {
		return "employe_Id =  " + employe_Id + ", employe_Name =  " + employe_Name + ", employe_Band =  " + employe_Band;
	}
	
	
	
	

}
