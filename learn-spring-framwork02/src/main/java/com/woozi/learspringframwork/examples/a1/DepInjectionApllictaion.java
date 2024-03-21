package com.woozi.learspringframwork.examples.a1;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class DepInjectionApllictaion {
	
	public static void main(String[] args) {
		
		try (
				AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DepInjectionApllictaion.class)
				) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::print);
		} catch (BeansException e) {
			e.printStackTrace();
		}
		
	}
}
