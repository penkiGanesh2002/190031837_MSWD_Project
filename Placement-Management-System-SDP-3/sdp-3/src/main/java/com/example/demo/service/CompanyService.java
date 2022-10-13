package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.company.Company;
import com.example.demo.repository.CompanyRepository;
import com.example.demo.user.User;

@Service
public class CompanyService {

	@Autowired
	private  CompanyRepository repo;
	
   public  boolean login(String email,String password) {
		
	   Company l = repo.findByEmailAndPassword(email,password);
		  if(l!=null) {
			  return true;
		  }
		  return false;
	}
	public List<Company> listAll() {
        return  repo.findAll();
    }
     
    public void save(Company user) {
        repo.save(user);
    }
     
    public Company get(long id) {
        return repo.findById(id).get();
    }
      
    public void delete(long id) {
        repo.deleteById(id);
    }
     

}
