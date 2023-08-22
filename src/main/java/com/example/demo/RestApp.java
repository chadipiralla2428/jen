package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class RestApp {
	
	 @GetMapping()
	    public String demo(){
	        return "welcome to jenkins.....";
	    }

}
