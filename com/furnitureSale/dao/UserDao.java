package com.furnitureSale.dao;

import com.furnitureSale.model.User;

public interface UserDao {
	public User findUser(String email, String pwd);

	public String addUser(User user);


}
