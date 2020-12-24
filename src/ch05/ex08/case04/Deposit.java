package ch05.ex08.case04;

public class Deposit {
	private int balance;
	
	public Deposit() {
		//this.balance = 100 + 0;
		this(100, 0);
	}
	
	public Deposit(int principal) {
		//this.balance = 500 + 0;
		this(principal, 0);
	}
	
	public Deposit(int principal, int interest) {
		this.balance = principal + interest;
	}
	
	@Override
	public String toString() {
		return balance + "";
	}
}
