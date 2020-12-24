package ch05.ex01.case03.home;

public class User {
	String name;
	int age;
	
	@Override
	public String toString() {
		return String.format("이름: %s, 나이: %d", name, age);
	}
}
