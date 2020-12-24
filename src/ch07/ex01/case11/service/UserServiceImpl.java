package ch07.ex01.case11.service;

import ch07.ex01.case11.dao.UserDao;
import ch07.ex01.case11.domain.User;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public User getUser() {
		return userDao.selectUser();
	}
}
