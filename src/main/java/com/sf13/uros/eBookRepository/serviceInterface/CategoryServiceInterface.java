package com.sf13.uros.eBookRepository.serviceInterface;

import java.util.List;

import com.sf13.uros.eBookRepository.model.Category;

public interface CategoryServiceInterface {

	Category findOne(Integer id);

	List<Category> findAll();

	Category save(Category category);

	void delete(Integer id);
}