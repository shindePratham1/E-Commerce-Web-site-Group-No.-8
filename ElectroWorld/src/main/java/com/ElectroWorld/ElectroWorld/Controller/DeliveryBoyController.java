package com.ElectroWorld.ElectroWorld.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ElectroWorld.ElectroWorld.DAO.CustomerDAO;
import com.ElectroWorld.ElectroWorld.DAO.DeliveryBoyDAO;
import com.ElectroWorld.ElectroWorld.POJO.Customer;
import com.ElectroWorld.ElectroWorld.POJO.DeliveryBoy;
import com.ElectroWorld.ElectroWorld.POJO.Orders;
import com.ElectroWorld.ElectroWorld.Repository.CustomerRepository;

@Controller
@SessionAttributes("deliveryBoy")
public class DeliveryBoyController {
	
	
	@Autowired
	DeliveryBoyDAO dbDao; 

	
	@GetMapping("/addDeliveryBoy")
	public String index()
	{
		return "addDeliveryBoy";
	}
	
	/*
	 * @PostMapping("/loginCustomer") public ModelAndView
	 * loginCustomer(@RequestParam String username, @RequestParam String password,
	 * 
	 * @RequestParam(required=false,name="toggle") String []toggle,
	 * HttpServletRequest request) {
	 * 
	 * 
	 * // @ModelAttribute ("customerLogin") ModelAndView mv = null; if(toggle==null)
	 * { mv = new ModelAndView();
	 * 
	 * Customer customer = custDao.loginCustomer(username, password);
	 * 
	 * HttpSession session2 = request.getSession();
	 * 
	 * if (Objects.isNull(customer)) { mv.setViewName("login"); return mv; }
	 * 
	 * else { System.out.println("Session Id " + session2.getId());
	 * mv.addObject("customer", customer); mv.setViewName("profilesearch"); } }
	 * //*****Imp****** else { mv = new ModelAndView(); mv.setViewName("index"); //
	 * redirect to renter login } return mv; }
	 */
	
	@PostMapping("/addDeliveryBoy")
	public String addDeliveryBoy(@RequestParam String deliveryboy_firstname, @RequestParam String deliveryboy_lastname ,@RequestParam String deliveryboy_username , @RequestParam String deliveryboy_password
			, @RequestParam String deliveryboy_address ,
			@RequestParam String deliveryboy_mobileNo, @RequestParam String deliveryboy_city, @RequestParam String deliveryboy_pincode, @RequestParam List<Orders> orderList)
	{

		DeliveryBoy deliveryboy = new DeliveryBoy(deliveryboy_firstname, deliveryboy_lastname, deliveryboy_username, deliveryboy_password, deliveryboy_mobileNo, deliveryboy_address, deliveryboy_city, deliveryboy_pincode, orderList);
		dbDao.addDeliveryBoyDetails(deliveryboy);
		//Customer customer = dbDao.loginCustomer(deliveryboy_username, deliveryboy_password);
		//System.out.println(customer.getCustomer_id() + customer.getCustomerFirstName());
		if(deliveryboy!=null) {
			return "homepage";
		}
		return "addDeliveryBoy";

	}
	 
	



}