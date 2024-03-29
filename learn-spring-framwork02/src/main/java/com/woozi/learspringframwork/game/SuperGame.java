package com.woozi.learspringframwork.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperGame")
public class SuperGame implements Game {
	
	public void up() {
		System.out.println("JUMP!");
	}
	
	public void down() {
		System.out.println("GO into a hole!");
	}
	
	public void left() {
		System.out.println("Go back!");
	}
	
	public void right() {
		System.out.println("Accelereate!");
	}

}
