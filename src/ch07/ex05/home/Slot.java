package ch07.ex05.home;

import java.util.ArrayList;
import java.util.List;

public class Slot {
	private List<Ball> balls;
	
	public Slot() {
		balls = new ArrayList<>();
		
		for(int i = 1; i <= 45; i++)
			balls.add(new Ball(i));
	}
	
	public Ball chuck() {
		return balls.remove((int)(Math.random() * balls.size()));
	}
}
