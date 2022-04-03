package com.ElectroWorld.ElectroWorld.POJO;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/*import javax.persistence.JoinColumn;*/
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="orders_table")
public class Orders {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Orders_id;
	private String Order_status;
	private int Order_cost;
	private Date Order_date;
	private String Payment_status;
	
	@ManyToOne(targetEntity = Customer.class)
	private Customer cust;
	
	/*
	 * @JoinColumn(name="customer_id") private Customer cust;
	 */
	@OneToMany(targetEntity = Product.class) 
	private List<Product> productsList;
	/*
	 * @OneToMany(mappedBy = "orders") private List<Product> productsList;
	 */
	
	@ManyToOne(targetEntity = Customer.class)
	private Orders orders;

	/*
	 * @JoinColumn(name="customer_id") private Orders orders;
	 */
	public int getOrders_id() {
		return Orders_id;
	}

	public void setOrders_id(int orders_id) {
		Orders_id = orders_id;
	}

	public String getOrder_status() {
		return Order_status;
	}

	public void setOrder_status(String order_status) {
		Order_status = order_status;
	}

	public int getOrder_cost() {
		return Order_cost;
	}

	public void setOrder_cost(int order_cost) {
		Order_cost = order_cost;
	}

	public Date getOrder_date() {
		return Order_date;
	}

	public void setOrder_date(Date order_date) {
		Order_date = order_date;
	}

	public String getPayment_status() {
		return Payment_status;
	}

	public void setPayment_status(String payment_status) {
		Payment_status = payment_status;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	public List<Product> getProductsList() {
		return productsList;
	}

	public void setProductsList(List<Product> productsList) {
		this.productsList = productsList;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public Orders(int orders_id, String order_status, int order_cost, Date order_date, String payment_status,
			Customer cust, List<Product> productsList, Orders orders) {
		super();
		Orders_id = orders_id;
		Order_status = order_status;
		Order_cost = order_cost;
		Order_date = order_date;
		Payment_status = payment_status;
		this.cust = cust;
		this.productsList = productsList;
		this.orders = orders;
	}

	public Orders() {
		super();
	}

	@Override
	public String toString() {
		return "Orders [Orders_id=" + Orders_id + ", Order_status=" + Order_status + ", Order_cost=" + Order_cost
				+ ", Order_date=" + Order_date + ", Payment_status=" + Payment_status + ", cust=" + cust
				+ ", productsList=" + productsList + ", orders=" + orders + "]";
	}
	
	
	
	
	
}
