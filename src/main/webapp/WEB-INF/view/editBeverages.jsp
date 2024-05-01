<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Courses</title>
    <%@include file="/WEB-INF/Resources/Component/All_link.jsp"%>
</head>
<body style="background-color: #f0f0f0;">
    <%@include file="/WEB-INF/Resources/Component/navbar_writer.jsp"%>
    <div class="container mt-5">
        <div class="row">
            <div class="col-md-10 offset-md-1">
                <div class="card">
                    <div class="card-header text-center">
                        <h3>Course Enrollment</h3>
                    </div>
                    <div class="card-body">
                        <!-- Recipe form -->
 
                        
                        <!-- Enrollment form -->
                        <form action="enrollCourse" method="post">
                            <div class="mb-3">
                                <label>Course Title</label>
                                <input type="text" id="title" name="title" required />
                            </div>
                            <div class="mb-3">
                                <label>Email:</label>
                                <input type="email" id="email" name="email" required />
                            </div>
                            <div class="mb-3">
                                <label>Password:</label>
                                <input type="password" id="password" name="password" required />
                            </div>
                            <button type="submit" class="btn btn-brown btn-sm">Enroll</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
