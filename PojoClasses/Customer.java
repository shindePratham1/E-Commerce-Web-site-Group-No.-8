package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int	customer_id ;
	
	@NotEmpty
	private String	customer_firstName ;
	
	@NotEmpty
	private String	customer_lastname ;
	
	@NotEmpty
	private String	customer_username ;
	
	@NotEmpty
	@Size(min = 8)
	private String	customer_password ;
	
	@NotEmpty
	private String	customer_address ;
	
	@Pattern(regexp="^[0-9]{10}$")
	@Column(unique = true)
	private String	customer_mob_no ;
	
	@NotEmpty
	@Email	//it will make sure the entered input is email only
	@Column(unique = true)
	private String	customer_email ;
	
	@NotEmpty
	private String	customer_city ;
	
	@NotEmpty
	private long	customer_pincode ;
	
	
	
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_firstName() {
		return customer_firstName;
	}
	public void setCustomer_firstName(String customer_firstName) {
		this.customer_firstName = customer_firstName;
	}
	public String getCustomer_lastname() {
		return customer_lastname;
	}
	public void setCustomer_lastname(String customer_lastname) {
		this.customer_lastname = customer_lastname;
	}
	public String getCustomer_username() {
		return customer_username;
	}
	public void setCustomer_username(String customer_username) {
		this.customer_username = customer_username;
	}
	public String getCustomer_password() {
		return customer_password;
	}
	public void setCustomer_password(String customer_password) {
		this.customer_password = customer_password;
	}
	public String getCustomer_address() {
		return customer_address;
	}
	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}
	public String getCustomer_mob_no() {
		return customer_mob_no;
	}
	public void setCustomer_mob_no(String customer_mob_no) {
		this.customer_mob_no = customer_mob_no;
	}
	public String getCustomer_email() {
		return customer_email;
	}
	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}
	public String getCustomer_city() {
		return customer_city;
	}
	public void setCustomer_city(String customer_city) {
		this.customer_city = customer_city;
	}
	public long getCustomer_pincode() {
		return customer_pincode;
	}
	public void setCustomer_pincode(int customer_pincode) {
		this.customer_pincode = customer_pincode;
	}
	
	public Customer(int customer_id, String customer_firstName, String customer_lastname, String customer_username,
			String customer_password, String customer_address, String customer_mob_no, String customer_email,
			String customer_city, long customer_pincode) {
		super();
		this.customer_id = customer_id;
		this.customer_firstName = customer_firstName;
		this.customer_lastname = customer_lastname;
		this.customer_username = customer_username;
		this.customer_password = customer_password;
		this.customer_address = customer_address;
		this.customer_mob_no = customer_mob_no;
		this.customer_email = customer_email;
		this.customer_city = customer_city;
		this.customer_pincode = customer_pincode;
	}
	
	public Customer() {
		
	}


}
