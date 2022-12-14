package com.javacourse.project.hibernateAndJpa.Entities;
import javax.persistence.*;

@Entity

@Table(name="city")
public class City {
	
	@Id
	@Column(name="ID")
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="CountryCode")

	private String countryCode;
	
	@Column(name="district")

	private String district;
	
	@Column(name="population")

	private int population;
	public City(int iD, String name, String countryCode, String district, int population) {
		id = iD;
		this.name = name;
		this.countryCode = countryCode;
		this.district = district;
		this.population = population;
	}
	
	
	
	
	public City() {
	}




	public int getID() {
		return id;
	}
	public void setID(int iD) {
		id = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	
	

}
