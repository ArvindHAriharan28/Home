package com.chainsys.home.model;

public class Register {

	private String name;
	private long phonenumber;
	private String email;
	private String password;
	private String address;
	private String security_question;
	private String security_answer;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSecurity_question() {
		return security_question;
	}

	public void setSecurity_question(String security_question) {
		this.security_question = security_question;
	}

	public String getSecurity_answer() {
		return security_answer;
	}

	public void setSecurity_answer(String security_answer) {
		this.security_answer = security_answer;
	}

	@Override
	public String toString() {
		return "Register [name=" + name + ", phonenumber=" + phonenumber
				+ ", email=" + email + ", password=" + password + ", address="
				+ address + ", security_question=" + security_question
				+ ", security_answer=" + security_answer + "]";
	}

}
