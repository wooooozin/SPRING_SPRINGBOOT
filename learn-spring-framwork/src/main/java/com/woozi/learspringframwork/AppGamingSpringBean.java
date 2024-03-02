package com.woozi.learspringframwork;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.woozi.learspringframwork.game.Game;
import com.woozi.learspringframwork.game.GameConfig;
import com.woozi.learspringframwork.game.GameRunner;

public class AppGamingSpringBean {

	public static void main(String[] args) {
		
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class)) {
			context.getBean(Game.class).up();
			context.getBean(GameRunner.class).run();
		} catch (BeansException e) {
			e.printStackTrace();
		}
		
	}
}
