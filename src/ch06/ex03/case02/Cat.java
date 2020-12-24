package ch06.ex03.case02;

public class Cat extends Animal {
	private int age;
	
	public Cat(String name, int age) {
		//super();
		super(name);
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
}