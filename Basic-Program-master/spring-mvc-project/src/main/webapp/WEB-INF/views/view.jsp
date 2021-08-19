<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@include file="./mainfile.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Record Page</title>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mb-3">All Registration Details</h1>
				<table class="center table table-bordered">
					<thead>
						<tr>
							<th scope="col">Student Id</th>
							<th scope="col">First Name</th>
							<th scope="col">Last Name</th>
							<th scope="col">Gender</th>
							<th scope="col">Orphan</th>
							<th scope="col">Gmail</th>
							<th scope="col">Student Mobile No</th>
							<th scope="col">Father Name</th>
							<th scope="col">Parent Mobile No</th>
							<th scope="col">Student Address</th>
							<th scope="col">State</th>
							<th scope="col">Course</th>
							<th scope="col">Zipcode</th>
							<th scope="col">Country</th>
							<th scope="col">Total Fees</th>
							<th scope="col">Paid Fees</th>
							<th scope="col">Remain Fees</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${layer}" var="fetch">
							<tr>
								<th scope="row">${fetch.id}</th>
								<td>${fetch.firstName}</td>
								<td>${fetch.lastName}</td>
								<td>${fetch.gender}</td>
								<td>${fetch.orphan}</td>
								<td>${fetch.email}</td>
								<td>${fetch.mobileNumber}</td>
								<td>${fetch.fatherName}</td>
								<td>${fetch.parentNumber}</td>
								<td>${fetch.address}</td>
								<td>${fetch.states}</td>
								<td>${fetch.courses}</td>
								<td>${fetch.zipcode}</td>
								<td>${fetch.country}</td>
								<td class="font-weight-bold">&#8377; ${fetch.totalFees}</td>
								<td class="font-weight-bold">&#8377; ${fetch.paidFees}</td>
								<td class="font-weight-bold">&#8377; ${fetch.remainFees}</td>


							</tr>
						</c:forEach>

					</tbody>
				</table>
					<div class="container text-center">
						<a href="registrationPage" class="btn btn-info btn-sm">New
							Registration</a>

					</div>
			</div>

		</div>
	</div>


</body>
</html>