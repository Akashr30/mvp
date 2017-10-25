package com.furnitureSale.dao;

import java.util.List;

import com.furnitureSale.model.CategoryTable;
import com.furnitureSale.util.HibernateUtil;


import net.sf.hibernate.Hibernate;

public class CategoryDaoImpl implements CategoryDao {
	HibernateUtil hibernateUtil = new HibernateUtil();
	@Override
	public List<CategoryTable> getCategoryTable() {
		hibernateUtil.openCurrentSession();
		
		List<CategoryTable> category_records =(List<CategoryTable>)hibernateUtil.getCurrentSession().createQuery("from CategoryTable").list();
		
		hibernateUtil.closeCurrentSession();
		return category_records;
	
	}
	
	
	public static void main(String aaa[])
	{
		CategoryDaoImpl CategoryDaoImpl = new CategoryDaoImpl();
		List<CategoryTable> category_records = CategoryDaoImpl.getCategoryTable();
		for(CategoryTable ct:category_records)
		System.out.println(ct.getCategory_id()+"    "+ct.getCategory_name());
	}

}
