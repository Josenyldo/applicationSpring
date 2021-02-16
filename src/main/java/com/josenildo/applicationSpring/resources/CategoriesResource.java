package com.josenildo.applicationSpring.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.josenildo.applicationSpring.categoryServices.CategoryService;
import com.josenildo.applicationSpring.domain.Category;

@RestController //necessary for the class to be a Rest controller
@RequestMapping(value="/categories") //Endpoint 
public class CategoriesResource {
	
	@Autowired
	private CategoryService service;
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET) //data request
	public ResponseEntity<?> find(@PathVariable Integer id){
		Category obj = service.search(id);
		return ResponseEntity.ok().body(obj);
	}

}
