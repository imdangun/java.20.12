package ch05.ex04.case04;

public class Sequence {
	private static int currentNum;
	
	public static int nextNum() {
		return currentNum++;
	}
	
	public static void setCurrentNum(int currentNum) {
		Sequence.currentNum = currentNum;
	}
}
