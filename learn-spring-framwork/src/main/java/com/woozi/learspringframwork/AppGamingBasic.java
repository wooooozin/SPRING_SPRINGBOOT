package com.woozi.learspringframwork;

import com.woozi.learspringframwork.game.GameRunner;
import com.woozi.learspringframwork.game.MarioGame;

public class AppGamingBasic {

	public static void main(String[] args) {
		
		MarioGame marioGmae = new MarioGame();
		GameRunner gameRunner = new GameRunner(marioGmae);
		gameRunner.run();
		
	}
}
