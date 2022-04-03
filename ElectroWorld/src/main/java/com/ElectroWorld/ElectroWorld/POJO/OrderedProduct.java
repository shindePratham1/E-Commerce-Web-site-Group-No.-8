package com.ElectroWorld.ElectroWorld.POJO;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="orderedProduct_table")
public class OrderedProduct {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Op_id;
	@Column(name="quantity")
	private int Op_quantity;
	@Column(name="cost")
	private double Op_cost;
	
	@OneToMany(mappedBy = "orders")
	private List<Orders> ordersList;

	public int getOp_id() {
		return Op_id;
	}

	public void setOp_id(int op_id) {
		Op_id = op_id;
	}

	public int getOp_quantity() {
		return Op_quantity;
	}

	public void setOp_quantity(int op_quantity) {
		Op_quantity = op_quantity;
	}

	public double getOp_cost() {
		return Op_cost;
	}

	public void setOp_cost(double op_cost) {
		Op_cost = op_cost;
	}

	public List<Orders> getOrdersList() {
		return ordersList;
	}

	public void setOrdersList(List<Orders> ordersList) {
		this.ordersList = ordersList;
	}

	public OrderedProduct(int op_id, int op_quantity, double op_cost, List<Orders> ordersList) {
		super();
		Op_id = op_id;
		Op_quantity = op_quantity;
		Op_cost = op_cost;
		this.ordersList = ordersList;
	}

	public OrderedProduct() {
		super();
	}

	@Override
	public String toString() {
		return "OrderedProduct [Op_id=" + Op_id + ", Op_quantity=" + Op_quantity + ", Op_cost=" + Op_cost
				+ ", ordersList=" + ordersList + "]";
	}
	
	
	
	

}
