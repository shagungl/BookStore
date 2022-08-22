package com.globallogic.entity;

import javax.persistence.Column;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class Admin{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	
	@Column
	String FirstName;
	
	@Column
	String LastName;
	
	@Column
	String Email;
	
	@Column
	int phone;
	
	@Column 
	String password;
	
	@OneToMany
	private List<Book> Book;
	

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(int id, String firstName, String lastName, String email, int phone, String password) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		this.phone = phone;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email
				+ ", phone=" + phone + ", password=" + password + "]";
	}

	public synchronized String getPassword() {
		return password;
	}

	public synchronized void setPassword(String password) {
		this.password = password;
	}

	public synchronized int getId() {
		return id;
	}

	public synchronized void setId(int id) {
		this.id = id;
	}

	public synchronized String getFirstName() {
		return FirstName;
	}

	public synchronized void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public synchronized String getLastName() {
		return LastName;
	}

	public synchronized void setLastName(String lastName) {
		LastName = lastName;
	}

	public synchronized String getEmail() {
		return Email;
	}

	public synchronized void setEmail(String email) {
		Email = email;
	}

	public synchronized int getPhone() {
		return phone;
	}

	public synchronized void setPhone(int phone) {
		this.phone = phone;
	}
	
	
	
	
}
