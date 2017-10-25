package com.furnitureSale.dao;

import com.furnitureSale.model.User;
import com.furnitureSale.util.HibernateUtil;

public class UserDaoImpl implements UserDao {
	HibernateUtil hibernateUtil = new HibernateUtil();

	@Override
	public User findUser(String email, String pwd) {
		hibernateUtil.openCurrentSession();
		User user =(User)hibernateUtil.getCurrentSession().createQuery("from User where email='"+email+"' and pwd='"+pwd+"' ").uniqueResult();
		hibernateUtil.closeCurrentSession();
		return user;
	
	}

	@Override
	public String addUser(User user) {
		hibernateUtil.openCurrentSessionwithTransaction();
		hibernateUtil.getCurrentSession().save(user);
		hibernateUtil.closeCurrentSessionwithTransaction();

		return "Saved";
	}

}
