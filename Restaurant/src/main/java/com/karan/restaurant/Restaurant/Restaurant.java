package com.karan.restaurant.Restaurant;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "restaurant")
public class Restaurant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String city;
	private String address;
	private String crunies;
	private Integer rating;
	
	public Restaurant() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Restaurant(Integer id, String name, String city, String address, String crunies, Integer rating) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.address = address;
		this.crunies = crunies;
		this.rating = rating;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCrunies() {
		return crunies;
	}


	public void setCrunies(String crunies) {
		this.crunies = crunies;
	}


	public Integer getRating() {
		return rating;
	}


	public void setRating(Integer rating) {
		this.rating = rating;
	}
	
	
	
	
	
}
