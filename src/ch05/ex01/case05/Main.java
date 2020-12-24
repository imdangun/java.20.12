package ch05.ex01.case05;

public class Main {
	public static void main(String[] args) {
		User user = new User();
		
		user.setName("최한석");
		user.setAge(25);
		System.out.printf("이름: %s, 나이: %d\n", user.getName(7), user.getAge(7));
		System.out.printf("이름: %s, 나이: %d\n", user.getName(3), user.getAge(3));
		
		// backdoor
		user.name = "한아름";
		user.age = 30;
		System.out.printf("이름: %s, 나이: %d\n", user.name, user.age);
		
		user.setName("양승일");
		user.setAge(39);
		System.out.printf("이름: %s, 나이: %d", user.getName(7), user.getAge(7));
	}
}
