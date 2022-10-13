package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.admin.Admin;
import com.example.demo.company.Company;
import com.example.demo.repository.AdminRepository;

import com.example.demo.service.AdminService;
import com.example.demo.service.CompanyService;
import com.example.demo.service.UserService;
import com.example.demo.user.User;


@Controller

public class AdminController {
	@Autowired
	private AdminRepository repo;
	
	
	@Autowired
	private AdminService ls;
	
	@Autowired
	private UserService us;
	
	@Autowired
	private CompanyService cs;
	@RequestMapping(value="/admin_login",method = RequestMethod.GET)
	public String admin_login(Model model) {
		model.addAttribute("admin", new User());
		return "admin_login";
	}
	
	@RequestMapping(value="/admin_home",method = RequestMethod.GET)
	public String admin_home() {
		return "admin_home";
	}
	
	@RequestMapping(value="/add_student",method = RequestMethod.GET)
	public String add_student(Model model) {
		model.addAttribute("user", new User());
		return "addstudent";
	}
	
	@RequestMapping(value="/student_data",method = RequestMethod.GET)
	public String student_data(Model model) {
		 List<User> liststudent = us.listAll();
		model.addAttribute("liststudent", liststudent);
		return "student_data";
	}
	
	@RequestMapping(value="/company_data",method = RequestMethod.GET)
	public String company_data(Model model) {
		 List<Company> listcompany = cs.listAll();
			model.addAttribute("listcompany", listcompany);
		return "company_data"; 
	}
	
	 @RequestMapping("/User/adduser")
	    public String add(Model model) {
	     List<User> liststudent = us.listAll();
	     
	
	        model.addAttribute("liststudent", liststudent);
	        model.addAttribute("user", new User());
	        return "add_student";
	    }
	 
	 @RequestMapping(value = "/User/save", method = RequestMethod.POST)
	    public String saveUser(@ModelAttribute("user") User user) {
	        us.save(user);
	        return "redirect:/student_data";
	    }

	    @RequestMapping("/User/edit/{id}")
	    public ModelAndView showEditUserPage(@PathVariable(name = "id") int id) {
	        ModelAndView mav = new ModelAndView("add_student");
	        User user = us.get(id);
	        mav.addObject("user", user);
	        return mav;
	        
	    }
	    @RequestMapping("/User/delete/{id}")
	    public String deleteUserPage(@PathVariable(name = "id") int id) {
	        us.delete(id);
	        return "redirect:/student_data";
	    }
	
	    @RequestMapping("/Company/addcompany")
	    public String addCompany(Model model) {
	     List<Company> listcompany = cs.listAll();
	     
	
	        model.addAttribute("liststudent", listcompany);
	        model.addAttribute("company", new Company());
	        return "add_company";
	    }
	 
	 @RequestMapping(value = "/Company/save", method = RequestMethod.POST)
	    public String saveCompany(@ModelAttribute("company") Company user) {
	        cs.save(user);
	        return "redirect:/company_data";
	    }

	    @RequestMapping("/Company/edit/{id}")
	    public ModelAndView showEditCompanyPage(@PathVariable(name = "id") int id) {
	        ModelAndView mav = new ModelAndView("add_company");
	        Company user = cs.get(id);
	        mav.addObject("company", user);
	        return mav;
	        
	    }
	    @RequestMapping("/Company/delete/{id}")
	    public String deleteCompanyPage(@PathVariable(name = "id") int id) {
	        cs.delete(id);
	        return "redirect:/company_data";
	    }
	
	@RequestMapping(value="/admin_login_verify",method = RequestMethod.POST)
	public  String admin_login_verify( @ModelAttribute User admin) {
		
	
		boolean x=us.login(admin.getEmail(),admin.getPassword());
		System.out.println(x);
		if(x)
			return "redirect:/admin_home";
		return "redirect:/err";
	}
}
