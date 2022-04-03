package com.ElectroWorld.ElectroWorld.POJO;

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
@Table(name="vendor_table")
public class Vendor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	
	private int vendor_id;
	
	@Column(name="vendor_firstName",nullable = false,length = 20)
	private String	vendorFirstName;
	
	@Column(name="vendor_lastName",nullable = false,length = 20)
	private String	vendorLastName;
	
	@Column(name="vendor_userName",nullable = false,length = 20)
	private String	vendorUsername;
	
	@Column(name="vendor_shopName",nullable = false,length = 20)
	private String	vendorShopName;
	
	@Pattern(regexp="^[0-9]{10}$")
	@Column(name="vendor_mobileNo",nullable = false,length = 20)//(unique = true) 
	private String vendorMobileNo;
	
	@Column(name="vendor_address",nullable = false)
	private String	vendorAddress;
	
	@Column(name="vendor_password",nullable = false)
	@Size(min = 8)
	private String	vendorPassword;
	
	@Column(name="vendor_email",nullable = false,length=20)
	@Email	//it will make sure the entered input is email only
	//(unique = true)
	private String	vendorEmail;
	
	
	@Column(name="vendor_licenseNo",nullable = false)
	private String vendorLicenseNo;
	
	
	@Column(name="vendor_adharCard",nullable = false)
	private String vendorAdharCard;
	
	@Column(name="vendor_city",nullable = false)
	private String	vendorCity;
	
	
	@Column(name="vendor_pincode",nullable = false)
	private String vendorPincode;
	
	@OneToMany(mappedBy = "vendor") private List<Product> productList;
	/*
	 * @OneToMany(mappedBy = "vendor") private List<Product> productList;
	 */


	public int getVendor_id() {
		return vendor_id;
	}


	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}


	public String getVendorFirstName() {
		return vendorFirstName;
	}


	public void setVendorFirstName(String vendor_firsatName) {
		this.vendorFirstName = vendor_firsatName;
	}


	public String getVendorLastName() {
		return vendorLastName;
	}


	public void setVendorLastName(String vendor_lastName) {
		this.vendorLastName = vendor_lastName;
	}


	public String getVendorUsername() {
		return vendorUsername;
	}


	public void setVendorUsername(String vendor_userName) {
		this.vendorUsername = vendor_userName;
	}


	public String getVendorShopName() {
		return vendorShopName;
	}


	public void setVendorShopName(String vendor_shopName) {
		this.vendorShopName = vendor_shopName;
	}


	public String getVendor_mobileNo() {
		return vendorMobileNo;
	}


	public void setVendorMobileNo(String vendor_mobileNo) {
		this.vendorMobileNo = vendor_mobileNo;
	}


	public String getVendorAddress() {
		return vendorAddress;
	}


	public void setVendorAddress(String vendor_address) {
		this.vendorAddress = vendor_address;
	}


	public String getVendorPassword() {
		return vendorPassword;
	}


	public void setVendorPassword(String vendor_password) {
		this.vendorPassword = vendor_password;
	}


	public String getVendorEmail() {
		return vendorEmail;
	}


	public void setVendor_email(String vendor_email) {
		this.vendorEmail = vendor_email;
	}


	public String getVendorLicenseNo() {
		return vendorLicenseNo;
	}


	public void setVendorLicenseNo(String vendor_licenseNo) {
		this.vendorLicenseNo = vendor_licenseNo;
	}


	public String getVendorAdharCard() {
		return vendorAdharCard;
	}


	public void setVendorAdharCard(String vendor_adharCard) {
		this.vendorAdharCard = vendor_adharCard;
	}


	public String getVendorCity() {
		return vendorCity;
	}


	public void setVendorCity(String vendor_city) {
		this.vendorCity = vendor_city;
	}


	public String getVendorPincode() {
		return vendorPincode;
	}


	public void setVendorPincode(String vendor_pincode) {
		this.vendorPincode = vendor_pincode;
	}


	public List<Product> getProductList() {
		return productList;
	}


	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}


	public Vendor(int vendor_id, @NotEmpty String vendor_firstName, @NotEmpty String vendor_lastName,
			@NotEmpty String vendor_userName, @NotEmpty String vendor_shopName,
			@Pattern(regexp = "^[0-9]{10}$") String vendor_mobileNo, @NotEmpty String vendor_address,
			@NotEmpty @Size(min = 8) String vendor_password, @NotEmpty @Email String vendor_email,
			@NotEmpty String vendor_licenseNo, @NotEmpty String vendor_adharCard, @NotEmpty String vendor_city,
			@NotEmpty String vendor_pincode, List<Product> productList) {
		super();
		this.vendor_id = vendor_id;
		this.vendorFirstName = vendor_firstName;
		this.vendorLastName = vendor_lastName;
		this.vendorUsername = vendor_userName;
		this.vendorShopName = vendor_shopName;
		this.vendorMobileNo = vendor_mobileNo;
		this.vendorAddress = vendor_address;
		this.vendorPassword = vendor_password;
		this.vendorEmail = vendor_email;
		this.vendorLicenseNo = vendor_licenseNo;
		this.vendorAdharCard = vendor_adharCard;
		this.vendorCity = vendor_city;
		this.vendorPincode = vendor_pincode;
		this.productList = productList;
	}


	public Vendor() {
		super();
	}


	@Override
	public String toString() {
		return "Vendor [vendor_id=" + vendor_id + ", vendor_firstName=" + vendorFirstName + ", vendor_lastName="
				+ vendorLastName + ", vendor_userName=" + vendorUsername + ", vendor_shopName=" + vendorShopName
				+ ", vendor_mobileNo=" + vendorMobileNo + ", vendor_address=" + vendorAddress + ", vendor_password="
				+ vendorPassword + ", vendor_email=" + vendorEmail + ", vendor_licenseNo=" + vendorLicenseNo
				+ ", vendor_adharCard=" + vendorAdharCard + ", vendor_city=" + vendorCity + ", vendor_pincode="
				+ vendorPincode + ", productList=" + productList + "]";
	}
	
	
	
	

}
