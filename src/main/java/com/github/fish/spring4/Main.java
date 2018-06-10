package com.github.fish.spring4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.github.fish.spring4.bean.Bank;
import com.github.fish.spring4.bean.Book;
import com.github.fish.spring4.bean.Fish;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.github.fish.spring4");
		/**
		 * 三种方法注入依赖
		 */
		context.getBean(Fish.class).show();
		context.getBean(Book.class).show();
		context.getBean(Bank.class).show();
		
		context.close();

	}

}
