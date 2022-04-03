package com.ElectroWorld.ElectroWorld.Controller;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.constraints.NotEmpty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ElectroWorld.ElectroWorld.DAO.VendorDAO;
import com.ElectroWorld.ElectroWorld.POJO.Customer;
import com.ElectroWorld.ElectroWorld.POJO.Vendor;

@Controller
public class VendorController {

	@Autowired
	VendorDAO vendDao;
	
	@PostMapping("/loginVendor")
	public ModelAndView loginVendor(@RequestParam String username, @RequestParam String password,
			@RequestParam(required=false,name="toggle") String []toggle,
			HttpServletRequest request) {


		// @ModelAttribute ("vendorLogin")
		ModelAndView mv = null;
		if(toggle==null)
		{
			mv = new ModelAndView();

			Vendor vendor = vendDao.loginVendor(username, password);

			HttpSession session2 = request.getSession();

			if (Objects.isNull(vendor)) {
				mv.setViewName("vendorRegister");
				return mv;
			} 

			else {
				System.out.println("Session Id " + session2.getId());
				mv.addObject("vendor", vendor);
				mv.setViewName("addProduct");
			}
		}
		//*****Imp******
		else
		{
			mv = new ModelAndView();
			mv.setViewName("addProduct");
			// redirect to renter login
		}
		return mv;
	}

	/*
	 * @PostMapping("/register") public ModelAndView
	 * signUp(@ModelAttribute("vendor") Vendor vendor) { vendDao.addVendor(vendor);
	 * ModelAndView mv = new ModelAndView(); mv.setViewName("vendor_homePage");
	 * return mv; }
	 */
	
	@GetMapping("/vendorRegister")
	public String showRegisterPage()
	{
		return "vendorRegister";
	}
	
	
	@PostMapping("/vendorRegister")
	public ModelAndView signUp(@ModelAttribute("vendor") Vendor vendor) {
		vendDao.addVendor(vendor);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addProduct");
		return mv;
	}
	
	
	
	
	
	
}
