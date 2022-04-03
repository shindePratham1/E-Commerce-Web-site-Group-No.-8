package com.ElectroWorld.ElectroWorld.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ElectroWorld.ElectroWorld.POJO.DeliveryBoy;

@Repository
public interface DeliveryBoyrepository extends JpaRepository<DeliveryBoy, Integer> {

	
}
