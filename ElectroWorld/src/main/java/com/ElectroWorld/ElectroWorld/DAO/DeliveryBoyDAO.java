package com.ElectroWorld.ElectroWorld.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ElectroWorld.ElectroWorld.POJO.DeliveryBoy;
import com.ElectroWorld.ElectroWorld.Repository.DeliveryBoyrepository;

@Repository
public class DeliveryBoyDAO {
	
	@Autowired
	DeliveryBoyrepository dbRepo;
	
	public void addDeliveryBoyDetails(DeliveryBoy deliveryboy)
	{
		dbRepo.save(deliveryboy);
	}

}
