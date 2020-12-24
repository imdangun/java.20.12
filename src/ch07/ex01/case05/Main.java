package ch07.ex01.case05;

public class Main {
	public static void main(String[] args) {
		Car car = new FireEngine();
		car.drive();		
		//car.water();
		
		FireEngine fireEngine = (FireEngine)car;
		fireEngine.water();
		fireEngine.drive();
		
		((Car)fireEngine).drive();
	}
}
