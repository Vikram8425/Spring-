package com.learn.java.config_learn;

import org.springframework.beans.factory.annotation.Autowired;
public class StudentService {
	
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
