package com.ElectroWorld.ElectroWorld.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ElectroWorld.ElectroWorld.POJO.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	@Query(value= "SELECT * FROM product_table P WHERE P.product_name=:name",nativeQuery=true)
	public Product findByName(String name);
}
