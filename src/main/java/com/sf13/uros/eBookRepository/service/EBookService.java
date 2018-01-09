package com.sf13.uros.eBookRepository.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sf13.uros.eBookRepository.model.EBook;
import com.sf13.uros.eBookRepository.repository.EBookRepository;
import com.sf13.uros.eBookRepository.serviceInterface.EBookServiceInterface;

public class EBookService implements EBookServiceInterface {

	@Autowired
	private EBookRepository eBookRepository;

	@Override
	public EBook findOne(Integer id) {
		return eBookRepository.findOne(id);
	}

	@Override
	public List<EBook> findAll() {
		return eBookRepository.findAll();
	}

	@Override
	public EBook save(EBook eBook) {
		return eBookRepository.save(eBook);
	}

	@Override
	public void delete(Integer id) {
		eBookRepository.delete(id);
	}
}