package ch07.ex01.case10;

public class Main {
	public static void main(String[] args) {
		AppleCar appleCar = new AppleCar();
		GoogleCar googleCar = new GoogleCar();
		
		TeslaCar teslaCar = new TeslaCar(appleCar);		
		teslaCar.start();
		teslaCar.stop();
		teslaCar.klaxon();
		
		teslaCar.setSoftware(googleCar);
		teslaCar.start();
		teslaCar.stop();
		teslaCar.klaxon();
	}
}

