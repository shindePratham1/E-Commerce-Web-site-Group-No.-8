package com.ElectroWorld.ElectroWorld.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ElectroWorld.ElectroWorld.POJO.Vendor;
import com.ElectroWorld.ElectroWorld.Repository.VendorRepository;

@Repository
public class VendorDAO {

	@Autowired
	VendorRepository vendRepo;
	
	public void addVendor(Vendor vendor) {
		vendRepo.save(vendor);
	}
	
	public Vendor loginVendor(String username,String password)
	{
		Vendor vendor = vendRepo.loginVendor(username, password);
		return vendor;	
	}


	public Vendor getVendorByName(String vendor_name) {
		// TODO Auto-generated method stub
		
		Vendor vendor=vendRepo.getVendor(vendor_name);
		return vendor;
	}

}
