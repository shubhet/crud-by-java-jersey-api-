package com.practice.JerseyIntegration.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


import org.hibernate.annotations.Columns;
@Entity
public class Student {
	
	
	@Id
	private int id;
	@Column
	private String name;
	@Column
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	
	
	

}
