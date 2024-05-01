package com.becoder.dao;
import javax.transaction.Transactional;


import org.hibernate.SessionFactory;





import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.codec.Hints;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.becoder.entity.Recipe;
import com.becoder.entity.request;
import com.becoder.entity.User;
import com.becoder.entity.indian;

import java.beans.Transient;
import java.util.List;

//@jakarta.transaction.Transactional
@Transactional
@Repository
public class UserDaoImpl implements UserDao {

//	@Autowired private HibernateTemplate hibernateTemplate;
	private HibernateTemplate hibernateTemplate;

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
	    hibernateTemplate = new HibernateTemplate(sessionFactory);
	}
	public int saveUser(User user) {
		int i = (Integer) hibernateTemplate.save(user);
		return i;
	}

	public User login(String email, String password) {

		String sql = "from User where email=:em and password=:pwd";
		
		User user = (User) hibernateTemplate.execute(s -> {
	        Query<User> q = s.createQuery(sql, User.class); // Specify the result type explicitly
	        q.setParameter("em", email);
	        q.setParameter("pwd", password);
	        return q.uniqueResult();
    });

		return user;
	}
	
	
	public void deleteUser(int userId) {
	   User user = hibernateTemplate.get(User.class, userId);
	    if (user != null) {
	        hibernateTemplate.delete(user);
	    }
	}

	
	
//beverages section
	@Override
	public int saveRecipe(Recipe recipe) {

		int i = (Integer) hibernateTemplate.save(recipe);

		return i;
	}

	public List<Recipe> getRecipe() {
	    String sql = "from Recipe";

	    List<Recipe> list = hibernateTemplate.execute(s -> {
	        Query q = s.createQuery(sql);
	        return q.getResultList();
	    });

	    return list;
	}

	@Override
	public Recipe getRecipeById(int id) {
		Recipe n = hibernateTemplate.get(Recipe.class, id);
		return n;
	}

	@Override
	public void deleteBeverages(int id) {
		Recipe n = hibernateTemplate.get(Recipe.class, id);
		hibernateTemplate.delete(n);

	}

	@Override
	public void updateBeverages(Recipe n) {
		hibernateTemplate.update(n);
	}

	
	//Indian section
	
	@Override
	public int saveIndian(indian in) {

		int i = (Integer) hibernateTemplate.save(in);

		return i;
	}

	public List<indian> getindian() {
	    String sql = "from indian";

	    List<indian> list = hibernateTemplate.execute(s -> {
	        Query q = s.createQuery(sql);
	        return q.getResultList();
	    });

	    return list;
	}

	@Override
	public indian getindianById(int id) {
		indian n = hibernateTemplate.get(indian.class, id);
		return n;
	}

	@Override
	public void deleteindian(int id) {
	indian n = hibernateTemplate.get(indian.class, id);
		hibernateTemplate.delete(n);

	}

	@Override
	public void updateindian(indian n) {
		hibernateTemplate.update(n);
	}
	
	
	//request section
	@Override
	public void deleteRequest(int id) {
	request n = hibernateTemplate.get(request.class, id);
		hibernateTemplate.delete(n);
	}
		
		
		@Override
		public int saveRequest(request in) {

			int i = (Integer) hibernateTemplate.save(in);

			return i;
		}
		
		public List<request> getRequest() {
		    String sql = "from request";

		    @SuppressWarnings("unchecked")
			List<request> list = hibernateTemplate.execute(s -> {
		        Query q = s.createQuery(sql);
		        return q.getResultList();
		    });

		    return list;
		}

		@Override
		public request getRequestById(int id) {
			request n = hibernateTemplate.get(request.class, id);
			return n;
		}

		

	

}
