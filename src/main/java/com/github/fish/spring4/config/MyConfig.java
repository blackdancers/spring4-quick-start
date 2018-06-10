package com.github.fish.spring4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.github.fish.spring4.bean.MyBean;
import com.github.fish.spring4.bean.RunnableFactoryBean;
import com.github.fish.spring4.bean.User;
import com.github.fish.spring4.dao.UserDao;
import com.github.fish.spring4.domain.Car;
import com.github.fish.spring4.domain.CarFactory;
import com.github.fish.spring4.domain.Jeep;
import com.github.fish.spring4.domain.JeepFactory;

/**
 * 配置类
 * @author Administrator
 *
 */
@Configuration
public class MyConfig {
	
	@Primary
	@Bean
	public UserDao createUserDao() {
		return new UserDao();
	}
	
	@Bean
	public User createUser() {
		return new User();
	}
	
	
	
	@Bean
	public JeepFactory createJeepFactory() {
		return new JeepFactory();
	}
	
	@Bean
	public Jeep createJeep(JeepFactory jeepFactory) {
		return jeepFactory.create();
	}
	
	@Bean
	public CarFactory createCarFactory() {
		return new CarFactory();
	}
	
	@Bean
	public Car createCar(CarFactory carFactory) {
		return carFactory.create();
	}
	
	
	@Bean
	public RunnableFactoryBean createRunnableFactoryBean() {
		return new RunnableFactoryBean();
	}
	
	/**
	 * 
	 * 配置一个Bean ,默认是单例的
	 * @return
	 */
	@Bean(name="myBean")
	@Scope("prototype") //多例
	public MyBean createMyBean() {
		return new MyBean();
	}
}
