package ch05.ex04.case02;

public class Main {
	public static void main(String[] args) {
		Card.setWidth(10);
		Card.setHeight(20);
		
		//Card.setKind("spade");
		//Card.setNumber(10);
		
		Card card1 = new Card();
		Card card2 = new Card();
		
		card1.setKind("heart");
		card1.setNumber(7);
		card2.setKind("spade");
		card2.setNumber(4);
		
		System.out.printf("%d, %d\n",  Card.getWidth(), Card.getHeight());   // 10, 20
		System.out.printf("%d, %d\n", card1.getWidth(), card1.getHeight());  // 10, 20
		System.out.printf("%d, %d\n", card2.getWidth(), card2.getHeight());  // 10, 20
		
		card1.setWidth(100);
		System.out.printf("%d, %d", card1.getWidth(), card2.getWidth()); // 100, 100
	}
}
