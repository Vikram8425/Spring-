package com.learn.java.config_learn;

public class Person {
	int personId;
	String city;
	public int getPersonId() {
		return personId;
	}
	public String getCity() {
		return city;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", city=" + city + "]";
	}
	

}
