package com.ElectroWorld.ElectroWorld.Controller;


import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ElectroWorld.ElectroWorld.DAO.CustomerDAO;
import com.ElectroWorld.ElectroWorld.POJO.Customer;
import com.ElectroWorld.ElectroWorld.Repository.CustomerRepository;



@Controller
@SessionAttributes("customer")
public class CustomerController {
	
	
	@Autowired
	CustomerDAO custDao; 

	@GetMapping("/info")
	public ModelAndView show()
	{
		Customer cust=custDao.getById();
		ModelAndView md=new ModelAndView();
		md.addObject("customer",cust);
		md.setViewName("info");
		return md;
	}
	
	@GetMapping("/loginCustomer")
	public String showLogInPage()
	{
		return "logIn";
	}
	
	@GetMapping("/addCustomer")
	public String index()
	{
		return "addCustomer";
	}
	/*
	 * @GetMapping("/add") public String add() { return "add"; }
	 */
	
	/*
	 * @RequestMapping(method = RequestMethod.POST,path = "/signup") public
	 * ModelAndView Signup(@RequestParam String name,@RequestParam String
	 * email,@RequestParam String mobno,@RequestParam String uname,@RequestParam
	 * String password,@RequestParam String address,@RequestParam String
	 * pincode,@RequestParam String city) { ModelAndView md=new ModelAndView();
	 * dao.insert(name, email, mobno, uname, password, address, pincode, city);
	 * md.setViewName("index"); return md; }
	 */
	
	@PostMapping("/loginCustomer")
	public ModelAndView loginCustomer(@RequestParam String username, @RequestParam String password,
			@RequestParam(required=false,name="toggle") String []toggle,
			HttpServletRequest request) {


		// @ModelAttribute ("customerLogin")
		ModelAndView mv = null;
		if(toggle==null)
		{
			mv = new ModelAndView();

			Customer customer = custDao.loginCustomer(username, password);

			HttpSession session2 = request.getSession();

			if (Objects.isNull(customer)) {
				mv.setViewName("addCustomer");
				return mv;
			} 

			else {
				System.out.println("Session Id " + session2.getId());
				mv.addObject("customer", customer);
				mv.setViewName("homePage");
			}
		}
		//*****Imp******
		else
		{
			mv = new ModelAndView();
			mv.setViewName("homePage");
			// redirect to renter login
		}
		return mv;
	}
	
	@PostMapping("/addCustomer")
	public String addCustomer(@RequestParam String customer_firstname, @RequestParam String customer_lastname ,@RequestParam String customer_username , @RequestParam String customer_password
			, @RequestParam String customer_address ,
			@RequestParam String customer_mobileNo ,  @RequestParam String customer_email, @RequestParam String customer_city, @RequestParam String customer_pincode)
	{

		Customer customerEntity = new Customer(customer_firstname, customer_lastname, customer_username, customer_password, customer_address, customer_mobileNo, customer_email, customer_city, customer_pincode);
		custDao.addCustomerDetails(customerEntity);
		Customer customer = custDao.loginCustomer(customer_username, customer_password);
		System.out.println(customer.getCustomer_id() + customer.getCustomerFirstName());
		if(customerEntity!=null) {
			return "homePage";
		}
		return "homePage";

	}
	 
	



}