package com.github.fish.spring4.init;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * JSR标准
 * @author Administrator
 *
 */
public class Animal {

	@PostConstruct
	public void init() throws Exception {
		System.out.println("--------------Animal Init--------------");
	}
	
	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("--------------Animal Destroy--------------");
	}
}
