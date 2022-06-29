package com.learn.java.config_learn;

public class user {
	String Username;

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	@Override
	public String toString() {
		return "user [Username=" + Username + "]";
	}
	

}
