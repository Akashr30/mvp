package com.furnitureSale.service;

import com.furnitureSale.model.User;

public interface UserService {
	public User findUser(String email, String pwd);

	public String addUser(User user);
}
