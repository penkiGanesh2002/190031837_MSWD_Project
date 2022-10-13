package com.example.demo.company;

import javax.persistence.*;

@Entity()
@Table(name="company")
public class Company {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long id;
	@Column(name="email")
	private String email;
	
	@Column(name="name")
	private String name;
	
	@Column(name="password")
	private String password;
	
	@Column(name="address")
	private String address;
public Company() {
	
}
	public Company(long id, String email, String name, String password, String address) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.password = password;
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
