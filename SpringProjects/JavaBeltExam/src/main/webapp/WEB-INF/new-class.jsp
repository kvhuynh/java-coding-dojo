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
		<div class="container mt-5 d-flex flex-column">
			<div class="header d-flex justify-content-between">
				<div class="header-left">
					<h1>Create a Course</h1>
				</div>
				<div class="header-right d-flex flex-column justify-content-around">
					<a href="/logout">logout</a>
					<a href="/books">back to shelves</a>
				</div>
			</div>
			<div>
				<form:form action="/classes/new/submit" modelAttribute="classInfo" class="d-flex flex-column col-6" method="POST">
					<form:label path="className">Name:</form:label>
					<form:input type="text" path="className"></form:input>
					<form:errors path="className"></form:errors>
					
					<form:label path="dayOfWeek">Day of Week</form:label>
					<form:input type="text" path="dayOfWeek"></form:input>
					<form:errors path="dayOfWeek"></form:errors>

					<form:label path="price">Drop-in Price:</form:label>
					<form:input type="number" path="price"></form:input>
					<form:errors path="price"></form:errors>
					
					<form:label path="description">Description</form:label>
					<form:textarea rows="5" cols="10" path="description"></form:textarea>
					<form:errors path="description"/>	
				<div>
					<a href="/classes" class="btn btn-light">Cancel</a>
					<input type="submit" class="btn btn-primary" value="Submit"/>
				</div>		
				</form:form>
			</div>
		</div>
	</body>
</html>