package com.becoder.dao;


import java.util.List;

import com.becoder.entity.Recipe;

import com.becoder.entity.indian;
import com.becoder.entity.request;
public interface UserDao {

	

	public  void deleteUser(int userId);
	   
	public int saveRecipe(Recipe recipe);

	public List<Recipe> getRecipe();

	public Recipe getRecipeById(int id);

	public void deleteBeverages(int id);

	public void updateBeverages(Recipe n);
	
	
	 
	
	public int saveIndian(indian in);

	public List<indian> getindian();

	public indian getindianById(int id);

	public void deleteindian(int id);

	public void updateindian(indian n);
	
	
	
	public int saveRequest(request in);
	public request getRequestById(int id);
	public void deleteRequest(int id);
	public List<request> getRequest();

}
