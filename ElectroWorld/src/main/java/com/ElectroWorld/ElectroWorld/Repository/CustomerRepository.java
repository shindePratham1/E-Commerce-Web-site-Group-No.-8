package com.ElectroWorld.ElectroWorld.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.ElectroWorld.ElectroWorld.POJO.*;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	
		@Query(value= "SELECT * FROM customer_table C WHERE C.customer_username=:uname AND C.customer_password=:pass",nativeQuery=true)
		public Customer loginCustomer(@Param("uname") String username,
				@Param("pass") String password);
	}


