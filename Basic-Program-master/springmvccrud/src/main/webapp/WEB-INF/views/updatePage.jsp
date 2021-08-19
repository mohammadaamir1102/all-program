<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<!--  here (./) this is for current directory -->
<%@include file="./main.jsp"%>
<title>Student Details</title>

</head>
<body>

	<div class="container mt-1">

		<div class="row">
			<div class="col-md-6 offset-md-3">

				<h1 class="text-center mb-3">Change Student Details</h1>

				<form action="${pageContext.request.contextPath}/formHandle" method="post">
				
				<div class="form-group">
						<label for="studentId">Student ID</label> <input type="text"
							class="form-control" id="firstName" name="id"
							value="${singelStudent.id}" placeholder="Enter First Name"
							autocomplete="off" required="required"> 
					</div>
						

					<div class="form-group">
						<label for="firstName">First Name</label> <input type="text"
							class="form-control" id="firstName" name="firstName"
							value="${singelStudent.firstName}" placeholder="Enter First Name"
							autocomplete="off" required="required"> 
					</div>

					<div class="form-group">
						<label for="lastName">Last Name</label> <input type="text"
							class="form-control" id="lastName" name="lastName"
							value="${singelStudent.lastName}" placeholder="Enter Last Name"
							autocomplete="off" required="required">
					</div>


					<div class="form-group">
						<label for="fatherName">Father Name</label> <input type="text"
							class="form-control" id="fatherName" name="fatherName"
							value="${singelStudent.fatherName}"
							placeholder="Enter Father Name" autocomplete="off"
							required="required"> 
					</div>

					<div class="form-group">
						<label for="age">Age</label> <input type="text"
							class="form-control" id="age" name="age"
							value="${singelStudent.age}" autocomplete="off"
							placeholder="Enter Age" required="required">
					</div>

					<div class="form-group">
						<label for="address">Address</label>
						<textarea rows="3" type="text" class="form-control" id="address"
							name="address" placeholder="Enter Address" required="required">${singelStudent.address}</textarea>
					</div>


					<div class="form-group">
						<label for="email">Email</label> <input type="text"
							class="form-control" id="email" name="email"
							value="${singelStudent.email}" placeholder="Enter Email"
							autocomplete="off" required="required">
					</div>


					<div class="form-group">
						<label for="password">Password</label> <input type="password"
							class="form-control" id="password" name="password"
							value="${singelStudent.password}" placeholder="Enter Password"
							required="required">
					</div>

					<div class="form-group">
						<label for="confirmPassword">Confirm Password</label> <input
							type="text" class="form-control" id="confirmPassword"
							name="confirmPassword" value="${singelStudent.confirmPassword}"
							placeholder="Enter Confirm Password" required="required">
					</div>
							<button type="submit" class="btn btn-warning">Update</button>

				</form>
			</div>
		</div>
	</div>
</body>
</body>
</html>