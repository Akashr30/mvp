package com.furnitureSale.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Product_list")

public class ProductTable {
	
	@Id
	@GeneratedValue
	@Column(name = "product_id ")
	private int product_id ;
	
	@Column(name = "product_name  ")
	private String product_name  ;
	
	@Column(name = "price  ")
	private int price  ;
	
	@Column(name = "dimensions  ")
	private String dimensions  ;
	
	@Column(name = "image_path  ")
	private String image_path  ;
/*	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id ")
	CategoryTable categorytable;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "brand_id ")
	BrandTable brandtable;*/

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDimensions() {
		return dimensions;
	}

	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}

	public String getImage_path() {
		return image_path;
	}

	public void setImage_path(String image_path) {
		this.image_path = image_path;
	}

	/*public CategoryTable getCategorytable() {
		return categorytable;
	}

	public void setCategorytable(CategoryTable categorytable) {
		this.categorytable = categorytable;
	}

	public BrandTable getBrandtable() {
		return brandtable;
	}

	public void setBrandtable(BrandTable brandtable) {
		this.brandtable = brandtable;
	}*/

}
