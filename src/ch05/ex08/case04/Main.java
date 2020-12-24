package ch05.ex08.case04;

public class Main {
	public static void main(String[] args) {
		Deposit deposit1 = new Deposit();
		Deposit deposit2 = new Deposit(500);
		Deposit deposit3 = new Deposit(500, 100);
		
		System.out.printf("%s, %s, %s", deposit1, deposit2, deposit3);
	}
}
