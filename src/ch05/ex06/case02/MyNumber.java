package ch05.ex06.case02;

public class MyNumber {
	private static int x;
	private int y;
	
	public static void init1() {
		MyNumber.x = 1;
		//y = 2;
	}
	
	public void init2() {
		MyNumber.x = 1;
		this.y = 2;
	}
}	
