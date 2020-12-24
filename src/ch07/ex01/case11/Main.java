package ch07.ex01.case11;

import ch07.ex01.case11.dao.UserDao;
import ch07.ex01.case11.dao.UserDaoImpl;
import ch07.ex01.case11.presentation.Console;
import ch07.ex01.case11.presentation.UserIo;
import ch07.ex01.case11.service.UserService;
import ch07.ex01.case11.service.UserServiceImpl;

public class Main {
	public static void main(String[] args) {
		UserDao userDao = new UserDaoImpl();
		UserService userService = new UserServiceImpl(userDao);
		UserIo userIo = new UserIo(userService);
		
		Console.info("앱을 시작합니다.");
		userIo.play();
		Console.info("앱을 종료합니다.");
	}
}


