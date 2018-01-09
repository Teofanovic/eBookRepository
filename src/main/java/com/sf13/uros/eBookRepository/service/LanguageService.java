package com.sf13.uros.eBookRepository.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sf13.uros.eBookRepository.model.Language;
import com.sf13.uros.eBookRepository.repository.LanguageRepository;
import com.sf13.uros.eBookRepository.serviceInterface.LanguageServiceInterface;

public class LanguageService implements LanguageServiceInterface {

	@Autowired
	private LanguageRepository languageRepository;

	@Override
	public Language findOne(Integer id) {
		return languageRepository.findOne(id);
	}

	@Override
	public List<Language> findAll() {
		return languageRepository.findAll();
	}

	@Override
	public Language save(Language language) {
		return languageRepository.save(language);
	}

	@Override
	public void delete(Integer id) {
		languageRepository.delete(id);
	}
}