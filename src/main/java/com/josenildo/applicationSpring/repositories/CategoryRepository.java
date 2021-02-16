package com.josenildo.applicationSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.josenildo.applicationSpring.domain.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer>{

}
