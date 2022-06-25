package com.example.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context= new ClassPathXmlApplicationContext("com/example/learn/config.xml");
      Student bean=context.getBean("s",Student.class);
             Branch bean1=context.getBean("B",Branch.class);
      System.out.println(bean);
      System.out.println(bean1);
    }
}
