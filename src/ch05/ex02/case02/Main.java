package ch05.ex02.case02;

public class Main {
	public static void main(String[] args) {
		MyNumber number = new MyNumber();
		number.setA(1);
		number.setB(2);
		
		System.out.println(number.add() + ", " + number.minus());
	}
}
