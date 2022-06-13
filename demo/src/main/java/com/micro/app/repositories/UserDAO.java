package com.micro.app.repositories;

import org.springframework.data.repository.CrudRepository;

import com.micro.app.entity.User;



public interface UserDAO extends CrudRepository<User, Long> {

	User findByUsername(String userId);

}