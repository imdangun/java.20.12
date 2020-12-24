package ch05.ex07.case02;

public class Stack {
	public void first() {
		System.out.println("first 시작.");
		
		int a = 0;
		this.second();
		
		System.out.println("first 끝.");
	}
	
	public void second() {
		System.out.println("second 시작.");
		
		int a = 0;
		//int a = 0;
		
		System.out.println("seocond 끝.");
	}
}
