package com.github.fish.spring4.init;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
/**
 * 初始化设置，
 * 每个bean初始化时调用一次
 * @author Administrator
 *
 */
@Component
public class EchoBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.err.println("1==>> postProcessBeforeInitialization, "+bean.getClass());
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.err.println("2==>> postProcessAfterInitialization, "+bean.getClass());
		return bean;
	}

}
