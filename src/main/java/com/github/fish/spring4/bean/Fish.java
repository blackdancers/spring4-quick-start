package com.github.fish.spring4.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Fish {
	
	@Autowired
	private ApplicationContext applicationContext;

	public void show() {
		System.err.println("fish : "+applicationContext.getClass());
	}
}
