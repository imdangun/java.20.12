package ch06.ex04.case06;

public class Animal {
	private int age;
	
	public Animal(int age) {
		this.age = 1000 + age;
	}
	
	public void shout() {
		System.out.println("으르릉");
	}
	
	public int getAge() {
		return this.age;
	}
}
