package com.ElectroWorld.ElectroWorld.Controller;

import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;

import javax.sql.rowset.serial.SerialBlob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.ElectroWorld.ElectroWorld.DAO.ProductDAO;
import com.ElectroWorld.ElectroWorld.DAO.VendorDAO;
import com.ElectroWorld.ElectroWorld.POJO.Product;
import com.ElectroWorld.ElectroWorld.POJO.Vendor;



@Controller
public class ProductController {


	@Autowired
	VendorDAO vendDao;
	
	@Autowired
	ProductDAO dao;

	@GetMapping("/addProduct")
	public String addProduct() {

		return "addProduct";
	}
	@GetMapping("/viewProducts")
	public String showProducts() {

		return "viewProducts";
	}
	@RequestMapping("/home")
	public String showHome() {

		return "home";
	}
	
	@PostMapping("/getImage")
	public String verifyUser(Model model,@RequestParam String name) {

		Product result = dao.showImage(name);
		
		if(result != null) {

			model.addAttribute("image", result);
			return "home";
		}
		else {

			model.addAttribute("errormsg", "No image found !!");
			return "home";
		}
	}

	@PostMapping("/addProduct")
	public String addProduct(@RequestParam String name, @RequestParam String category, @RequestParam String price, @RequestParam String quantity, @RequestParam String desc, @RequestParam("image") MultipartFile file, @RequestParam String vendor_name){
			
		Vendor vendor=vendDao.getVendorByName(vendor_name);
		byte[] byteArr;
		Blob blob;
		try {
			byteArr = file.getBytes();
			blob = new SerialBlob(byteArr);
			dao.addProduct(name,category, price, quantity, desc, blob, vendor);
			
			return "afterAddingProduct";
		} catch (SQLException e) {

			e.printStackTrace();
			return "addProduct";
		}
		catch (IOException e1) {

			e1.printStackTrace();
			return "addProduct";
		}


		
	}
	@GetMapping("/afterAddingProduct")
	public String afterAddingProduct() {

		return "afterAddingProduct";
	}

}


