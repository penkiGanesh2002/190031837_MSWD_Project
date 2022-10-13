package com.example.demo.admin;

import javax.persistence.*;

@Entity()
@Table(name="admin")
public class Admin {
	
	@Id
	
	private String email;
	
	
	private String password;
	
	public Admin() {
	
	}
	public Admin( String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}