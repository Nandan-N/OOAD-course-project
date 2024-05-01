<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <%@include file="/WEB-INF/Resources/Component/All_link.jsp" %>

    <style>
        .login-form {
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            padding: 20px;
            border-radius: 10px;
            width: 400px; /* Adjust the width as needed */
            background-color: rgba(255, 255, 255, 0.9);
            box-shadow: 0px 0px 10px 0px rgba(0, 0, 0, 0.3);
        }
        .card-header {
            background-color: #333333;
            color: white;
            padding: 15px 0;
            border-radius: 10px 10px 0 0;
        }
        .card-body {
            padding: 20px;
        }
        .form-control {
            margin-bottom: 15px;
        }
        .btn-login {
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 5px;
            padding: 10px 0;
            cursor: pointer;
        }
        .btn-login:hover {
            background-color: #0056b3;
        }
        .card-footer {
            background-color: #f8f9fa;
            border-top: 1px solid #dee2e6;
            border-radius: 0 0 10px 10px;
            padding: 15px 20px;
        }
    </style>
</head>
<body>
    <%@include file="/WEB-INF/Resources/Component/Nav_bar.jsp"%>
    <div class="container-fluid">
        <div class="login-form">
            <div class="container mt-5">
                <div class="row">
                    <div class="col-md-12">
                        <div class="card">
                            <div class="card-header text-center">
                                <h3>Login</h3>
                                <c:if test="${not empty msg }">
                                    <p class="fs-5 fw-bold text-danger">${msg }</p>
                                    <c:remove var="msg" />
                                </c:if>
                            </div>
                            <div class="card-body">
                                <form action="loginInt" method="post">
                                    <div class="mb-3">
                                        <label>Enter Name</label> 
                                        <input type="text" name="name" class="form-control">
                                    </div>
                                    <div class="mb-3">
                                        <label>Enter Email</label> 
                                        <input type="email" name="email" class="form-control">
                                    </div>
                                    <div class="mb-3">
                                        <label>Enter Password</label> 
                                        <input type="password" name="password" class="form-control">
                                    </div>
                                    <button class="btn col-md-12 btn-login">Login</button>
                                </form>
                            </div>
                            <div class="card-footer text-center">
                                <!-- Add any footer content if needed -->
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
