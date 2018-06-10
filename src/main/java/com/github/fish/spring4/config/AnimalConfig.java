package com.github.fish.spring4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.fish.spring4.init.Animal;
import com.github.fish.spring4.init.Cat;
import com.github.fish.spring4.init.Dog;

@Configuration
public class AnimalConfig {

	@Bean
	public Animal createAnimal() {
		return new Animal();
	}
	/**
	 * 指定初始化、销毁方法
	 * @return
	 */
	@Bean(initMethod="init",destroyMethod="destroy")
	public Dog createDog() {
		return new Dog();
	}
	
	@Bean
	public Cat createCat() {
		return new Cat();
	}
}
