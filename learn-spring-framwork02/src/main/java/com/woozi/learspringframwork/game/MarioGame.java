package com.woozi.learspringframwork.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements Game {
	
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
