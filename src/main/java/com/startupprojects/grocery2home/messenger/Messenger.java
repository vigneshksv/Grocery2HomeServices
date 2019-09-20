package com.startupprojects.grocery2home.messenger;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Messenger {

//	@Id
//	private int messengerId;
	private String firstName;
	private String lastName;
	private String middleName;
	private String email;
	private String phone;
	private String password;
	private Date registrationDate;

	public Messenger() {

	}


	public Messenger(String firstName, String lastName, String middleName, String email, String phone, String password,
			Date registrationDate, int messengerId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.registrationDate = registrationDate;
//		this.messengerId = messengerId;
	}

//	public int getmessengerId() {
//		return messengerId;
//	}
//	public void setmessengerId(int userId) {
//		this.messengerId = userId;
//	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}


}
