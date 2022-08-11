<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
		<!-- YOUR own local CSS -->
		<link rel="stylesheet" href="/css/main.css"/>
		<!-- For any Bootstrap that uses JS or jQuery-->
		<script src="/webjars/jquery/jquery.min.js"></script>
		<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
		<link rel="stylesheet" type="text/css" href="/css/style.css">
		<script type="text/javascript" src="/js/app.js"></script>
	</head>
	<body>
		<table class="table">
		  <thead>
		    <tr>
		      <th scope="col">ID</th>
		      <th scope="col">Title</th>
		      <th scope="col">Language</th>
		      <th scope="col"># Pages</th>
		    </tr>
		  </thead>
		  <tbody>
		  	<c:forEach var="book" items="${books}">
		  	<tr>
		      <th><a href="/books/${book.id}"><c:out value="${book.id}"/></a></th>
		      <th><c:out value="${book.title}"/></th>
		      <th><c:out value="${book.language}"/></th>
		      <th><c:out value="${book.numberOfPages}"/></th>
		    </tr>
		  	</c:forEach>
		    </tr>
		  </tbody>
		</table>
	</body>
</html>