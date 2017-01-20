package ua.com.portalNews.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by admin on 18.01.2017.
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

}
