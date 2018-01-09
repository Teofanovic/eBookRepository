package com.sf13.uros.eBookRepository.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sf13.uros.eBookRepository.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
