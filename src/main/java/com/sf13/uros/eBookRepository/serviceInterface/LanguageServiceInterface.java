package com.sf13.uros.eBookRepository.serviceInterface;

import java.util.List;

import com.sf13.uros.eBookRepository.model.Language;

public interface LanguageServiceInterface {

	Language findOne(Integer id);

	List<Language> findAll();

	Language save(Language language);

	void delete(Integer id);
}