package com.example.demo.User;

/**
 * User
 */
public class User {

	int id;
	String username;

	public User() {
	}

	public User(int id, String username) {
		this.username = username;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


}
