package com.josenildo.applicationSpring.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.josenildo.applicationSpring.domain.Category;

@RestController //necessary for the class to be a Rest controller
@RequestMapping(value="/categories") //Endpoint 
public class CategoriesResource {
	
	@RequestMapping(method = RequestMethod.GET) //data request
	public List<Category> list() {
		Category cat1 = new Category(1,"Informática");
		Category cat2 = new Category(2,"Escritório");
		List<Category> list = new ArrayList<>();
		list.add(cat1);
		list.add(cat2);
		
		return list;
	}

}
