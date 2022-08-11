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
		<h1 class="d-flex justify-content-center">Save Travels</h1>
		<div class="container mt-3 d-flex flex-column justify-content-center">
			<table class="table">
			  <thead>
			    <tr>
			      <th scope="col">Expense</th>
			      <th scope="col">Vendor</th>
			      <th scope="col">Amount</th>
			      <th>Actions</th>
			    </tr>
			  </thead>
			  <tbody>
				<c:forEach var="expense" items="${expenses}">
					<tr>
						<th><a href="/expense/${expense.id}/information"><c:out value="${expense.expenseName}"/></a></th>
						<th><c:out value="${expense.vendor}"/></th>
						<th><c:out value="${expense.expenseAmount}"/></th>
						<td class="d-flex">
							<a href="/expense/${expense.id}/edit">Edit</a>
							<form action="/expense/${expense.id}/delete" method="POST">
							<input type="hidden" name="_method" value="delete"/>
							<input type="submit" value="Delete" class="btn btn-danger" />
							</form>
						</td>
					</tr>
				</c:forEach>
			  </tbody>
			</table>
			<div class="card border-dark p-5 d-flex flex-column">
				<form:form class="d-flex flex-column" action="/expense/submit" modelAttribute="expense" method="POST">
					<form:label path="expenseName">Expense Name:</form:label>
					<form:input type="text" path="expenseName"/>
					<form:errors path="expenseName"/>
					
					<form:label path="vendor">Vendor:</form:label>
					<form:input type="text" path="vendor"/>
					<form:errors path="vendor"/>
					
					
					<form:label path="expenseAmount">Amount</form:label>	
					<form:input type="number" path="expenseAmount"/>
					<form:errors path="expenseAmount"/>
					
					<form:label path="description">Description</form:label>
					<form:textarea rows="5" cols="10" path="description"></form:textarea>
					<form:errors path="description"/>
					<p><em>Send and show a friend</em></p>
					<button>Submit</button>
				</form:form>
			</div>
		</div>
	</body>
</html>