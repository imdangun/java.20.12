package ch07.ex02.case03;

public class MaxMin {
	public static void main(String[] args) {
		int[] scores = {77, 88, 91, 33, 100, 55, 95};
		
		int max = scores[0];
		int min = scores[0];
		
		for(int score: scores) {
			if(score > max) max = score;
			if(score < min) min = score;
		}
		
		System.out.printf("%d %d", max, min);
	}
}
