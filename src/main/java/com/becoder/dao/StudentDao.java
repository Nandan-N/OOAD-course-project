package com.becoder.dao;

import java.util.List;

import com.becoder.entity.Course;
import com.becoder.entity.Student;

public interface StudentDao {
	
	

    public int saveStudent(Student student);

    public Student login(String email, String password);

    public void deleteStudent(int studentId);
    
    public Student findByEmailAndPassword(String email, String password);
    
    public void updateCoursesTaken(Student student);
    public int saveCourse(Course course);
    
    Student findByEmail(String email);
    
    
    List<Course> getCoursesTakenByEmail(String email);

    
    
   
    

   

}











