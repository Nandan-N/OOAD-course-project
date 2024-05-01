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
</head>
<body style="background-color: #f0f0f0;">
	<%@include file="/WEB-INF/Resources/Component/navbar_login.jsp"%>
	<div class="container mt-5">
		<div class="row">
			<div class="col-md-10 offset-md-1">
				<div class="card">
					<div class="card-header text-center">
						<h3>Indian</h3>
						<c:if test="${not empty msg }">
							<p class="fs-3 fw-bold text-success">${msg }</p>
							<c:remove var="msg" />
						</c:if>
					</div>
					<div class="card-body">
						<form action="saveIndian" method="post">
							<div class="mb-3">
								<label>Enter Recipe Name</label> <input type="text" name="title"
									class="form-control">
							</div>

							<div class="mb-3">
								<label>Enter Recipe</label>
								<textarea rows="6" cols="" class="form-control"
									name="description"></textarea>
							</div>
							 <div class="mb-3">
        <label>Upload Picture</label>
        <input type="file" name="imageData" class="form-control-file">
    </div>

							<button class="btn btn-primary mt-4">Save</button>



						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
