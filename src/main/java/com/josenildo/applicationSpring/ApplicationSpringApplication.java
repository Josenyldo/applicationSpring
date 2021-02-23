package com.josenildo.applicationSpring;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.josenildo.applicationSpring.domain.Category;
import com.josenildo.applicationSpring.repositories.CategoryRepository;

@SpringBootApplication
public class ApplicationSpringApplication implements CommandLineRunner{
	
	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(ApplicationSpringApplication.class, args);
		
		
	}

	@Override
	public void run(String...	 args) throws Exception {
		Category cat1 = new Category(null,"Informáasdtica");
		Category cat2 = new Category(null,"Escritóasdrio");
		
		categoryRepository.saveAll(Arrays.asList(cat1,cat2));
	}

}
