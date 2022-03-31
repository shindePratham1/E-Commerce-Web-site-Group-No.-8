package com.example.demo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="vendor")
public class Vendor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	
	private int vendor_id;
	
	@NotEmpty
	private String	vendor_firsatName;
	
	@NotEmpty
	private String	vendor_lastName;
	
	@NotEmpty
	private String	vendor_userName;
	
	@NotEmpty
	private String	vendor_shopName;
	
	@Pattern(regexp="^[0-9]{10}$")
	@Column(unique = true) 
	private String vendor_mobileNo;
	
	@NotEmpty
	private String	vendor_address;
	
	@NotEmpty
	@Size(min = 8)
	private String	vendor_password;
	
	@NotEmpty
	@Email	//it will make sure the entered input is email only
	@Column(unique = true)
	private String	vendor_email;
	
	@NotEmpty
	@Column(unique = true)
	private long vendor_licenseNo;
	
	@NotEmpty
	@Column(unique = true)
	private long vendor_adharCard;
	
	@NotEmpty
	private String	vendor_city;
	
	
	@NotEmpty
	private long vendor_pincode;
	
	
	@OneToMany(mappedBy = "vendor")
	private List<Product> productList;


	public int getVendor_id() {
		return vendor_id;
	}


	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}


	public String getVendor_firsatName() {
		return vendor_firsatName;
	}


	public void setVendor_firsatName(String vendor_firsatName) {
		this.vendor_firsatName = vendor_firsatName;
	}


	public String getVendor_lastName() {
		return vendor_lastName;
	}


	public void setVendor_lastName(String vendor_lastName) {
		this.vendor_lastName = vendor_lastName;
	}


	public String getVendor_userName() {
		return vendor_userName;
	}


	public void setVendor_userName(String vendor_userName) {
		this.vendor_userName = vendor_userName;
	}


	public String getVendor_shopName() {
		return vendor_shopName;
	}


	public void setVendor_shopName(String vendor_shopName) {
		this.vendor_shopName = vendor_shopName;
	}


	public String getVendor_mobileNo() {
		return vendor_mobileNo;
	}


	public void setVendor_mobileNo(String vendor_mobileNo) {
		this.vendor_mobileNo = vendor_mobileNo;
	}


	public String getVendor_address() {
		return vendor_address;
	}


	public void setVendor_address(String vendor_address) {
		this.vendor_address = vendor_address;
	}


	public String getVendor_password() {
		return vendor_password;
	}


	public void setVendor_password(String vendor_password) {
		this.vendor_password = vendor_password;
	}


	public String getVendor_email() {
		return vendor_email;
	}


	public void setVendor_email(String vendor_email) {
		this.vendor_email = vendor_email;
	}


	public long getVendor_licenseNo() {
		return vendor_licenseNo;
	}


	public void setVendor_licenseNo(long vendor_licenseNo) {
		this.vendor_licenseNo = vendor_licenseNo;
	}


	public long getVendor_adharCard() {
		return vendor_adharCard;
	}


	public void setVendor_adharCard(long vendor_adharCard) {
		this.vendor_adharCard = vendor_adharCard;
	}


	public String getVendor_city() {
		return vendor_city;
	}


	public void setVendor_city(String vendor_city) {
		this.vendor_city = vendor_city;
	}


	public long getVendor_pincode() {
		return vendor_pincode;
	}


	public void setVendor_pincode(long vendor_pincode) {
		this.vendor_pincode = vendor_pincode;
	}


	public List<Product> getProductList() {
		return productList;
	}


	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}


	public Vendor(int vendor_id, @NotEmpty String vendor_firsatName, @NotEmpty String vendor_lastName,
			@NotEmpty String vendor_userName, @NotEmpty String vendor_shopName,
			@Pattern(regexp = "^[0-9]{10}$") String vendor_mobileNo, @NotEmpty String vendor_address,
			@NotEmpty @Size(min = 8) String vendor_password, @NotEmpty @Email String vendor_email,
			@NotEmpty long vendor_licenseNo, @NotEmpty long vendor_adharCard, @NotEmpty String vendor_city,
			@NotEmpty long vendor_pincode, List<Product> productList) {
		super();
		this.vendor_id = vendor_id;
		this.vendor_firsatName = vendor_firsatName;
		this.vendor_lastName = vendor_lastName;
		this.vendor_userName = vendor_userName;
		this.vendor_shopName = vendor_shopName;
		this.vendor_mobileNo = vendor_mobileNo;
		this.vendor_address = vendor_address;
		this.vendor_password = vendor_password;
		this.vendor_email = vendor_email;
		this.vendor_licenseNo = vendor_licenseNo;
		this.vendor_adharCard = vendor_adharCard;
		this.vendor_city = vendor_city;
		this.vendor_pincode = vendor_pincode;
		this.productList = productList;
	}


	public Vendor() {
		super();
	}


	@Override
	public String toString() {
		return "Vendor [vendor_id=" + vendor_id + ", vendor_firsatName=" + vendor_firsatName + ", vendor_lastName="
				+ vendor_lastName + ", vendor_userName=" + vendor_userName + ", vendor_shopName=" + vendor_shopName
				+ ", vendor_mobileNo=" + vendor_mobileNo + ", vendor_address=" + vendor_address + ", vendor_password="
				+ vendor_password + ", vendor_email=" + vendor_email + ", vendor_licenseNo=" + vendor_licenseNo
				+ ", vendor_adharCard=" + vendor_adharCard + ", vendor_city=" + vendor_city + ", vendor_pincode="
				+ vendor_pincode + ", productList=" + productList + "]";
	}
	
	
	
	

}