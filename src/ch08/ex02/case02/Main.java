package ch08.ex02.case02;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		User user1 = new User("최한석", Level.BASIC);
		User user2 = new User("한아름", Level.valueOf(2));
		User user3 = new User("양승일", Level.GOLD);
		
		List<User> users = Arrays.asList(user1, user2, user3);
		
		for(User user: users) {
			try {
				user.upgradeLevel();
			} catch(IllegalStateException e) {
				e.printStackTrace();
			}
		}
		
		for(User user: users)
			System.out.println(user);
	}
}
/*
java.lang.IllegalStateException: 이미 최고 등급 GOLD입니다.
at ch08.ex02.case02.User.upgradeLevel(User.java:16)
at ch08.ex02.case02.Main.main(Main.java:16)
최한석 SILVER
한아름 GOLD
양승일 GOLD
*/