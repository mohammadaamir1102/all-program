<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<!--  here (./) this is for current directory -->
<%@include file="./main.jsp"%>
<title>Add Details</title>

</head>
<body>

	<div class="container mt-1">

		<div class="row">
			<div class="col-md-6 offset-md-3">

				<h1 class="text-center mb-3">Fill Details</h1>

				<form action="formHandle" method="post"
					onsubmit="return validations()">


					<div class="form-group">
						<label for="firstName">First Name</label> <input type="text"
							class="form-control" id="firstName" name="firstName"
							placeholder="Enter First Name" autocomplete="off"
							required="required"> <span id="firstNameError"></span>
					</div>

					<div class="form-group">
						<label for="lastName">Last Name</label> <input type="text"
							class="form-control" id="lastName" name="lastName"
							placeholder="Enter Last Name" autocomplete="off"
							required="required"> <span id="lastNameError"
							style="display: none"></span>
					</div>


					<div class="form-group">
						<label for="fatherName">Father Name</label> <input type="text"
							class="form-control" id="fatherName" name="fatherName"
							placeholder="Enter Father Name" autocomplete="off"
							required="required"> <span id="fatherNameError"
							style="display: none"></span>
					</div>

					<div class="form-group">
						<label for="age">Age</label> <input type="text"
							class="form-control" id="age" name="age" autocomplete="off"
							placeholder="Enter Age" required="required">
					</div>

					<div class="form-group">
						<label for="address">Address</label>
						<textarea rows="3" type="text" class="form-control" id="address"
							name="address" placeholder="Enter Address" required="required"></textarea>
					</div>


					<div class="form-group">
						<label for="email">Email</label> <input type="text"
							class="form-control" id="email" name="email"
							placeholder="Enter Email" autocomplete="off" required="required">
					</div>


					<div class="form-group">
						<label for="password">Password</label> <input type="password"
							class="form-control" id="password" name="password"
							placeholder="Enter Password" required="required">
					</div>

					<div class="form-group">
						<label for="confirmPassword">Confirm Password</label> <input
							type="password" class="form-control" id="confirmPassword"
							name="confirmPassword" placeholder="Enter Confirm Password"
							required="required">
					</div>
					<div class="container text-center">
							<a href="success"
								class="btn btn-primary">Show Details</a>
								
								
						<div class="container text-center">
							<a href="${pageContext.request.contextPath}/"
								class="btn btn-primary">Back</a>
								
								
							<button type="submit" class="btn btn-primary">Submit</button>

						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</body>
</html>