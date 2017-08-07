package com.chen.www.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chen.www.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	 User findByUsername(String username);
	 
}
