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
		Game packmanGame = new PackmanGame(); // 객체 생
//		GameRunner gameRunner = new GameRunner(superGame);
		GameRunner gameRunner2 = new GameRunner(packmanGame); // 객체 생성 + 의존성 주입
//		gameRunner.run();
		gameRunner2.run();
	}
}
