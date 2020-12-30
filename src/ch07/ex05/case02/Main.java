package ch07.ex05.case02;

public class Main {
	public static void main(String[] args) {
		Human human = () -> System.out.println("Human say.");
		human.say(); // Human say.
		//human.walk();
		Human.walk(); // Human walk.	
		System.out.println();
		
		human = new Student(); 
		human.say(); // Student say.
	}
}
