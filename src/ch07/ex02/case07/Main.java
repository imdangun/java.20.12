package ch07.ex02.case07;

public class Main {
	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		
		animals[0] = new Cat("헤롱이");
		animals[1] = new Dog("왈왈이");
		animals[2] = new Dog("성큼이");
		
		for(Animal animal: animals)
			System.out.println(animal);
		
		Object[] objects = new Object[3];
		objects[0] = new Cat("헤롱이");
		objects[1] = new Dog("왈왈이");
		objects[2] = new Dog("성큼이");
		
		for(Object obj: objects)
			System.out.println(obj);
	}
}
