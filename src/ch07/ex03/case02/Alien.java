package ch07.ex03.case02;

public class Alien extends Life {
	//@Override
	public static void eat() {
		System.out.println("Alien 먹다.");
	}
	
	@Override
	public void shout() {
		System.out.println("Alien 소리치다.");
	}
	
	public static void main(String[] args) {
		Life alien1 = new Alien();
		Alien alien2 = new Alien();
		
		alien1.eat(); // 먹다.
		alien2.eat(); // Alien 먹다.		
		
		alien1.shout(); // Alien 소리치다.
		alien2.shout(); // Alien 소리치다.
		
		Life.eat(); // 먹다.
		Alien.eat(); // Alien 먹다.
	}
}
