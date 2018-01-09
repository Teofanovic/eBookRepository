package com.sf13.uros.eBookRepository.serviceInterface;

import java.util.List;

import com.sf13.uros.eBookRepository.model.EBook;

public interface EBookServiceInterface {

	EBook findOne(Integer id);

	List<EBook> findAll();

	EBook save(EBook eBook);

	void delete(Integer id);
}