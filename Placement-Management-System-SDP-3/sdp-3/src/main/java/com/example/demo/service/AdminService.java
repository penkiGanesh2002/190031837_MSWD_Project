
package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.admin.Admin;
import com.example.demo.repository.AdminRepository;
import com.example.demo.user.User;


@Service
public class AdminService {
	

	@Autowired
	private  AdminRepository repo;
	
	
	public  boolean login(String email,String password) {
		
		  Admin l = repo.findByEmailAndPassword(email,password);
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