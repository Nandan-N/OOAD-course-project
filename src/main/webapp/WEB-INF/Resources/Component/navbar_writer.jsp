
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!--  
<nav class="navbar navbar-expand-lg navbar-dark" style="background-color:  #333333;">
  <div class="container-fluid">
    <a class="navbar-brand" href="#"><i class="fa-solid fa-mug-hot"></i>
  Gang Of Forks</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
      
        
       
      <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="${pageContext.request.contextPath}/writer/viewRequest"><i class="fa-solid fa-hand"></i>View Request</a>
        </li>
      <li class="nav-item">
          <a class="nav-link" href="${pageContext.request.contextPath}/course/viewCourses"><i class="fa-solid fa-bell"></i> View Courses</a>
       </li>
       
       
       
       
       
       
       
       
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false"><i class="fa-solid fa-bell"></i>
            Add Recipes
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
          <c:if test="${not empty userObj }">
					<li><a class="dropdown-item"
						href="${pageContext.request.contextPath}/writer/beverages"><i class="fa-solid fa-mug-hot"></i>Beverages</a></li>
					
				</c:if>
            <li><a class="dropdown-item" href="#">Continental</a></li>
            
            <li><a class="dropdown-item" href="#">Indian</a></li>
          </ul>
        </li>
         <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false"><i class="fa-solid fa-bell"></i>
            View Recipes
          </a>
          <a class="nav-link" href="${pageContext.request.contextPath}/writer/viewCourses"><i class="fa-solid fa-bell"></i> View Recipes</a>
          
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
           
            <c:if test="${not empty userObj }">
					<li><a class="dropdown-item"
						href="${pageContext.request.contextPath}/writer/beverages_w"><i class="fa-solid fa-mug-hot"></i>Beverages</a></li>
					
				</c:if>
            <li><a class="dropdown-item" href="">Continental</a></li>
            
            <li><a class="dropdown-item" href="#">Indian</a></li>
          </ul>
        </li>
        
        
        
      </ul>
      
      
      
      
     <form class="d-flex">
				<c:if test="${empty userObj }">
					<a href="${pageContext.request.contextPath}/loginWriter" class="btn btn-light me-2" type="submit">Login</a>
	
				</c:if>
				<c:if test="${not empty userObj }">
					<a href="#" class="btn btn-light me-2" type="submit"><i
						class="fa-solid fa-user"></i>Writer</a>
					<a href="${pageContext.request.contextPath}/home" class="btn btn-light" type="submit">Logout</a>
				</c:if>

			</form>
    </div>
  </div>
</nav>-->




<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<nav class="navbar navbar-expand-lg navbar-dark" style="background-color:  #333333;">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">
  CourseHub</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
      
      
      <li class="nav-item">
    		<a class="nav-link" href="${pageContext.request.contextPath}/writer/beverages_w">Add more Courses</a>
	  </li>

      </li>
      
      

       
       
       
       
       
       

        
        
        
      </ul>
      
      
      
      

  </div>
</nav>