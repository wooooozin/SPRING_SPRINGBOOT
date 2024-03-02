package com.woozi.learspringframwork.game;

public class GameRunner {
	
	Game game;
	

	public GameRunner(Game superGame) {
		this.game = superGame;
	}

	public void run() {
		System.out.println("Running game: " + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
