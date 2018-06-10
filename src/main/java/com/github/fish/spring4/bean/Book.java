package com.github.fish.spring4.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 依赖注入
 * @author Administrator
 *
 */
@Component
public class Book implements ApplicationContextAware {
	
	private ApplicationContext applicationContext;
	
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
	
	public void show() {
		System.err.println("book : "+applicationContext.getClass());
	}

}
