package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.company.Company;
import com.example.demo.contactus.ContactUs;
import com.example.demo.user.User;

@Repository
public interface ContactUsRepository extends JpaRepository<ContactUs, Long> {
	/*Company findByComemailAndPassword(String email,String pass);
	
	Company findByComemail(String Email);*/
}