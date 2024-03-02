package com.woozi.learspringframwork.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfig {
	
	@Bean
	public Game game() {
		Game game = new PackmanGame();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(Game game) {
		GameRunner gameRunner = new GameRunner(game);
		return gameRunner;
	}
	
}
