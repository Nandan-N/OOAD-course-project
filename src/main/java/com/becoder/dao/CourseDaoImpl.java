package com.becoder.dao;

import java.util.List;
import com.becoder.entity.Instructor;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.becoder.entity.Course;
import com.becoder.entity.Instructor;
import com.becoder.entity.Student;

import jakarta.persistence.criteria.CriteriaBuilder;


@Transactional
@Repository
public class CourseDaoImpl implements CourseDao {

    private HibernateTemplate hibernateTemplate;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        hibernateTemplate = new HibernateTemplate(sessionFactory);
    }

    @Override
    public int saveCourse(Course course) {
        return (Integer) hibernateTemplate.save(course);
    }

    @Override
    public List<Course> getCourses() {
        String sql = "from Course";
        return hibernateTemplate.execute(s -> {
            Query<Course> q = s.createQuery(sql, Course.class);
            return q.getResultList();
        });
    }

    @Override
    public Course getCourseById(int course_id) {
        return hibernateTemplate.get(Course.class, course_id);
    }

    @Override
    public void deleteCourse(int course_id) {
        Course course = hibernateTemplate.get(Course.class, course_id);
        if (course != null) {
            hibernateTemplate.delete(course);
        }
    }

    @Override
    public void updateCourse(Course course) {
        hibernateTemplate.update(course);
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
        
        
        
        
}

	@Override
	public void updateCoursesTaken(Student student) {
		// TODO Auto-generated method stub
		
        hibernateTemplate.execute(session -> {
            session.update(student);
            return null;
        });
		
	}
	
	
//    @Override
//    public List<Course> findCoursesByInstructor(Instructor instructor) {
//    	
//        String hql = "from Course where instructor = :instructor";
//        return hibernateTemplate.execute(session -> {
//            Query<Course> query = session.createQuery(hql, Course.class);
//            query.setParameter("instructor", instructor);
//            return query.getResultList();
//        });
//    }
	
//	@Override
//	public List<Course> findCoursesByInstructor(Instructor instructor) {
//	    String hql = "from Course c where c.instructor = :instructor";
//	    return hibernateTemplate.execute(session -> {
//	        Query<Course> query = session.createQuery(hql, Course.class);
//	        query.setParameter("instructor", instructor);
//	        return query.getResultList();
//	    });
//	}

	
	
 
	
	
	
    
    
    
    
 
	
}

