<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>CourseHub - Your Online Learning Platform</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="styles.css"> <!-- Assuming you have a separate CSS file -->
</head>
<body>

    <%@include file="/WEB-INF/Resources/Component/Nav_bar.jsp" %>

    <div class="container-fluid p-0 m-0">
        <div class="jumbotron jumbotron-fluid text-center">
            <div class="container">
                <h1 class="display-4">Welcome to CourseHub</h1>
                <p class="lead">Your go-to platform for online learning</p>
                <hr class="my-4">
                <p>Explore a wide range of courses, enhance your skills, and achieve your learning goals.</p>
                <a class="btn btn-primary btn-lg" href="${pageContext.request.contextPath}/register" role="button">Get Started</a>
            </div>
        </div>
        <div class="d-flex justify-content-center">
            <form class="text-center">
                <a href="${pageContext.request.contextPath}/login" class="btn btn-light btn-lg me-2" role="button"><i class="fa-solid fa-right-to-bracket me-2"></i>Instructor Registration</a>
                <a href="${pageContext.request.contextPath}/register" class="btn btn-light btn-lg me-2" role="button"><i class="fa-solid fa-address-card me-2"></i>Register</a>
                <a href="${pageContext.request.contextPath}/loginWriter" class="btn btn-light btn-lg" role="button"><i class="fa-solid fa-pen me-2"></i>Student Login</a>
            </form>
        </div>
    </div>

    <%@include file="/WEB-INF/Resources/Component/All_link.jsp" %>

    <!-- You can add more content or sections as needed -->

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>

