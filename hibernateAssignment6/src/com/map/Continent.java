package com.map;

import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name="continent")
public class Continent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int continentId;
	private String continentName;
	@ElementCollection
	@CollectionTable(name="countryCapitalMapping", joinColumns= @JoinColumn(name="continentId"))
	@Column(name="countryName")
	private Map<String, String> countries;
	
	public int getContinentId() {
		return continentId;
	}
	public void setContinentId(int continentId) {
		this.continentId = continentId;
	}
	public String getContinentName() {
		return continentName;
	}
	public Map<String, String> getCountries() {
		return countries;
	}
	public void setCountries(Map<String, String> countries) {
		this.countries = countries;
	}
	public void setContinentName(String continentName) {
		this.continentName = continentName;
	}
	
	

	
}
