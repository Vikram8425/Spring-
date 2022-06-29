package com.example.learn;

public class Student {
	private String name;
    private	int Roll;
	public String getName() {
		return name;
	}
	public int getRoll() {
		return Roll;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRoll(int roll) {
		Roll = roll;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", Roll=" + Roll + "]";
	}
    

}
