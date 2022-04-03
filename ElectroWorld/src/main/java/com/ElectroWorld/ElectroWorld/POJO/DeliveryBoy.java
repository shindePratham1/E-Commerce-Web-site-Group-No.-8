package com.ElectroWorld.ElectroWorld.POJO;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="deliveryboy_table")
public class DeliveryBoy {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int delivery_boy_id;
	
	@NotEmpty
	private String delivery_boy_firstName;
	
	@NotEmpty
	private String delivery_boy_lastName;
	
	@NotEmpty
	private String delivery_boy_userName;
	
	@NotEmpty
	@Size(min = 8)
	private String delivery_boy_password;
	
	@Pattern(regexp="^[0-9]{10}$")
	@Column//(unique = true) 
	private String  delivery_boy_mobileNo;
	
	@NotEmpty
	private String delivery_boy_address;
	
	@NotEmpty
	private String 	delivery_boy_city;
	
	@NotEmpty
	private String  delivery_boy_pincode;
	
	@OneToMany(mappedBy = "orders")
	private List<Orders> OrdersList;

	public int getDelivery_boy_id() {
		return delivery_boy_id;
	}

	public void setDelivery_boy_id(int delivery_boy_id) {
		this.delivery_boy_id = delivery_boy_id;
	}

	public String getDelivery_boy_firstName() {
		return delivery_boy_firstName;
	}

	public void setDelivery_boy_firstName(String delivery_boy_firstName) {
		this.delivery_boy_firstName = delivery_boy_firstName;
	}

	public String getDelivery_boy_lastName() {
		return delivery_boy_lastName;
	}

	public void setDelivery_boy_lastName(String delivery_boy_lastName) {
		this.delivery_boy_lastName = delivery_boy_lastName;
	}

	public String getDelivery_boy_userName() {
		return delivery_boy_userName;
	}

	public void setDelivery_boy_userName(String delivery_boy_userName) {
		this.delivery_boy_userName = delivery_boy_userName;
	}

	public String getDelivery_boy_password() {
		return delivery_boy_password;
	}

	public void setDelivery_boy_password(String delivery_boy_password) {
		this.delivery_boy_password = delivery_boy_password;
	}

	public String getDelivery_boy_mobileNo() {
		return delivery_boy_mobileNo;
	}

	public void setDelivery_boy_mobileNo(String delivery_boy_mobileNo) {
		this.delivery_boy_mobileNo = delivery_boy_mobileNo;
	}

	public String getDelivery_boy_address() {
		return delivery_boy_address;
	}

	public void setDelivery_boy_address(String delivery_boy_address) {
		this.delivery_boy_address = delivery_boy_address;
	}

	public String getDelivery_boy_city() {
		return delivery_boy_city;
	}

	public void setDelivery_boy_city(String delivery_boy_city) {
		this.delivery_boy_city = delivery_boy_city;
	}

	public String getDelivery_boy_pincode() {
		return delivery_boy_pincode;
	}

	public void setDelivery_boy_pincode(String delivery_boy_pincode) {
		this.delivery_boy_pincode = delivery_boy_pincode;
	}

	public List<Orders> getOrdersList() {
		return OrdersList;
	}

	public void setOrdersList(List<Orders> ordersList) {
		OrdersList = ordersList;
	}

	public DeliveryBoy(@NotEmpty String delivery_boy_firstName,
			@NotEmpty String delivery_boy_lastName, @NotEmpty String delivery_boy_userName,
			@NotEmpty @Size(min = 8) String delivery_boy_password,
			@Pattern(regexp = "^[0-9]{10}$") String delivery_boy_mobileNo, @NotEmpty String delivery_boy_address,
			@NotEmpty String delivery_boy_city, @NotEmpty String delivery_boy_pincode, List<Orders> ordersList) {
		
		this.delivery_boy_id = delivery_boy_id;
		this.delivery_boy_firstName = delivery_boy_firstName;
		this.delivery_boy_lastName = delivery_boy_lastName;
		this.delivery_boy_userName = delivery_boy_userName;
		this.delivery_boy_password = delivery_boy_password;
		this.delivery_boy_mobileNo = delivery_boy_mobileNo;
		this.delivery_boy_address = delivery_boy_address;
		this.delivery_boy_city = delivery_boy_city;
		this.delivery_boy_pincode = delivery_boy_pincode;
		OrdersList = ordersList;
	}

	public DeliveryBoy() {
		
	}

	@Override
	public String toString() {
		return "DeliveryBoy [delivery_boy_id=" + delivery_boy_id + ", delivery_boy_firstName=" + delivery_boy_firstName
				+ ", delivery_boy_lastName=" + delivery_boy_lastName + ", delivery_boy_userName="
				+ delivery_boy_userName + ", delivery_boy_password=" + delivery_boy_password
				+ ", delivery_boy_mobileNo=" + delivery_boy_mobileNo + ", delivery_boy_address=" + delivery_boy_address
				+ ", delivery_boy_city=" + delivery_boy_city + ", delivery_boy_pincode=" + delivery_boy_pincode
				+ ", OrdersList=" + OrdersList + "]";
	}
	
	
	

}
