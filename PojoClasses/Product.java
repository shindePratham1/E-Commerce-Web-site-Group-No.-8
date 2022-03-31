package com.example.demo.entity;




import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int product_id;
	
	@NotEmpty
	private String product_name;
	
	@NotEmpty
	private String product_category;
	
	@NotEmpty
	private int product_pricePerQuantity;
	
	@NotEmpty
	private int product_quantity;
	
	@NotEmpty
	private String product_desc;
	
	@Lob
	@NotEmpty
	private byte[]  product_image;
	
	@ManyToOne
	@JoinColumn(name="vendor_id")
	private Vendor vendor;

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

	public int getProduct_pricePerQuantity() {
		return product_pricePerQuantity;
	}

	public void setProduct_pricePerQuantity(int product_pricePerQuantity) {
		this.product_pricePerQuantity = product_pricePerQuantity;
	}

	public int getProduct_quantity() {
		return product_quantity;
	}

	public void setProduct_quantity(int product_quantity) {
		this.product_quantity = product_quantity;
	}

	public String getProduct_desc() {
		return product_desc;
	}

	public void setProduct_desc(String product_desc) {
		this.product_desc = product_desc;
	}

	public byte[] getProduct_image() {
		return product_image;
	}

	public void setProduct_image(byte[] product_image) {
		this.product_image = product_image;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public Product(int product_id, @NotEmpty String product_name, @NotEmpty String product_category,
			@NotEmpty int product_pricePerQuantity, @NotEmpty int product_quantity, @NotEmpty String product_desc,
			@NotEmpty byte[] product_image, Vendor vendor) {
		super();
		this.product_id = product_id;
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
				+ Arrays.toString(product_image) + ", vendor=" + vendor + "]";
	}

	

}
