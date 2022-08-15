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
					<h1>Add a Book to Your Shelf</h1>
				</div>
				<div class="header-right d-flex flex-column justify-content-around">
					<a href="/logout">logout</a>
					<a href="/books">back to shelves</a>
				</div>
			</div>
			<div>
				<form:form action="/books/new/submit" modelAttribute="books" class="d-flex flex-column col-6" method="POST">
					<form:label path="bookName">Enter Book Title:</form:label>
					<form:input type="text" path="bookName"></form:input>
					<form:errors path="bookName"></form:errors>
					
					<form:label path="author">Author:</form:label>
					<form:input type="text" path="author"></form:input>
					<form:errors path="author"></form:errors>

					<form:label path="userOpinions">Opinions:</form:label>
					<form:input type="text" path="userOpinions"></form:input>
					<form:errors path="userOpinions"></form:errors>					
					
					<input type="submit" class="btn btn-danger" value="Add Book"/>
				</form:form>
			</div>
		</div>
	</body>
</html>