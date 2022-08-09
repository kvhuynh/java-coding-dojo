<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<link rel="stylesheet" type="text/css" href="/css/style.css">
		<!-- for bootstrap -->
		<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
		<!-- YOUR own local CSS -->
		<link rel="stylesheet" href="/css/main.css"/>
		<!-- For any Bootstrap that uses JS or jQuery-->
		<script src="/webjars/jquery/jquery.min.js"></script>
		<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="/js/app.js"></script>
	</head>
	<body>
		<div class="container d-flex flex-column align-items-center mt-5">
			<h1>Here's Your Omikuji!</h1>
			<div class="card border-dark bg-info mt-5 mb-5">
				 <h2>In <c:out value="${number}"/> years, you will live in <c:out 					value="${cityName}"/> with <c:out value="${name}"/> as your roommate, 					<c:out value="${hobby}"/> for a living. The next time you see a <c:out 					value="${livingThing}"/>, you will have good luck. Also, <c:out 					value="${compliment}"/>
				 </h2>
			</div>
			<a href="/">Go Back</a> 
		
		</div>
	</body>
</html>