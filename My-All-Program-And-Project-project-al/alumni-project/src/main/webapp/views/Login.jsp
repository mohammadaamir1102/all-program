<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body style="background-color:#F5EEF8" >
<%-- <jsp:include page="header"></jsp:include> --%>
	<div class="container">

		<div class="row mt-5">

			<div class="col-md-6 offset-md-3">

				<form action="alumni-form" method="post" >
                  <h1 th:align="center">Login Here for more...!!</h1>



					
						<label for="exampleInputEmail1" >User Name</label> 
						<br>
						
							
							<input 
							type="email" 
							
							name="userName"
							
							 class="form-control" 
							
							placeholder="Enter User Name"	 
						/>
							
						
							
						<br>
						<br>




					<div class="mb-3">
						<label for="exampleInputPassword1" class="form-label">Password</label>
						<br>
						<input
						 type="password"
						 
						  name="password" 
						  
						 placeholder="Enter Password"
						  
							class="form-control" id="exampleInputPassword1"/>
							
							
					</div>
					<br>
							<br>

						
				<div class="container text-center">
					<button type="submit" class="btn btn-primary">Submit</button>
					
					</div>
							<br>
							<br>
							<br>
				<!-- <div class="container text-center">
					<button type="submit" class="btn btn-primary" >click here for fill up  the form</button>
					
					</div> -->
					<a  href="alumni-form"><strong>click here for fill up  the form</strong></a></li>
					<li><a href="home"><strong>Click here for home page</a></li></strong>
				</form>
			<form action="alumni-form" method="post"></form>

			</div>


		</div>

	</div>
</body>
</html>