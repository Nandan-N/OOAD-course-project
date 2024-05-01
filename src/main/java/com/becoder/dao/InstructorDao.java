package com.becoder.dao;

import java.util.List;

import com.becoder.entity.Course;
import com.becoder.entity.Instructor;

public interface InstructorDao {

    public int saveInstructor(Instructor instructor);

    public List<Instructor> getInstructors();

    public Instructor getInstructorById(int id);

    public void deleteInstructor(int id);

    public void updateInstructor(Instructor instructor);

	Instructor findByEmailAndPassword(String email, String password);

    // Add more instructor-specific methods as needed
}
