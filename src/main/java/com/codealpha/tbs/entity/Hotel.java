package com.codealpha.tbs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Hotel {

	@Id
	private long id;
	private String name;
	private String location;
	private Double pricePerNight;
	private Integer availableRooms;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Double getPricePerNight() {
		return pricePerNight;
	}
	public void setPricePerNight(Double pricePerNight) {
		this.pricePerNight = pricePerNight;
	}
	public Integer getAvailableRooms() {
		return availableRooms;
	}
	public void setAvailableRooms(Integer availableRooms) {
		this.availableRooms = availableRooms;
	}
	
	
}
