package ch06.ex05.case06;

public class Fridge implements HomeAppliance {
	@Override public void on() {}
	@Override public void off() {}
	
	@Override public void displayMessage() {}
	@Override public int getTemperature() { return 0; }
	@Override public String getModelName() { return null; } 
}
