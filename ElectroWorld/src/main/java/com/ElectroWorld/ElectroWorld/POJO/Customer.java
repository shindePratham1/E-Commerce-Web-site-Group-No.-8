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
@Table(name="customer_table")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int	customer_id ;

	@Column(name="customer_firstname",nullable = false,length = 20)
	private String customerFirstName ;

	@Column(name="customer_lastname",nullable = false,length = 20)
	private String customerLastName ;

	@Column(name="customer_username",nullable = false,length = 20)
	private String customerUsername ;

	@Column(name="customer_password",nullable = false,length = 20)
	@Size(min = 8)
	private String customerPassword ;

	@Column(name="customer_address",nullable = false,length = 20)
	private String customerAddress ;

	@Pattern(regexp="^[0-9]{10}$")
	@Column(name="customer_mobileNo",nullable = false,length = 20)//(unique = true)
	private String customerMobileNo ;

	@NotEmpty
	@Email	//it will make sure the entered input is email only
	@Column(name="customer_email",nullable = false,length = 20)//(unique = true)
	private String customerEmail ;

	@Column(name="customer_city",nullable = false,length = 20)
	private String customerCity ;

	@Column(name="customer_pincode",nullable = false,length = 20)
	private String customerPincode ;

	/*
	 * @OneToMany(mappedBy = "cust") private List<Feedback> feedbackList;
	 */
	@OneToMany(targetEntity =Feedback.class) 
	private List<Feedback> feedbackList;

	@OneToMany(targetEntity =Orders.class)
	private List<Orders> ordersList;

	//without parametrized constuctor
	public Customer() {

	}
	public Customer(String customer_firstName, String customer_lastname, String customer_username,
			String customer_password, String customer_address, String customer_mob_no, String customer_email,
			String customer_city,  String customer_pincode) {


		this.customerFirstName = customer_firstName;
		this.customerLastName = customer_lastname;
		this.customerUsername = customer_username;
		this.customerPassword = customer_password;
		this.customerAddress = customer_address;
		this.customerMobileNo = customer_mob_no;
		this.customerEmail = customer_email;
		this.customerCity = customer_city;
		this.customerPincode = customer_pincode;
	}

	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomerFirstName() {
		return customerFirstName;
	}
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}
	public String getCustomerLastName() {
		return customerLastName;
	}
	public void setCustomerLastName(String customerLastname) {
		this.customerLastName = customerLastname;
	}
	public String getCustomerUsername() {
		return customerUsername;
	}
	public void setCustomerUsername(String customer_username) {
		this.customerUsername = customer_username;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomer_password(String customer_password) {
		this.customerPassword = customer_password;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customer_address) {
		this.customerAddress = customer_address;
	}
	public String getCustomerMobileNo() {
		return customerMobileNo;
	}
	public void setCustomerMobileNo(String customer_mobileNo) {
		this.customerMobileNo = customer_mobileNo;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customer_email) {
		this.customerEmail = customer_email;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customer_city) {
		this.customerCity = customer_city;
	}
	public String getCustomerPincode() {
		return customerPincode;
	}
	public void setCustomer_pincode(String customer_pincode) {
		this.customerPincode = customer_pincode;
	}




}


