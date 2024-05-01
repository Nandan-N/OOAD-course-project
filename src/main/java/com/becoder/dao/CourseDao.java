package com.becoder.dao;

import java.util.List;

import com.becoder.entity.Course;
import com.becoder.entity.Instructor;
import com.becoder.entity.Student;

public interface CourseDao {

    public int saveCourse(Course course);

    public List<Course> getCourses();

    public Course getCourseById(int course_id);

    public void deleteCourse(int course_id);

    public void updateCourse(Course course);
    
    public Student findByEmailAndPassword(String email, String password);
    
    public void updateCoursesTaken(Student student);

	//List<Course> findCoursesByInstructor(Instructor instructor);
}
