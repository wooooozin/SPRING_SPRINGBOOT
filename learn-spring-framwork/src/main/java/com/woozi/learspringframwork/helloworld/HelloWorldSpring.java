package com.woozi.learspringframwork.helloworld;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class HelloWorldSpring {

	public static void main(String[] args) {
		try (// 스프링 콘텍스트실행
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			// 설정 @Configuration
			System.out.println( context.getBean("name"));
			System.out.println( context.getBean("age"));
			System.out.println( context.getBean("adress"));
			System.out.println( context.getBean("person2"));
			System.out.println( context.getBean(Adress.class));
			System.out.println( context.getBean(Person.class));
			System.out.println(context.getBean("personParameters"));

			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}
}
