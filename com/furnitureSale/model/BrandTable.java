package com.furnitureSale.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Brand_list")

public class BrandTable {
	@Id
	@GeneratedValue
	@Column(name="(brand_id ")
	private int brand_id ;
	
	@Column(name="brand_name ")
	private String brand_name ;

	public int getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(int brand_id) {
		this.brand_id = brand_id;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

}
