package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.admin.Admin;
import com.example.demo.user.User;


@Repository
public interface AdminRepository extends JpaRepository<User, Long> {

	Admin findByEmailAndPassword(String email,String Password);
	
	Admin findByEmail(String Email);
	
}
