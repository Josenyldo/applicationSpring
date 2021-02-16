package com.josenildo.applicationSpring.categoryServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.josenildo.applicationSpring.domain.Category;
import com.josenildo.applicationSpring.repositories.CategoryRepository;
import java.util.Optional;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repo;
	
	public Category search(Integer id) {
		Optional<Category> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
