package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import com.example.demo.repository.UserRepository;
import com.example.demo.user.User;

@Service
public class UserService {
	

	@Autowired
	private  UserRepository repo;
	
	
	public  boolean login(String email,String password) {
		
		  User l = repo.findByEmailAndPassword(email,password);
		  if(l!=null)
			  return true;
		  return false;
	}
		  
	public List<User> listAll() {
        return  repo.findAll();
    }
     
    public void save(User user) {
        repo.save(user);
    }
     
    public User get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }
     
   
}

