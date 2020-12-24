package ch05.ex05.case01;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		calculator.add(1, 2);
		calculator.add(1,  2, 3);
		calculator.add(1, 2.0);
	}
}
