package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import com.example.demo.user.User;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private UserService ls;
	
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/user_register",method = RequestMethod.GET)
	public String login_register(Model model) {
		model.addAttribute("user", new User());
		return "user_register";
	}
	

	
	@RequestMapping(value="/user_login",method = RequestMethod.GET)
 	public String user_login(Model model) {
		model.addAttribute("user", new User());
		return "user_login";
	}
	
	@RequestMapping(value="/user_home",method = RequestMethod.GET)
	public String user_home() {
		return "user_home";
	}
	
	@RequestMapping(value="/err",method = RequestMethod.GET)
	public String fail_page() {
		return "error";
	}
	
	@RequestMapping(value="/user_register_verify",method = RequestMethod.POST)
	public String register_verify_page(User r) {
		
		repo.save(r);
		return "redirect:/admin_home";
		
	}
	
	@RequestMapping(value="/user_login_verify",method = RequestMethod.POST)
	public  String user_login_verify( @ModelAttribute User user) {
		boolean x=ls.login(user.getEmail(),user.getPassword());
		System.out.println(x);
		if(x)
			return "redirect:/user_home";
		return "redirect:/err";
	}
	@RequestMapping(value="/jobprofile",method = RequestMethod.GET)
	public String job_profile() {
		return "userjobprofile";
	}
	@RequestMapping(value="/jobsearch",method = RequestMethod.GET)
	public String job_search() {
		return "jobsearch";
	}
	
	 @RequestMapping("/user_profile")
	    public String add(Model model) {
	     List<User> liststudent = ls.listAll();
	     
	
	        model.addAttribute("liststudent", liststudent);
	        model.addAttribute("user", new User());
	        return "user_profile";
	    }
	
	
}
