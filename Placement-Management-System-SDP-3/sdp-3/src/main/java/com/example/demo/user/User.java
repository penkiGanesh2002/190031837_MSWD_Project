package com.example.demo.user;

import javax.persistence.*;

@Entity()
@Table(name="users")
public class User
{
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private Long id;
private String name;
	private String email;
	
	private Long phone;
	private String firstname;
		private String lastname;
		private String branch;
		private String gender;
	     private int ssc;
	     private int inter;
	     private int btech;
	     private int gcy;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String password;
	
	public User() {
	
	}
	
	
	public User(Long id, String name, String email, Long phone, String firstname, String lastname, String branch,
			String gender, int ssc, int inter, int btech, int gcy, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.firstname = firstname;
		this.lastname = lastname;
		this.branch = branch;
		this.gender = gender;
		this.ssc = ssc;
		this.inter = inter;
		this.btech = btech;
		this.gcy = gcy;
		this.password = password;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSsc() {
		return ssc;
	}
	public void setSsc(int ssc) {
		this.ssc = ssc;
	}
	public int getInter() {
		return inter;
	}
	public void setInter(int inter) {
		this.inter = inter;
	}
	public int getBtech() {
		return btech;
	}
	public void setBtech(int btech) {
		this.btech = btech;
	}
	public int getGcy() {
		return gcy;
	}
	public void setGcy(int gcy) {
		this.gcy = gcy;
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