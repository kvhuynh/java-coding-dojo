<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!-- For form submission and validations -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="/js/app.js"></script>
	<!-- for bootstrap -->
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/css/main.css"/>
	<!-- For any Bootstrap that uses JS or jQuery-->
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	<title>Insert title here</title>
</head>
	<body>
		<div class="container mt-5">
			<div class="header d-flex justify-content-between">
				<div class="header-left">
					<h1>Namaste, <c:out value="${userName.userName}"/>.</h1>
					<h5>Course Schedule</h5>
				</div>
				<div class="header-right d-flex flex-column justify-content-around">
					<a href="/logout">logout</a>
				</div>
			</div>
			<table class="table table-bordered">
			  <thead class="table-dark">
			    <tr>
			      <th scope="col">Class Name</th>
			      <th scope="col">Instructor</th>
			      <th scope="col">Weekday</th>
			      <th scope="col">Price</th>	      
			    </tr>
			  </thead>
			  <tbody>
			  	<c:forEach var="classes" items="${allClasses}">
			  		<tr>
			  			<td class="d-flex justify-content-between"><a href="/classes/${classes.id}"><c:out value="${classes.className}"/></a>
			  			<c:if test="${classes.user.id == instructorId}">
			  				<a href="/classes/${classes.id}/edit" class="btn btn-success">edit</a>
			  			</c:if> 
			  			</td>
			  			<td><c:out value="${classes.user.userName}"/></td>
		  				<td><c:out value="${classes.dayOfWeek}"/></td>
		  				<td><c:out value="${classes.price}"/></td>		  			
		  			</tr>
			  	</c:forEach>
			  </tbody>
			</table>
			<a href="/classes/new" class="btn btn-primary">+ new course</a>
		</div>
		
		
	</body>
</html>