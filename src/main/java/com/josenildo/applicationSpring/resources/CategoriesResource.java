package com.josenildo.applicationSpring.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController //necessary for the class to be a Rest controller
@RequestMapping(value="/categories") //Endpoint 
public class CategoriesResource {
	
	@RequestMapping(method = RequestMethod.GET) //data request
	public String list() {
		return "Rest is working ";
	}

}
