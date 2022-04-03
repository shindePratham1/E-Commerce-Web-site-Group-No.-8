package com.ElectroWorld.ElectroWorld.DAO;

import java.sql.Blob;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ElectroWorld.ElectroWorld.POJO.Product;
import com.ElectroWorld.ElectroWorld.POJO.Vendor;
import com.ElectroWorld.ElectroWorld.Repository.ProductRepository;
@Repository
public class ProductDAO {
	
	@Autowired
	ProductRepository productRepo;
	
	public Product showImage(String name) {

		Product product = productRepo.findByName(name);
		
		return product;
	}
	
	public void addProduct(String name,String category,String price,String quantity,String desc, Blob image, Vendor vendor)
	{
		Product p = new Product(name,category, price, quantity, desc, image, vendor);
		
		productRepo.save(p);
	}

	public List<Product> getListOfProducts() {
		System.out.println("IN DAO");
		return productRepo.findAll();
	}

	
}
