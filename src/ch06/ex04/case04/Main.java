package ch06.ex04.case04;

public class Main {
	public static void main(String[] args) {
		Tablet tablet1 = new Tablet();
		Tablet tablet2 = new Tablet();
		System.out.println(tablet1.equals(tablet2)); // false
		
		Phone phone1 = new Phone("AW-1001");
		Phone phone2 = new Phone("AW-1001");
		System.out.println(phone1.equals(phone2)); // true
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println(str1.equals(str2)); // true
	}
}
