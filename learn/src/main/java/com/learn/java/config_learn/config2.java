package com.learn.java.config_learn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config2 {
	
	@Bean("user")
	public user User() {
		user u=new user();
		u.setUsername("Raj");
		return u;
	}

}
