package fb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fb.service.UsersService;

/**
 * Created by Yulian Bulbuk on 23.04.2016.
 */
@Controller
public class HomeController {

    @Autowired
    public UsersService usersService;

    @RequestMapping(value = {"/","/home"}, method = RequestMethod.GET)
    public String homePage(){
        return "home";
    }
    
}
