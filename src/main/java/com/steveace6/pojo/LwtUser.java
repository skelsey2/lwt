package com.steveace6.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lwt-user")
public class LwtUser {

	@Id
	@Column(name="user_id")
	private int userId;
	
	@Column(name="first_name")
	private String firstName;

	public int getUserId() {
		return userId;
	}
	
	public LwtUser(){}
	

	public LwtUser(int userId, String firstName) {
		super();
		this.userId = userId;
		this.firstName = firstName;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "LwtUser [userId=" + userId + ", firstName=" + firstName + "]";
	} 
	
}
