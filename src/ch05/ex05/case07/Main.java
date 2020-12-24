package ch05.ex05.case07;

public class Main {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.setName("늠름이");
		
		Cat cat2 = cat1.breed();
		cat2.setName("이쁜이");
		
		System.out.printf("엄마: %s, 아기: %s", cat1, cat2);
	}
}
