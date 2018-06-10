package com.github.fish.spring4.bean;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.fish.spring4.domain.Car;
import com.github.fish.spring4.service.UserService;

/**
 * 组件,也是Bean
 * @author Administrator
 *
 */
@Component("myUser")
public class User {
	/**
	 * 依赖注入
	 */
	@Autowired
	private UserService userService;
	
	//JSR 250
	@Resource
	private Car car;
	
	//JSR-330 註解
//	@Inject
//	private Cat cat;
	
	@Override
	public String toString() {
		return "User [userService=" + userService + ", car=" + car/* + ", cat=" + cat*/ + "]";
	}

	
	
}
