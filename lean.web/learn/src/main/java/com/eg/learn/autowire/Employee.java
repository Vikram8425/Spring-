package com.eg.learn.autowire;

public class Employee {
	
	private String name;
      private  String id;
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	public Employee(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public Employee() {
		
	}
	
}
