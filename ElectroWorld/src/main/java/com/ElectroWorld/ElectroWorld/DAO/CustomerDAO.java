package com.ElectroWorld.ElectroWorld.DAO;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ElectroWorld.ElectroWorld.Repository.CustomerRepository;
import com.ElectroWorld.ElectroWorld.POJO.*;

@Repository
public class CustomerDAO {
	
	@Autowired
	CustomerRepository custRepo;
	
//	public EquipmentInfoTable findById(int equipmentId) {
//		Optional<EquipmentInfoTable> op = equipRepo.findById(equipmentId);
//		EquipmentInfoTable equipment = op.get();
//		return equipment;
//	}
	public Customer getById()
	{
		Optional<Customer> op = custRepo.findById(1);
     	Customer customer = op.get();
		return customer;
	}
	
	public Customer loginCustomer(String username,String password)
	{
		Customer customer = custRepo.loginCustomer(username, password);
		return customer;
		
	}

	/*
	 * public void insert(String name, String email, String mobno, String uname,
	 * String password, String address, String pincode, String city) { // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 */
	public void addCustomerDetails(Customer customerEntity)
	{
		custRepo.save(customerEntity);
		System.out.println("Customer added sucsessfully");
	}

}
