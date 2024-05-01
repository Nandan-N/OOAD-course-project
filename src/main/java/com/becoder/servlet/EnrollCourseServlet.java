package com.becoder.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.becoder.dao.StudentDao;
import com.becoder.entity.Student;

import java.io.IOException;

@WebServlet("/enrollCourse")
public class EnrollCourseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String courseTitle = request.getParameter("courseTitle");

        // Validate email and password (you should implement this)
        
        

        // Check if student with provided email and password exists in the database
        Student student = StudentDao.findByEmailAndPassword(email, password);

        if (student != null) {
            // Update the student's courses_taken column with the new course title
            String coursesTaken = student.getCoursesTaken();
            if (coursesTaken == null || coursesTaken.isEmpty()) {
                coursesTaken = courseTitle;
            } else {
                coursesTaken += ", " + courseTitle;
            }
            student.setCoursesTaken(coursesTaken);
            StudentDao.update(student);

            // Redirect back to course list page
            response.sendRedirect(request.getContextPath() + "/courseList.jsp?msg=Course enrolled successfully");
        } else {
            // Redirect back to course list page with error message
            response.sendRedirect(request.getContextPath() + "/courseList.jsp?error=Invalid email or password");
        }
    }
}
