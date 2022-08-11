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
		<h1 class="d-flex justify-content-center"><c:out value="${expense.expenseName}"/> <a href="/expense" class="btn btn-success">Go Back</a></h1>
		<div class="container mt-3 d-flex flex-column justify-content-center">
			<h2>Vendor: <c:out value="${expense.vendor}"/></h2>
			<h2>Amount: <c:out value="${expense.expenseAmount}"/></h2>
			<h2>Description: <c:out value="${expense.description}"/></h2>
			

		
		</div>
	</body>
</html>