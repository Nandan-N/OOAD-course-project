<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Course Upload</title>
    <%@include file="/WEB-INF/Resources/Component/All_link.jsp" %>

    <style>
        /* Global Styles */
        body {
            background-color: #f0f0f0;
            font-family: Arial, sans-serif;
        }

        .container {
            max-width: 800px;
            margin: 0 auto;
            padding: 20px;
        }

        /* Form Styles */
        .card {
            border-radius: 10px;
            box-shadow: 0px 0px 10px 0px rgba(0, 0, 0, 0.3);
        }

        .card-header {
            background-color: #333333;
            color: white;
            border-radius: 10px 10px 0 0;
            padding: 15px 0;
            text-align: center;
            margin-bottom: 20px;
        }

        .card-body {
            padding: 20px;
        }

        .form-control {
            margin-bottom: 15px;
        }

        .btn-upload {
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 5px;
            padding: 10px 0;
            cursor: pointer;
        }

        .btn-upload:hover {
            background-color: #0056b3;
        }

        /* Table Styles */
        .table {
            margin-bottom: 0;
            width: 100%;
            border-collapse: collapse;
        }

        .table th,
        .table td {
            padding: 8px;
            text-align: left;
            border-bottom: 1px solid #dee2e6;
        }

        .table th {
            background-color: #f8f9fa;
        }

        .table tbody tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        .table tbody tr:hover {
            background-color: #e2e6ea;
        }
    </style>
</head>
<body>
    <%@include file="/WEB-INF/Resources/Component/Nav_bar.jsp"%>
    <div class="container">
        <div class="card">
            <div class="card-header">
                <h3>Upload Course</h3>
                <c:if test="${not empty msg }">
                    <p class="fs-5 fw-bold text-danger">${msg }</p>
                    <c:remove var="msg" />
                </c:if>
            </div>
            <div class="card-body">
                <form action="saveCourse" method="post">
                    <div class="mb-3">
                        <label>Course Title</label>
                        <input type="text" name="title" class="form-control">
                    </div>
                    <div class="mb-3">
                        <label>Description</label>
                        <textarea name="description" class="form-control"></textarea>
                    </div>
                    <!-- Add hidden input fields for instructor details -->
                    <input type="hidden" name="email" value="${userObj.email}">
                    <input type="hidden" name="name" value="${instructorName}">
                    <!-- You can add more fields as needed for course upload -->
                    <button class="btn col-md-12 btn-upload">Upload Course</button>
                </form>
            </div>
            <div class="card-footer">
                <!-- Display instructor's courses -->
                <h3>Your Courses</h3>
                <table class="table">
                    <thead>
                        <tr>
                            <th>Title</th>
                            <th>Created At</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="course" items="${instructorCourses}">
                            <tr>
                                <td>${course.title}</td>
                                <td>${course.createdAt}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>
