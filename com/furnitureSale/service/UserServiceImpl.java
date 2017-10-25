package com.furnitureSale.service;

import com.furnitureSale.model.User;
import com.furnitureSale.dao.UserDao;
import com.furnitureSale.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
	UserDao userDao = new UserDaoImpl();
	@Override
	public User findUser(String email, String pwd) {
		
		return userDao.findUser(email, pwd);
	}

	@Override
	public String addUser(User user) {
		
		return userDao.addUser(user);
	}

}
