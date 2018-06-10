package com.github.fish.spring4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.github.fish.spring4.bean.User;
import com.github.fish.spring4.config.MyConfig;
import com.github.fish.spring4.controller.UserController;
import com.github.fish.spring4.dao.UserDao;
import com.github.fish.spring4.service.UserService;

public class APP {

	public static void main(String[] args) {
		//spring容器，基于注解+配置
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class,
				User.class,UserDao.class,UserService.class,UserController.class);
		
		User user = context.getBean("myUser",User.class);
		System.out.println("1:"+user);
		
		//各层注解
//		System.err.println("2:"+context.getBean("userDao"));
//		System.err.println("2:"+context.getBean(UserDao.class));
//		
//		System.err.println("3:"+context.getBeansOfType(UserDao.class));
//		System.out.println("4:"+context.getBean("userService"));
//		System.out.println("5:"+context.getBeansOfType(UserService.class));
//		System.err.println("6:"+context.getBean("userController"));
//		System.err.println("7:"+context.getBeansOfType(UserController.class));
		
		
		//System.err.println(context.getBean(User.class));
		//System.err.println(context.getBean("user"));
		//System.err.println(context.getBean("myUser"));
		System.out.println(context.getBeansOfType(User.class));
		
		//三种bean的初始化和销毁
//		System.err.println(context.getBean(Animal.class));
//		System.err.println(context.getBean(Dog.class));
//		System.err.println(context.getBean(Cat.class));
		//System.err.println(context.getBean(Car.class));
		//System.err.println(context.getBean(Jeep.class));//found 2: createJeep,createRunnableFactoryBean
		
		
		
		//从容器中获取bean,根据类型
		//MyBean bean = context.getBean(MyBean.class);
		//根据方法名称获取bean,默认是单例的
		//Object bean = context.getBean("createMyBean");
		//Object bean = context.getBean("myBean");
		//System.err.println(bean);
		
		
//		System.err.println(context.getBean(RunnableFactoryBean.class));
//		System.err.println(context.getBean("&createRunnableFactoryBean"));//获取RunnableFactoryBean自身  在BeanFactory中String FACTORY_BEAN_PREFIX = "&";
//		System.err.println(context.getBean(Jeep.class));
//		System.err.println(context.getBean("createRunnableFactoryBean"));
		
		context.close();

	}

}
