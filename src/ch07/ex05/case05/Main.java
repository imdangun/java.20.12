package ch07.ex05.case05;

public class Main {
	public static void main(String[] args) {
		Janitor<Building> janitor1 = (a) -> System.out.println(a + "을 청소하다.");
		
		Janitor<Car> janitor2 = (b) -> System.out.println(b + "를 청소하다.");
		
		janitor1.clean(new Building()); // 빌딩 을 청소하다.
		janitor2.clean(new Car()); // 차를 청소하다.
		
		//janitor1.clean(new Car());
	}
}
