package ch07.ex02.case02;

public class Score {
	public static void main(String[] args) {
		int sum = 0;
		double average = 0.0;
		int[] scores = {100, 57, 75, 90};
		
		for(int score: scores) sum += score;
		
		average = 1.0 * sum / scores.length;
		
		System.out.printf("%d %.1f", sum, average);
	}
}
