package com.ElectroWorld.ElectroWorld.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	
	 @GetMapping("/homePage") public ModelAndView showHomePage() 
	 { 
		 ModelAndView mv = new ModelAndView(); mv.setViewName("homePage"); 
		 return mv; 
	 }
	 
	 @GetMapping("/signUp") public ModelAndView showSignUpPage() 
	 { 
		 ModelAndView mv = new ModelAndView(); mv.setViewName("signUp"); 
		 return mv; 
	 }
	 
	 @GetMapping("/signIn") public ModelAndView showSignInPage() 
	 { 
		 ModelAndView mv = new ModelAndView(); mv.setViewName("signIn"); 
		 return mv; 
	 }
	 
	 @GetMapping("/aboutUs") public ModelAndView showAboutUs() 
	 { 
		 ModelAndView mv = new ModelAndView(); mv.setViewName("aboutUs"); 
		 return mv; 
	 }
	 
	 @GetMapping("/contactUs") public ModelAndView showContactUs() 
	 { 
		 ModelAndView mv = new ModelAndView(); mv.setViewName("contactUs"); 
		 return mv; 
	 }
	 
	 @GetMapping("/feedback") public ModelAndView showFeedback() 
	 { 
		 ModelAndView mv = new ModelAndView(); mv.setViewName("feedback"); 
		 return mv; 
	 }
}
