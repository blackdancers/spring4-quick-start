package com.github.fish.spring4.init;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Bean初始化
 * @author Administrator
 *
 */
public class Cat implements InitializingBean,DisposableBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("--------------afterPropertiesSet--------------");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("--------------destroy--------------");
	}


}
