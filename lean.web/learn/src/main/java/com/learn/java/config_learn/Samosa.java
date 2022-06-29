package com.learn.java.config_learn;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("samosa")
@Lazy
public class Samosa {

	boolean withChatni=false;
	Samosa(){
		System.out.println("Object Create use Lazy");
	}

	@Override
	public String toString() {
		return "Samosa [withChatni=" + withChatni + "]";
	}
	
}
