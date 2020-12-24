package ch06.ex05.case05;

import java.time.LocalDate;

public interface Electronic {
	public static final int VOLTAGE = 200;
	static final String MAKER = "LG";
	final int WEIGHT = 10;
	LocalDate PRODUCED_DATE = LocalDate.now();
	
	public abstract void displayMessage();
	abstract int getTemperature();
	String getModelName();
}
