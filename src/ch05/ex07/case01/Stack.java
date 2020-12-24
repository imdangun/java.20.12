package ch05.ex07.case01;

public class Stack {
	public static void first() {
		System.out.println("first 시작.");
		
		try {
			Thread.sleep(1000);
		} catch(Exception e) {}
		
		Stack.second();
		
		try {
			Thread.sleep(1000);
		} catch(Exception e) {}
		
		System.out.println("first 끝.");
	}
	
	public static void second() {
		System.out.println("second 시작.");
		
		try {
			Thread.sleep(1000);
		} catch(Exception e) {}
		
		System.out.println("second 끝.");
	}
}
