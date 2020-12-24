package ch05.ex03.case03;

public class Main {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.setPrice(5000);
		car1.setMaker("tesla");
		
		car2.setPrice(3000);
		car2.setMaker("hyundai");
		
		car1.startUp();
		car2.startUp();
	}
}
