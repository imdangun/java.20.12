package ch05.ex01.case04;

public class Main {
	public static void main(String[] args) {
		User user = new User();
		user.setName("최한석");
		user.setAge(25);
		
		System.out.printf("이름: %s, 나이: %d", user.getName(), user.getAge());
	}
}
