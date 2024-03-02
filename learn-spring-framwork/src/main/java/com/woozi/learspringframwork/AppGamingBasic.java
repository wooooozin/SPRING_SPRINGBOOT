package com.woozi.learspringframwork;

import com.woozi.learspringframwork.game.Game;
import com.woozi.learspringframwork.game.GameRunner;
import com.woozi.learspringframwork.game.MarioGame;
import com.woozi.learspringframwork.game.PackmanGame;
import com.woozi.learspringframwork.game.SuperGame;

public class AppGamingBasic {

	public static void main(String[] args) {
		
		Game superGame = new SuperGame();
		Game marioGmae = new MarioGame();
		Game packmanGame = new PackmanGame();
//		GameRunner gameRunner = new GameRunner(superGame);
		GameRunner gameRunner2 = new GameRunner(packmanGame);
//		gameRunner.run();
		gameRunner2.run();
	}
}
