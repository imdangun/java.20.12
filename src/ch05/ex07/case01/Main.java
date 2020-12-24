package ch05.ex07.case01;

public class Main {
	public static void main(String[] args) {
		System.out.println("main 시작.");
		
		try {
			Thread.sleep(1000);
		} catch(Exception e) {}
		
		Stack.first();
		
		try {
			Thread.sleep(1000);
		} catch(Exception e) {}
		
		System.out.println("main 끝.");
	}
}
