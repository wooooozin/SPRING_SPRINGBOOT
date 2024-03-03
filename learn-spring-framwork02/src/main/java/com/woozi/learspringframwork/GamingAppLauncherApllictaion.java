package com.woozi.learspringframwork;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.woozi.learspringframwork.game.Game;
import com.woozi.learspringframwork.game.GameRunner;


@Configuration
@ComponentScan("com.woozi.learspringframwork.game")
public class GamingAppLauncherApllictaion {
	
	public static void main(String[] args) {
		
		try (
				AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(GamingAppLauncherApllictaion.class)
				) {
			context.getBean(Game.class).up();
			context.getBean(GameRunner.class).run();
		} catch (BeansException e) {
			e.printStackTrace();
		}
		
	}
}
