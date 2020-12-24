package ch07.ex01.case11.presentation;

import ch07.ex01.case11.service.UserService;

public class UserIo {
	private UserService userService;
	
	public UserIo(UserService userService) {
		this.userService = userService;
	}
	
	public void play() {
		Console.info(userService.getUser());
	}
}