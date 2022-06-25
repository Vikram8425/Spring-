package com.learn.java.config_learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(config.class,config2.class);
		
		Person p=context.getBean("person",Person.class);
		Student st=context.getBean("std",Student.class);
		user bean=context.getBean("user",user.class);
		Samosa s=context.getBean("samosa",Samosa.class);
		StudentService stService=context.getBean("samosa",StudentService.class);
		
		System.out.println(p.toString());
		System.out.println(st);
		System.out.println(bean);
		System.out.println(s);
		
	}

}
