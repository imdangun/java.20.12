package ch05.ex05.case10;

public class Main {
	public static void main(String[] args) {
		Cooker cooker = new Cooker();
		Noodle noodle = new Noodle();
		Cucumber cucumber = new Cucumber();
		Gochujang gochujang = new Gochujang();
		
		cooker.wash(noodle);
		cooker.wash(cucumber);
		cooker.boil(noodle);
		cooker.mix(noodle, cucumber, gochujang);
		
		cooker.cook(noodle, cucumber, gochujang);
		
		cooker.cook(noodle, cucumber, gochujang);
	}
}
