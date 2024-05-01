<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Courses</title>
    <!-- Include any necessary CSS or JS files -->
</head>
<body>
    <h1>View Courses</h1>
    <table border="1">
        <thead>
            <tr>
                <th>Course ID</th>
                <th>Title</th>
                <th>Description</th>
                <th>Created At</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${list}" var="course">
                <tr>
                    <!--  <td>${course.course_id}</td>-->
                    <td>${course.title}</td>
                    <td>${course.description}</td>
                    <td>${course.created_at}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
    