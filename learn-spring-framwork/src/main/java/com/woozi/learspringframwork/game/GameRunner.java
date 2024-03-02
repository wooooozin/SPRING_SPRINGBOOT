package com.woozi.learspringframwork.game;

public class GameRunner {
	
//	MarioGame game;
	SuperGame game;
	
//	public GameRunner(MarioGame game) {
//		this.game = game;
//	}

	public GameRunner(SuperGame superGame) {
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
