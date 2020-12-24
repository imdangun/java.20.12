package ch07.ex01.case10;

public class GoogleCar implements SmartCar {
	@Override
	public void start() {
		System.out.println("Google start.");
	}
	
	@Override
	public void stop() {
		System.out.println("Google stop.");
	}
	
	@Override
	public void klaxon() {
		System.out.println("Google klaxon.");
	}
}
