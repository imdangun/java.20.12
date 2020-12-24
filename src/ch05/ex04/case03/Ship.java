package ch05.ex04.case03;

public class Ship {
	private int passengerCnt;
	private static int totalPassengerCnt;
	
	public void sail(int passengerCnt) {
		this.passengerCnt = passengerCnt;
		Ship.totalPassengerCnt += passengerCnt;
	}
	
	public static int getTotalPassengerCnt() {
		return Ship.totalPassengerCnt;
	}
}
