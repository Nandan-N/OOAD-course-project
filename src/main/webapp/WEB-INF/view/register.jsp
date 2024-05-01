<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Register</title>
<%@include file="/WEB-INF/Resources/Component/All_link.jsp" %>

<style>
    .background-image {
        position: relative;
        height: 100vh; /* Set height to 100% of viewport height */
        background-image: url('your-background-image.jpg'); /* Replace 'your-background-image.jpg' with the actual image path */
        background-size: cover; /* Cover the entire viewport */
        background-position: center; /* Center the background image */
    }
    .register-form {
        position: absolute;
        top: 50%; /* Center vertically */
        left: 50%; /* Center horizontally */
        transform: translate(-50%, -50%);
        padding: 20px;
        border-radius: 10px;
        background-color: rgba(255, 255, 255, 0.9); /* Semi-transparent white background */
        width: 400px; /* Adjust the width as needed */
        box-shadow: 0px 0px 10px 0px rgba(0, 0, 0, 0.3); /* Add box shadow for depth */
    }
    .card-header {
        background-color: #333333; /* Dark background color */
        color: white; /* White text color */
        padding: 15px 0; /* Adjust padding as needed */
        border-radius: 10px 10px 0 0; /* Rounded corners */
    }
    .card-body {
        padding: 20px; /* Add padding to the card body */
    }
    .form-control {
        margin-bottom: 15px; /* Add some space between form inputs */
    }
    .btn-register {
        background-color: #007bff; /* Blue button color */
        color: white; /* White text color */
        border: none; /* Remove border */
        border-radius: 5px; /* Rounded corners */
        padding: 10px 0; /* Adjust padding */
        cursor: pointer; /* Add pointer cursor on hover */
    }
    .btn-register:hover {
        background-color: #0056b3; /* Darker blue color on hover */
    }
</style>
</head>
<body>
<%@include file="/WEB-INF/Resources/Component/Nav_bar.jsp"%>
<div class="container-fluid p-0 m-0 background-image">
    
    <div class="register-form">
        
        <div class="row">
            <div class="col-md-12">
                <div class="card">
                    <div class="card-header text-center">
                        <h3>Student Registration</h3>
                        <c:if test="${not empty msg }">
                            <p class="fs-3 fw-bold text-success">${msg }</p>
                            <c:remove var="msg" />
                        </c:if>
                    </div>
                    <div class="card-body">
                        <form action="registerUser" method="post">
                            <div class="mb-3">
                                <label>Enter Full Name</label> <input type="text"
                                    name="Name" class="form-control">
                            </div>

                            <div class="mb-3">
                                <label>Enter Email</label> <input type="email" name="email"
                                    class="form-control">
                            </div>

                            <div class="mb-3">
                                <label>Enter Password</label> <input type="password"
                                    name="password" class="form-control">
                            </div>

                            <button class="btn col-md-12 btn-register">Register</button>
                            <div class="card-footer text-center">
                            <p class="fs-6">
                                Already have an account? <a href="${pageContext.request.contextPath}/loginWriter" class="text-decoration-none">Login</a>
                            </p>
                            </div>

                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
