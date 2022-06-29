package com.learn.java.config_learn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  // it indicate this class is Configration which we declear privious for injection
@ComponentScan         
public class config {

	@Bean(name="person")
	public Person Person() {
		Person p=new Person();
		p.setCity("Ranchi");
		p.setPersonId(654);
		return  p;
	}
		@Bean("std")
		public Student student() {
			
			Student s=new Student();
			s.setName("Vicky");
			return s;
		}
		
		
	
}
