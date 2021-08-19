<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@include file="./main.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mb-3">Editing Details</h1>
				<table class="table table-bordered">
					<thead>
						<tr>
							<th scope="col">ID</th>
							<th scope="col">First Name</th>
							<th scope="col">Last Name</th>
							<th scope="col">Father Name</th>
							<th scope="col">Age</th>
							<th scope="col">Address</th>
							<th scope="col">Email</th>
							<th scope="col">Password</th>
							<th scope="col">Confirm Password</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${allStudent}" var="a">
							<tr>
								<td>${a.id}</td>
								<td>${a.firstName}</td>
								<td>${a.lastName}</td>
								<td>${a.fatherName}</td>
								<td>${a.age}</td>
								<td>${a.address}</td>
								<td>${a.email}</td>
								<td>${a.password}</td>
								<td>${a.confirmPassword}</td>
								<%-- <td>${a.firstName}</td> --%>

								<!-- 
								here class="fas fa-trash-alt" is the icon of delete
								and here delete is the url from the controller  -->

								<td><a href="delete/${a.id}"><i
										class="fas fa-trash-alt text-danger"></i></a> 
										<a href="update/${a.id}"><i class="far fa-edit"></i></a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<div class="container text-center">
					<a href="add" class="btn btn-outline-success">Add details</a>
				</div>

			</div>
		</div>
	</div>
</body>
</html>