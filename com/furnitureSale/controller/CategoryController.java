package com.furnitureSale.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.furnitureSale.model.CategoryTable;
import com.furnitureSale.service.CategoryService;
import com.furnitureSale.service.CategoryServiceImpl;

@Path("/category")
public class CategoryController {
	
	CategoryService CategoryService = new CategoryServiceImpl();

	@Path("/getAllCategoryTable")
	@GET
	@Produces("application/json")
	public List<CategoryTable> getCategoryTable()
	{
		return CategoryService.getCategoryTable();
	}
}