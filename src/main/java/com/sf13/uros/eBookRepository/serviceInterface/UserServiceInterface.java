package com.sf13.uros.eBookRepository.serviceInterface;

import java.util.List;

import com.sf13.uros.eBookRepository.model.User;

public interface UserServiceInterface {

	User findOne(Integer id);

	List<User> findAll();

	User save(User user);

	void delete(Integer id);
}