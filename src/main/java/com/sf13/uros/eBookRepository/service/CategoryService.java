package com.sf13.uros.eBookRepository.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sf13.uros.eBookRepository.model.Category;
import com.sf13.uros.eBookRepository.repository.CategoryRepository;
import com.sf13.uros.eBookRepository.serviceInterface.CategoryServiceInterface;

public class CategoryService implements CategoryServiceInterface {

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public Category findOne(Integer id) {
		return categoryRepository.findOne(id);
	}

	@Override
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public Category save(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public void delete(Integer id) {
		categoryRepository.delete(id);
	}
}