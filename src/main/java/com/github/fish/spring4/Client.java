package com.github.fish.spring4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.github.fish.spring4.bean.User;
import com.github.fish.spring4.config.AnnotationScan;
import com.github.fish.spring4.init.Animal;
import com.github.fish.spring4.init.Cat;
import com.github.fish.spring4.init.Dog;

public class Client {

	public static void main(String[] args) {
		//spring容器，基于注解+配置+自動掃描包
		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.github.fish.spring4");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationScan.class);
		User user = context.getBean("myUser",User.class);
		System.err.println("1:"+user);
		
		System.err.println(context.getBean(Animal.class));
		System.err.println(context.getBean(Dog.class));
		System.err.println(context.getBean(Cat.class));
		context.close();
		
	}
}
