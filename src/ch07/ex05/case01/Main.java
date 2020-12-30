package ch07.ex05.case01;

public class Main {
	public static void main(String[] args) {
		Human human = () -> System.out.println("hello");
		human.say();
	}
}
