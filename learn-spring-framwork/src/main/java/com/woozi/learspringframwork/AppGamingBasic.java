package com.woozi.learspringframwork;

import com.woozi.learspringframwork.game.GameRunner;
import com.woozi.learspringframwork.game.MarioGame;
import com.woozi.learspringframwork.game.SuperGame;

public class AppGamingBasic {

	public static void main(String[] args) {
		
		SuperGame superGame = new SuperGame();
		MarioGame marioGmae = new MarioGame();
		GameRunner gameRunner = new GameRunner(superGame);
		gameRunner.run();
		
	}
}
