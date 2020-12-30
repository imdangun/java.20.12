package ch07.ex05.case03;

public class Main {
	public static void main(String[] args) {
		Computer computer = (a, b) -> {
			int result = a + b;
			return result;
		};
		
		int outcome = computer.calc(1, 2); // 3
		System.out.println(outcome);
		
		computer = (a, b) -> {
			int result = a - b;
			return result;
		};
		
		outcome = computer.calc(1, 2);
		System.out.println(outcome); // -1
	}
}
