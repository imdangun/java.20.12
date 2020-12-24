package ch05.ex08.case02;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		User user1 = new User("최한석", 25, LocalDate.now());
		User user2 = new User("한아름", 30, LocalDate.now());
		
		User user3 = new User();
		user3.setName("양승일");
		user3.setAge(46);
		user3.setRegDate(LocalDate.now());
		
		System.out.printf("%s\n%s\n%s", user1, user2, user3);
	}
}
