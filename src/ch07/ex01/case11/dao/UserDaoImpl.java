package ch07.ex01.case11.dao;

import ch07.ex01.case11.domain.User;

public class UserDaoImpl implements UserDao {
	@Override
	public User selectUser() {
		return new User("최한석");
	}
}         