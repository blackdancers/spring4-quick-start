package com.github.fish.spring4.bean;

import org.springframework.beans.factory.FactoryBean;

import com.github.fish.spring4.domain.Jeep;

/**
 * bean工厂
 * @author Administrator
 *
 */
public class RunnableFactoryBean implements FactoryBean<Jeep> {

	@Override
	public Jeep getObject() throws Exception {
		return new Jeep();
	}

	@Override
	public Class<?> getObjectType() {
		return Jeep.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

}
