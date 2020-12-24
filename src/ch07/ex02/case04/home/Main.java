package ch07.ex02.case04.home;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Slot slot = new Slot();
		Ball[] balls = new Ball[6];
		
		for(int i = 0; i < 6; i++)
			balls[i] = slot.chuck();
		
		sort(balls);
		
		for(Ball ball: balls)
			System.out.print(ball.getNum() + " ");
	}
	
	private static void sort(Ball[] balls) {
		int[] nums = new int[balls.length];
		
		for(int i = 0; i < balls.length; i++)
			nums[i] = balls[i].getNum();
		
		Arrays.sort(nums);
		
		for(int i = 0; i < balls.length; i++)
			balls[i].setNum(nums[i]);
	}
}
/*
기계에 로또공 45개가 담겨 있다.
위 공에는 1 이상 45 이하의 숫자가 1개 적혀 있다.
위 숫자는 공별로 유일하다.

기계에서 공 6개를 차례대로 뽑는다.
위 공들을 오름차순 정렬해서 나열한다.
--

3 17 22 30 41 45
*/
