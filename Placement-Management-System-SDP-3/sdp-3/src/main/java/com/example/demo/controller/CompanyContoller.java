package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.company.Company;
import com.example.demo.repository.CompanyRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.CompanyService;

import com.example.demo.service.UserService;
import com.example.demo.user.User;
import com.example.demo.company.Company;

@Controller
public class CompanyContoller {

	@Autowired
	private CompanyRepository repo;
	
	
	@Autowired
	private CompanyService ls;

	
	private Company com;
	
	@RequestMapping(value="/company_register",method = RequestMethod.GET)
	public String company_register(Model model) {
		model.addAttribute("company", new Company());
		return "company_register";
	}
	
	@RequestMapping(value="/company_login",method = RequestMethod.GET)
	public String company_login(Model model) {
		model.addAttribute("company", new Company());
		return "company_login";
	}
	
	@RequestMapping(value="/company_home",method = RequestMethod.GET)
	public String company_home(Model m) {
		m.addAttribute("com",com);
		return "company_home";
	}
	
	@RequestMapping(value="/company_register_verify",method = RequestMethod.POST)
	public String register_verify_page(Company c) {
		Company u=repo.findByEmail(c.getEmail());

		if(u==null) {
		repo.save(c);
		return "redirect:/company_login";
		}
		else {
			return "error";
		}
	}
	@RequestMapping(value="/company_login_verify",method = RequestMethod.POST)
	public  String company_login_verify( @ModelAttribute Company c) {
		
	
		/*boolean x=ls.login(c.getEmail(),c.getPassword());
		System.out.println(x);
		if(x) {
			this.com=c;*/
			return "redirect:/company_home";
		/*}
		return "redirect:/";*/
	}
	
	@RequestMapping(value="/company_logout",method = RequestMethod.GET)
	public String company_logout() {
		com=null;
		return "index";
	}
	
	@RequestMapping(value="/company_profile",method = RequestMethod.GET)
	public String company_profile(Model m) {
		m.addAttribute("com", com);
		return "company_profile";
	}
	
	@RequestMapping(value="/postajob",method = RequestMethod.GET)
	public String post_a_job() {
		
		return "postajob";
	}
	
	@RequestMapping(value="/jobpostings",method = RequestMethod.GET)
	public String job_applicants() {
		
		return "jobpostings";
	}
	
}