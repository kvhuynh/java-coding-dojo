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
		<h1 class="d-flex justify-content-center">Send an Omikuji!</h1>
		<div class="container mt-3 d-flex justify-content-center">
			<div class="card border-dark p-5 d-flex flex-column">
				<form class="d-flex flex-column" action="/omikuji/submit" method="POST">
					<label for="number">Pick any number from 5 to 25</label>
					<input type="number" name="number" min="0" max="25" step="1" value="0"/>
					<label for="cityName">Enter the name of any city</label>
					<input type="text" name="cityName"/>
					<label for="name">Enter the name of any real person</label>	
					<input type="text" name="name"/>
					<label for="hobby">Enter professional endeavor or hobby</label>
					<input type="text" name="hobby" />
					<label for="livingThing">Enter any type of living thing</label>
					<input type="text" name="livingThing" />
					<label for="compliment">Say something nice to someone</label>
					<textarea rows="5" cols="10" name="compliment"></textarea>
					<p><em>Send and show a friend</em></p>
					<button>Submit</button>
				</form>
			</div>
		</div>
	</body>
</html>