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
		<div class="container">
			<h1 class="d-flex justify-content-center">Dojos and Ninjas</h1>
			<h2>Add a new Dojo</h2>
			<form:form action="/dojo/new/submit" modelAttribute="dojo" method="POST">
				<form:label path="name">Enter New Dojo Name:</form:label>
				<form:input type="text" path="name"></form:input>
				<form:errors path="name"></form:errors>
				<input type="submit" class="btn btn-danger" value="Add Dojo"/>
			</form:form>
			
			<a href="/" class="btn btn-success">Go back</a>
		</div>
	</body>
</html>