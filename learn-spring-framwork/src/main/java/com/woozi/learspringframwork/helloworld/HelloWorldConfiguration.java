package com.woozi.learspringframwork.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, Integer age, Adress adress) { };
record Adress (String detail, String city) { };

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "LOOPY";
	}
	
	@Bean
	public Integer age() {
		return 20;
	}
	
	@Bean
	public Adress adress() {
		Adress adress = new Adress("1-1", "seoul");
		return adress;
	}
	
	@Bean(name = "person2")
	public Person person() {
		Person person = new Person("woozi", 20, adress());
		return person;
	}
	
	@Bean
	@Primary
	public Person personParameters(String name, Integer age, Adress adress) {
		Person person = new Person(name, age, adress);
		return person;
	}
	
	@Bean
	@Qualifier("personQ")
	public Person personQuailifier(String name, Integer age, Adress adress) {
		Person person = new Person(name, age, adress);
		return person;
	}
	

}
