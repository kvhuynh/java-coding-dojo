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
					<h1><c:out value="${className.className}"/> with <c:out value="${className.user.userName}"/></h1>
				</div>
				<div class="header-right d-flex flex-column justify-content-around">
					<a href="/logout">logout</a>
					<a href="/classes">back to classes</a>
				</div>
			</div>
			<div>
				<h2>Day: <c:out value="${className.dayOfWeek}"/></h2>
				<h2>Cost: <c:out value="${className.price}"/></h2>
				<p><c:out value="${className.description}"/></p>
			</div>
		</div>
	</body>
</html>