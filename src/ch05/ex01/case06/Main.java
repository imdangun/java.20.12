package ch05.ex01.case06;

public class Main {
	public static void main(String[] args) {
		User user = new User();
		
		user.setName("최한석");
		user.setAge(25);
		System.out.printf("이름: %s, 나이: %d\n", user.getName(7), user.getAge(7));
		System.out.printf("이름: %s, 나이: %d\n", user.getName(1), user.getAge(1));
		
		user.setName("한아름");
		user.setAge(39);
		System.out.printf("이름: %s, 나이: %d\n", user.getName(7), user.getAge(1));
		
		/*
		user.name = "양승일";
		user.age = 25;
		System.out.printf("이름: %s, 나이: %d\n", user.name, user.age);
		*/
	}
}
