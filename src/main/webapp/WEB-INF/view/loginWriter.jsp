<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Login</title>
<%@include file="/WEB-INF/Resources/Component/All_link.jsp" %>

<style>
    .background-image {
        position: relative;
        height: 100vh;
        background-image: url('your-background-image.jpg'); /* Replace 'your-background-image.jpg' with the actual image path */
        background-size: cover;
        background-position: center;
    }
    .register-form-container {
        position: absolute;
        top: 50%;
        left: 50%;
        transform: translate(-50%, -50%);
        padding: 20px;
        border-radius: 10px;
        width: 400px;
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
</style>
</head>
<body>
<%@include file="/WEB-INF/Resources/Component/Nav_bar.jsp"%>
<div class="container-fluid p-0 m-0 background-image">
    
    <div class="register-form-container">
        <div class="container mt-5">
            <div class="row">
                <div class="col-md-12">
                    <div class="card">
                        <div class="card-header text-center">
                            <h3>Student Login</h3>
                            <c:if test="${not empty msg }">
                                <p class="fs-5 fw-bold text-danger">${msg }</p>
                                <c:remove var="msg" />
                            </c:if>
                        </div>
                        <div class="card-body">
                            <form action="loginUserWriter" method="post">

                                <div class="mb-3">
                                    <label>Email</label>
                                    <input type="email" name="email" class="form-control">
                                </div>

                                <div class="mb-3">
                                    <label>Password</label>
                                    <input type="password" name="password" class="form-control">
                                </div>

                                <button class="btn col-md-12 btn-login">Login</button>

                            </form>
                            <c:if test="${param.error eq 'true'}">
                                <p class="fs-5 fw-bold text-danger">Login Failed. Please use the correct email and password.</p>
                            </c:if>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>


