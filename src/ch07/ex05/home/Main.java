package ch07.ex05.home;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Slot slot = new Slot();
		List<Ball> balls = new ArrayList<>();
		
		for(int i = 0; i < 6; i++)
			balls.add(slot.chuck());
		
		balls.sort((ball1, ball2) -> {
			return ball1.getNum() - ball2.getNum();
		});
		
		for(Ball ball: balls)
			System.out.print(ball.getNum() + " ");
	}
}
/*
로또 과제를 refactoring 한다.
array 를 List 교체한다.
*/
