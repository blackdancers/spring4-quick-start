package com.github.fish.spring4.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * spring 4.3 new 
 * @author Administrator
 *
 */
@Component
public class Bank {
	
	
	private ApplicationContext applicationContext;
	
	/**
	 * 构造方法,注入依赖时只能有一个构造方法
	 * @param applicationContext
	 */
	public Bank(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}
	
	public void show() {
		System.err.println("bank : "+applicationContext.getClass());
	}

}
