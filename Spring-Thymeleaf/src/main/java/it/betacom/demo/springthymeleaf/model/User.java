package it.betacom.demo.springthymeleaf.model;

public class User {
	private String name;
	private String Email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", Email=" + Email + "]";
	}
}
