package ch07.ex02.case05;

public class Main {
	public static void main(String[] args) {
		Cat[] cats = new Cat[3];
		
		cats[0] = new Cat("헤롱이");
		cats[1] = new Cat("야코미");
		cats[2] = new Cat("새롬이");
		
		//cats[2] = new Dog();
		
		for(Cat cat: cats) System.out.println(cat);
	}
}
