package com.github.fish.spring4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.github.fish.spring4.dao.UserDao;

/**
 * 一般用在业务逻辑层
 * @author Administrator
 *
 */
@Service
public class UserService {
	
	@Autowired
	@Qualifier(value="createUserDao")
	private UserDao userDao;

	@Override
	public String toString() {
		return "UserService [userDao=" + userDao + "]";
	}
	
}
