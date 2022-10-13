package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.company.Company;
import com.example.demo.contactus.ContactUs;
import com.example.demo.repository.ContactUsRepository;

@Controller
public class ContactUsController {
	@Autowired
	private ContactUsRepository repo;
	
	@RequestMapping(value="/contact_us",method = RequestMethod.GET)
	public String contact_us(Model model) {
		model.addAttribute("contactus", new ContactUs());
		return "contact_us";
	}
	
	@RequestMapping(value="/contactus_register_verify",method = RequestMethod.POST)
	public String register_verify_page(ContactUs c) {
		//ContactUs u=repo.findByComemail(c.getCom_email());

		//if(u==null) {
		repo.save(c);
		return "redirect:/";
		
		/*else {
			return "error";
		}*/
	}
}
