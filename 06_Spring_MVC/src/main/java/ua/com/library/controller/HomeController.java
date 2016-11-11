package ua.com.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home(){
	
		return "home";
	}
	
	@RequestMapping(value="/signUp", method=RequestMethod.GET)
	public String signUp(Model model){
		
		model.addAttribute("max", Integer.MAX_VALUE);
		
		return "signUp";
	}
	
	@RequestMapping(value="/click", method=RequestMethod.POST)
	public String click(@RequestParam String username,
			@RequestParam String password){
		
		System.out.println(username);
		System.out.println(password);
		
		return "signUp";
	}
}








