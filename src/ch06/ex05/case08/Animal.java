package ch06.ex05.case08;

public interface Animal {
	default void eat() {
		System.out.println("입으로 먹다.");
	}
	
	void move();
}
