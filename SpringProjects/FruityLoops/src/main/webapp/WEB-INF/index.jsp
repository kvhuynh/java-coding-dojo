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
		<div class="container mt-5">
			<h1>Fruit Store</h1>
			<table class="table table-bordered">
				<thead>
				  <tr>
					<th scope="col">Name</th>
					<th scope="col">Price</th>
				  </tr>
				</thead>
				<tbody>
				<c:forEach var="fruit" items="${fruitList}">
				  <tr>
					<th><c:out value="${fruit.name}"/></th>
					<td><c:out value="${fruit.price}"/></td>
				  </tr>
				</c:forEach>
				</tbody>
			  </table>
		</div>
	</body>
</html>