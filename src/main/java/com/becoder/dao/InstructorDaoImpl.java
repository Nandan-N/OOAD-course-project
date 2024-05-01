
package com.becoder.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.becoder.entity.Instructor;

@Transactional
@Repository
public class InstructorDaoImpl implements InstructorDao {

    private HibernateTemplate hibernateTemplate;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        hibernateTemplate = new HibernateTemplate(sessionFactory);
    }

    @Override
    public int saveInstructor(Instructor instructor) {
        return (Integer) hibernateTemplate.save(instructor);
    }

    @Override
    public List<Instructor> getInstructors() {
        String sql = "from Instructor";
        return hibernateTemplate.execute(s -> {
            Query<Instructor> q = s.createQuery(sql, Instructor.class);
            return q.getResultList();
        });
    }

    @Override
    public Instructor getInstructorById(int id) {
        return hibernateTemplate.get(Instructor.class, id);
    }

    @Override
    public void deleteInstructor(int id) {
        Instructor instructor = hibernateTemplate.get(Instructor.class, id);
        if (instructor != null) {
            hibernateTemplate.delete(instructor);
        }
    }

    @Override
    public void updateInstructor(Instructor instructor) {
        hibernateTemplate.update(instructor);
    }
    
    
    @Override
    public Instructor findByEmailAndPassword(String email, String password) {
        String sql = "from Instructor where email=:em and password=:pwd";
        return hibernateTemplate.execute(s -> {
            Query<Instructor> q = s.createQuery(sql, Instructor.class);
            q.setParameter("em", email);
            q.setParameter("pwd", password);
            return q.uniqueResult();
        });
    }

}
