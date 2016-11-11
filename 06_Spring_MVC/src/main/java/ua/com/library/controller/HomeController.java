package ua.com.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home(Model model){
		model.addAttribute("max", Integer.MAX_VALUE);
		return "home";
	}
	
	@RequestMapping(value="/link", method=RequestMethod.GET)
	public String link(@RequestParam String someInput){
		
		System.out.println(someInput);
		
		
		return "redirect:/";
	}
	
	
}
