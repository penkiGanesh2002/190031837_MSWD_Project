package com.example.demo.contactus;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name="contactus")
public class ContactUs {
	
	@Id
	private String fullname;
	
	
	private String email;
	private String subject;
	
	
	public ContactUs() {
	
	}
	public ContactUs( String fullname, String email,String subject) {
		this.fullname=fullname;
		this.email = email;
		this.subject = subject;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
}