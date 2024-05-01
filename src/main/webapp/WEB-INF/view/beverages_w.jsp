<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>

<!--  <!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>


 <style>
        .btn-brown {
            background-color:  #333333;
            color: white;
        }
    </style>

</head>
<body style="background-color: #f0f0f0;">
    <%@include file="/WEB-INF/Resources/Component/navbar_writer.jsp"%>
    <div class="container-fluid p-2">
        <h4 class="text-center">Courses</h4>
        <c:if test="${not empty msg }">
            <p class="fs-5 fw-bold text-success text-center">${msg }</p>
            <c:remove var="msg" />
        </c:if>
        <div class="row">
            <c:forEach items="${list}" var="n">
                <div class="col-md-10 offset-md-1 mt-2">
                    <div class="card">
                        <div class="card-body">
                            

                            <p>${n.title }</p>
                            <p>${n.description }</p>
                            <p>${n.instructor}</p>
                            <p>${n.createdAt}</p>
                            

                        <div class="text-center">
                                
                                <a href="editBeverages?id=${course.course_id}" class="btn btn-brown btn-sm">Buy</a>


                                
                            </div>
                            
                        </div>


                    </div>
                </div>
            </c:forEach>
            
        </div>
    </div>


</body>
</html>-->

<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Course List</title>
<%@include file="/WEB-INF/Resources/Component/All_link.jsp"%>

 <style>
        body {
            background-color: #f0f0f0;
            padding-top: 20px;
        }

        .container-fluid {
            padding: 0 15px;
        }

        .card {
            border: none;
            border-radius: 10px;
            box-shadow: 0px 0px 10px 0px rgba(0, 0, 0, 0.1);
            margin-bottom: 20px;
        }

        .card-body {
            padding: 20px;
        }

        .btn-brown {
            background-color: #333333;
            color: white;
            border: none;
            border-radius: 5px;
            padding: 8px 20px;
            transition: background-color 0.3s ease-in-out;
        }

        .btn-brown:hover {
            background-color: #222222;
        }
    </style>

</head>
<body>

    <div class="container-fluid p-2">
        <h4 class="text-center"></h4>
        <c:if test="${not empty msg }">
            <p class="fs-5 fw-bold text-success text-center">${msg }</p>
            <c:remove var="msg" />
        </c:if>
        <div class="row">
            <c:forEach items="${courseList}" var="course">
                <div class="col-md-10 offset-md-1 mt-2">
                    <div class="card">
                        <div class="card-body">
                            <p>${course.title }</p>
                            <p>${course.description }</p>
                            <p>Created At: ${course.created_at }</p>
                            <div class="text-center">
                                <a href="editCourse?id=${course.course_id}" class="btn btn-brown btn-sm">Buy</a>
                            </div>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>
</body>
</html>

