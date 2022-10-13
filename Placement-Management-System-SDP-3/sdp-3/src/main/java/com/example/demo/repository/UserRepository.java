package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmailAndPassword(String email,String Password);
	
	User findByEmail(String Email);
	
}
