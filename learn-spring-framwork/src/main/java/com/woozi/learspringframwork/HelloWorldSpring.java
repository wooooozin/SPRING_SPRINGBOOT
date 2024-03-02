package com.woozi.learspringframwork;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.woozi.learspringframwork.game.Game;
import com.woozi.learspringframwork.game.GameRunner;
import com.woozi.learspringframwork.game.MarioGame;
import com.woozi.learspringframwork.game.PackmanGame;
import com.woozi.learspringframwork.game.SuperGame;

public class HelloWorldSpring {

	public static void main(String[] args) {
		// 스프링 콘텍스트실행
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		// 설정 @Configuration
		System.out.println( context.getBean("name"));
	}
}
