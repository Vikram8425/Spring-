package com.eg.learn.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/eg/learn/autowire/config.xml");
		EmployeeService bean=context.getBean("empservice",EmployeeService.class);
		System.out.println(bean);
		System.out.println(bean.getAd());
		
		
	}

}
