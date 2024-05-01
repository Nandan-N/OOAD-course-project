<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="/WEB-INF/Resources/Component/All_link.jsp"%>

 <style>
        .btn-brown {
            background-color: #333333;
            color: white;
        }
    </style>

</head>
<body style="background-color: #f0f0f0;">
	<%@include file="/WEB-INF/Resources/Component/navbar_writer.jsp"%>
	<div class="container-fluid p-2">
		<h4 class="text-center">View Requests</h4>
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
							

						<div class="text-center">
								
							

<a href="deleteRequest?id=${n.id}" class="btn btn-brown btn-sm">Delete</a>
								
							</div>
							
						</div>


					</div>
				</div>
			</c:forEach>
			
		</div>
	</div>


</body>
</html>