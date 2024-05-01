	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Registration</title>
    <!-- Include any necessary CSS or JavaScript files -->
</head>
<body>

<h2>Student Registration Form</h2>

<form action="${pageContext.request.contextPath}/register" method="get">
    <label for="firstName">First Name:</label><br>
    <input type="text" id="firstName" name="firstName" required><br>

    <label for="lastName">Last Name:</label><br>
    <input type="text" id="lastName" name="lastName" required><br>

    <label for="email">Email:</label><br>
    <input type="email" id="email" name="email" required><br>

    <label for="password">Password:</label><br>
    <input type="password" id="password" name="password" required><br>

    <input type="submit" value="Submit">
</form>

<!-- Include any necessary JavaScript files -->

</body>
</html>
    