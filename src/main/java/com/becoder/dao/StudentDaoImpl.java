//package com.becoder.dao;
//import javax.transaction.Transactional;
//
//import org.hibernate.SessionFactory;
//
//
//
//
//
//import org.hibernate.query.Query;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.codec.Hints;
//import org.springframework.orm.hibernate5.HibernateTemplate;
//import org.springframework.stereotype.Repository;
//
//import com.becoder.entity.Recipe;
//import com.becoder.entity.request;
//import com.becoder.entity.User;
//import com.becoder.entity.indian;
//
//import java.beans.Transient;
//import java.util.List;
//
////@jakarta.transaction.Transactional
//@Transactional
//@Repository
//public class UserDaoImpl implements UserDao {
//
////	@Autowired private HibernateTemplate hibernateTemplate;
//	private HibernateTemplate hibernateTemplate;
//
//	@Autowired
//	public void setSessionFactory(SessionFactory sessionFactory) {
//	    hibernateTemplate = new HibernateTemplate(sessionFactory);
//	}
//	public int saveUser(User user) {
//		int i = (Integer) hibernateTemplate.save(user);
//		return i;
//	}
//
//	public User login(String email, String password) {
//
//		String sql = "from User where email=:em and password=:pwd";
////		
//		User user = (User) hibernateTemplate.execute(s -> {
//	        Query<User> q = s.createQuery(sql, User.class); // Specify the result type explicitly
//	        q.setParameter("em", email);
//	        q.setParameter("pwd", password);
//	        return q.uniqueResult();
//	    });
//
//
//		return user;
//	}
//	
//	
//	public void deleteUser(int userId) {
//	    User user = hibernateTemplate.get(User.class, userId);
//	    if (user != null) {
//	        hibernateTemplate.delete(user);
//	    }
//	}
//
//	
//	
////beverages section
//	@Override
//	public int saveRecipe(Recipe recipe) {
//
//		int i = (Integer) hibernateTemplate.save(recipe);
//
//		return i;
//	}
//
//	public List<Recipe> getRecipe() {
//	    String sql = "from Recipe";
//
//	    List<Recipe> list = hibernateTemplate.execute(s -> {
//	        Query q = s.createQuery(sql);
//	        return q.getResultList();
//	    });
//
//	    return list;
//	}
//
//	@Override
//	public Recipe getRecipeById(int id) {
//		Recipe n = hibernateTemplate.get(Recipe.class, id);
//		return n;
//	}
//
//	@Override
//	public void deleteBeverages(int id) {
//		Recipe n = hibernateTemplate.get(Recipe.class, id);
//		hibernateTemplate.delete(n);
//
//	}
//
//	@Override
//	public void updateBeverages(Recipe n) {
//		hibernateTemplate.update(n);
//	}
//
//	
//	//Indian section
//	
//	@Override
//	public int saveIndian(indian in) {
//
//		int i = (Integer) hibernateTemplate.save(in);
//
//		return i;
//	}
//
//	public List<indian> getindian() {
//	    String sql = "from indian";
//
//	    List<indian> list = hibernateTemplate.execute(s -> {
//	        Query q = s.createQuery(sql);
//	        return q.getResultList();
//	    });
//
//	    return list;
//	}
//
//	@Override
//	public indian getindianById(int id) {
//		indian n = hibernateTemplate.get(indian.class, id);
//		return n;
//	}
//
//	@Override
//	public void deleteindian(int id) {
//	indian n = hibernateTemplate.get(indian.class, id);
//		hibernateTemplate.delete(n);
//
//	}
//
//	@Override
//	public void updateindian(indian n) {
//		hibernateTemplate.update(n);
//	}
//	
//	
//	//request section
//	@Override
//	public void deleteRequest(int id) {
//	request n = hibernateTemplate.get(request.class, id);
//		hibernateTemplate.delete(n);
//	}
//		
//		
//		@Override
//		public int saveRequest(request in) {
//
//			int i = (Integer) hibernateTemplate.save(in);
//
//			return i;
//		}
//		
//		public List<request> getRequest() {
//		    String sql = "from request";
//
//		    List<request> list = hibernateTemplate.execute(s -> {
//		        Query q = s.createQuery(sql);
//		        return q.getResultList();
//		    });
//
//		    return list;
//		}
//
//		@Override
//		public request getRequestById(int id) {
//			request n = hibernateTemplate.get(request.class, id);
//			return n;
//		}
//	
//
//}


//
//
//
//
//
//package com.becoder.dao;
//
//import java.util.List;
//
//import javax.transaction.Transactional;
//import org.hibernate.SessionFactory;
//import org.hibernate.query.Query;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.orm.hibernate5.HibernateTemplate;
//import org.springframework.stereotype.Repository;
//
//import com.becoder.entity.Course;
//import com.becoder.entity.Student;
//import com.becoder.entity.Instructor;
////import com.becoder.entity.Request;
//
//@Transactional
//@Repository
//public class UserDaoImpl implements UserDao {
//
//    private HibernateTemplate hibernateTemplate;
//
//    @Autowired
//    public void setSessionFactory(SessionFactory sessionFactory) {
//        hibernateTemplate = new HibernateTemplate(sessionFactory);
//    }
//
//    @Override
//    public int saveStudent(Student student) {
//        return (Integer) hibernateTemplate.save(student);
//    }
//
//    @Override
//    public Student login(String email, String password) {
//        String sql = "from Student where email=:em and password=:pwd";
//        return hibernateTemplate.execute(s -> {
//            Query<Student> q = s.createQuery(sql, Student.class);
//            q.setParameter("em", email);
//            q.setParameter("pwd", password);
//            return q.uniqueResult();
//        });
//    }
//
//    @Override
//    public void deleteStudent(int studentId) {
//        Student student = hibernateTemplate.get(Student.class, studentId);
//        if (student != null) {
//            hibernateTemplate.delete(student);
//        }
//    }
//
//    @Override
//    public int saveCourse(Course course) {
//        return (Integer) hibernateTemplate.save(course);
//    }
//
////    @Override
////    public List<Course> getCourses() {
////        String sql = "from Course";
////        return hibernateTemplate.execute(s -> {
////            Query<Course> q = s.createQuery(sql, Course.class);
////            return q.getResultList();
////        });
////    }
//
//    @Override
//    public List<Course> getCourses() {
//        String sql = "from Course";
//        return hibernateTemplate.execute(s -> {
//            Query<Course> q = s.createQuery(sql, Course.class);
//            return (List<Course>) q.getResultList(); // Explicit cast to List<Course>
//        });
//    }
//
//    
//    
//    
//    
//    
//    
//    @Override
//    public Course getCourseById(int id) {
//        return hibernateTemplate.get(Course.class, id);
//    }
//
//    @Override
//    public void deleteCourse(int id) {
//        Course course = hibernateTemplate.get(Course.class, id);
//        if (course != null) {
//            hibernateTemplate.delete(course);
//        }
//    }
//
//    @Override
//    public void updateCourse(Course course) {
//        hibernateTemplate.update(course);
//    }
//
//    @Override
//    public int saveInstructor(Instructor instructor) {
//        return (Integer) hibernateTemplate.save(instructor);
//    }
//
//    @Override
//    public List<Instructor> getInstructors() {
//        String sql = "from Instructor";
//        return hibernateTemplate.execute(s -> {
//            Query<Instructor> q = s.createQuery(sql, Instructor.class);
//            return q.getResultList();
//        });
//    }
//
//    @Override
//    public Instructor getInstructorById(int id) {
//        return hibernateTemplate.get(Instructor.class, id);
//    }
//
//    @Override
//    public void deleteInstructor(int id) {
//        Instructor instructor = hibernateTemplate.get(Instructor.class, id);
//        if (instructor != null) {
//            hibernateTemplate.delete(instructor);
//        }
//    }
//
//    @Override
//    public void updateInstructor(Instructor instructor) {
//        hibernateTemplate.update(instructor);
//    }
////
////    @Override
////    public int saveRequest(Request request) {
////        return (Integer) hibernateTemplate.save(request);
////    }
//
////    @Override
////    public List<Request> getRequests() {
////        String sql = "from Request";
////        return hibernateTemplate.execute(s -> {
////            Query<Request> q = s.createQuery(sql, Request.class);
////            return q.getResultList();
////        });
////    }
////
////    @Override
////    public Request getRequestById(int id) {
////        return hibernateTemplate.get(Request.class, id);
////    }
////
////    @Override
////    public void deleteRequest(int id) {
////        Request request = hibernateTemplate.get(Request.class, id);
////        if (request != null) {
//////            hibernateTemplate.delete(request);
//////        }
////    }
////}
//




package com.becoder.dao;

import java.util.Collections;
import java.util.List;
import org.hibernate.Session;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.becoder.entity.Course;
import com.becoder.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;




@Transactional
@Repository
public class StudentDaoImpl implements StudentDao {

    private HibernateTemplate hibernateTemplate;
    
    @Autowired
    private SessionFactory sessionFactory;
    
    
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    

    @PersistenceContext
    private EntityManager entityManager;

    
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        hibernateTemplate = new HibernateTemplate(sessionFactory);
    }

    @Override
    public int saveStudent(Student student) {
        return (Integer) hibernateTemplate.save(student);
    }

    @Override
    public Student login(String email, String password) {
        String sql = "from Student where email=:em and password=:pwd";
        return hibernateTemplate.execute(s -> {
            Query<Student> q = s.createQuery(sql, Student.class);
            q.setParameter("em", email);
            q.setParameter("pwd", password);
            return q.uniqueResult();
        });
    }

    @Override
    public void deleteStudent(int studentId) {
        Student student = hibernateTemplate.get(Student.class, studentId);
        if (student != null) {
            hibernateTemplate.delete(student);
        }
    }
    
    @Override
    public Student findByEmailAndPassword(String email, String password) {
        String sql = "from Student where email=:em and password=:pwd";
        return hibernateTemplate.execute(s -> {
            Query<Student> q = s.createQuery(sql, Student.class);
            q.setParameter("em", email);
            q.setParameter("pwd", password);
            return q.uniqueResult();
        });
        
        

        
        
 
        


        



    


        
 




    // Add more methods specific to student-related operations as needed
}
//
//	@Override
//	public void update(Student student) {
//		// TODO Auto-generated method stub
//		hibernateTemplate.merge(student);
//		
//	}

	@Override
	public void updateCoursesTaken(Student student) {
		// TODO Auto-generated method stub
        hibernateTemplate.execute(session -> {
            session.update(student);
            return null;
        });

		
	}

	@Override
	public int saveCourse(Course course) {
		return (Integer) hibernateTemplate.save(course);
		
		
	}
	
	@Override
	public List<Course> getCoursesTakenByEmail(String email) {
	    String jpql = "SELECT s.coursesTaken FROM Student s WHERE s.email = :email";
	    jakarta.persistence.Query query = entityManager.createQuery(jpql);
	    query.setParameter("email", email);
	    
	    // Assuming coursesTaken is a collection of Course objects in the database
	    try {
	        return query.getResultList();
	    } catch (NoResultException e) {
	        return Collections.emptyList(); // Handle if no result found
	    }
	}

	@Override
	public Student findByEmail(String email) {
		// TODO Auto-generated method stub
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM Student WHERE email = :email", Student.class)
                      .setParameter("email", email)
                      .uniqueResult();
	
	}



        
    }

        
	












