package com.furnitureSale.service;

import java.util.List;

import com.furnitureSale.dao.CategoryDao;
import com.furnitureSale.model.CategoryTable;
import com.furnitureSale.dao.CategoryDao;
import com.furnitureSale.dao.CategoryDaoImpl;

public class CategoryServiceImpl implements CategoryService{
	CategoryDao CategoryDao = new CategoryDaoImpl();
	@Override
	public List<CategoryTable> getCategoryTable() {
		return CategoryDao.getCategoryTable();
	}

}
