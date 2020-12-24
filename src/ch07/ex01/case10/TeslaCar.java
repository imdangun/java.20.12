package ch07.ex01.case10;

public class TeslaCar implements SmartCar {
	private SmartCar software; // dependency
	
	public TeslaCar(SmartCar software) { // DI(Dependency Injection
		this.software = software;
	}
	
	@Override
	public void start() {
		software.start();
	}
	
	@Override
	public void stop() {
		software.stop();
	}
	
	@Override
	public void klaxon() {
		software.klaxon();
	}
	
	public void setSoftware(SmartCar software) {
		this.software = software;
	}
}
