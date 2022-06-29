package com.eg.learn.autowire;

public class EmployeeService {
	
	private Employee emp;
	private Address ad;

	public Address getAd() {
		return ad;
	}

	public void setAd(Address ad) {
		this.ad = ad;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "EmployeeService [emp=" + emp + "]";
	}
	

}
