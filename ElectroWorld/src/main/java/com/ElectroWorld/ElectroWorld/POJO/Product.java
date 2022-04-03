package com.ElectroWorld.ElectroWorld.POJO;

import java.sql.Blob;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="product_table")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int product_id;
	
	@Column(name="product_name",nullable = false,length = 20)
	private String product_name;
	
	@NotEmpty
	private String product_category;
	
	@NotEmpty
	private String product_pricePerQuantity;
	
	@NotEmpty
	private String product_quantity;
	
	@NotEmpty
	private String product_desc;
	
	@Column(name="product_image",columnDefinition = "MEDIUMBLOB")
	@Lob
	private Blob product_image;
	
	/*
	 * @ManyToOne(targetEntity = Vendor.class) private int vendor_id;
	 */
	@ManyToOne(targetEntity = Vendor.class) 
	private Vendor vendor;
	 
	/*
	 * @JoinColumn(name="vendor_id") private Vendor vendor;
	 */

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

	public String getProduct_category() {
		return product_category;
	}

	public void setProduct_category(String product_category) {
		this.product_category = product_category;
	}

	public String getProduct_pricePerQuantity() {
		return product_pricePerQuantity;
	}

	public void setProduct_pricePerQuantity(String product_pricePerQuantity) {
		this.product_pricePerQuantity = product_pricePerQuantity;
	}

	public String getProduct_quantity() {
		return product_quantity;
	}

	public void setProduct_quantity(String product_quantity) {
		this.product_quantity = product_quantity;
	}

	public String getProduct_desc() {
		return product_desc;
	}

	public void setProduct_desc(String product_desc) {
		this.product_desc = product_desc;
	}

	public Blob getImage() {
		return product_image;
	}

	public void setImage(Blob profilePhoto) {
		this.product_image = profilePhoto;
	}

	
	 public Vendor getVendor() { return vendor; }
	 


	/*
	 * public int getVendor() { return vendor_id; }
	 */

	/*
	 * public void setVendor(int vendor_id) { this.vendor_id = vendor_id; }
	 */

	 public void setVendor(Vendor vendor) { this.vendor = vendor; }
	 

	public Product(@NotEmpty String product_name, @NotEmpty String product_category,
			@NotEmpty String product_pricePerQuantity, @NotEmpty String product_quantity, @NotEmpty String product_desc,
			@NotEmpty Blob product_image,Vendor vendor) {
		super();
		
		this.product_name = product_name;
		this.product_category = product_category;
		this.product_pricePerQuantity = product_pricePerQuantity;
		this.product_quantity = product_quantity;
		this.product_desc = product_desc;
		this.product_image = product_image;
		this.vendor = vendor;
	}

	public Product() {
		super();
	}

	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", product_category="
				+ product_category + ", product_pricePerQuantity=" + product_pricePerQuantity + ", product_quantity="
				+ product_quantity + ", product_desc=" + product_desc + ", product_image="
				+ product_image + ", vendor=" + vendor + "]";
	}

	

}
