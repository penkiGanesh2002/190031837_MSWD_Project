package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.company.Company;


@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
	
	Company findByEmailAndPassword(String email,String Password);
	
	Company findByEmail(String Email);
	
}

