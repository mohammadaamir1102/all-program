<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1">
<title>Page1 Basic Details</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body style="background-color: #BFC9CA">
<table>

</table>
	<div class="container">

		<div class="row mt-5">

			<div class="col-md-8 offset-md-2">

				<form class="row g-2" action="alumni-form_registred" method="post">
				
					<marquee>
						<h1 align="center">Alumni Student Inquiry Form:</h1>
					</marquee>




					<div class="col-md-3">
						<label for="inputEmail4" class="form-label">First Name:</label> <input
							type="text" name="f_Name" placeholder="enter f_name" class="form-control">
					</div>


					<div class="col-md-3">
						<label for="inputEmail4" class="form-label">Last Name:</label> <input
							type="text" name="l_Name" placeholder="enter l_name" class="form-control">
					</div>


					<div class="col-md-6">
						<label for="inputEmail4" class="form-label">Father Name:</label> <input
							type="text" name="father_Name" placeholder="enter father name" class="form-control">
					</div>


					<div class="col-md-4">
						<label for="inputEmail4" class="form-label">Contact Number:</label>
						<input type="tel" maxlength="13" name="mo_no" placeholder="enter number" class="form-control">
					</div>


					<div class="col-md-4">
						<label for="inputEmail4" class="form-label">UID Number:</label> <input
							type="tel" maxlength="12" name="aadhar_No" placeholder="enter UID" class="form-control">
					</div>

					<div class="col-md-4">
						<label for="inputEmail4" class="form-label">PAN Number:</label> <input
							type="text" maxlength="10" name="pan_no" placeholder="enter PAN" class="form-control">
					</div>

					<div class="col-md-4">
						<label for="birthday">DOB:</label> <input type="date"
							id="birthday" name="dob" class="form-control">

					</div>

					<div class="col md-6">
						<label for="inputAddress" class="form-label">Gender</label> <br>


						<label class="radio-outline-primary"> <input
							class="form-check-input" type="radio" name="gender" value="male">Male
						</label> <label class="radio-inline"> <input
							class="form-check-input" type="radio" name="gender" value="female">Female
						</label> <label class="radio-inline"> <input
							class="form-check-input" type="radio"   name="gender" value="other">Other
						</label>

					</div>



					<div class="col-12">
						<label for="inputAddress" class="form-label">Address1</label> <input
							type="text" class="form-control" id="inputAddress"
							name="address1" placeholder="enter  Native Address (add.1)">
					</div>

					<div class="col-12">
						<label for="inputAddress" class="form-label">Address2</label> <input
							type="text" class="form-control" id="inputAddress"
							name="address2" placeholder="enter  Current Address(add.2)">
					</div>

					<div class="col-md-6">
						<label for="inputZip" class="form-label">Zip(PIN Code)</label> <input
							type="text" name="pin" placeholder="enter ZIP" class="form-control">
					</div>

					<div class="col-md-6">
						<label for="inputZip" class="form-label">Age</label> <input
							type="text" name="age" class="form-control" placeholder="enter age">
					</div>




					<div class="col md-12">
						<label for="inputAddress" class="form-label">Hobbies</label> <br>


						<label class="radio-outline-primary"> <input
							class="form-check-input" type="checkbox" name="hobby" value="wandering" >Wandering
						</label> <label class="radio-inline" style="padding-left:20px"> <input
							class="form-check-input" type="checkbox" name="hobby" value="travelling">Travelling
						</label> <label class="radio-inline" style="padding-left:20px"> <input
							class="form-check-input" type="checkbox" name="hobby" value="singing">Singing
						</label> <label class="radio-inline" style="padding-left:20px"> <input
							class="form-check-input" type="checkbox" name="hobby" value="learning">Learning
						</label> <label class="radio-inline" style="padding-left:20px"> <input
							class="form-check-input" type="checkbox" name="hobby" value="cricket">Cricket
						</label> <label class="radio-inline" style="padding-left:20px"> <input
							class="form-check-input" type="checkbox" name="hobby" value="other">Other
						</label> <label class="radio-inline" style="padding-left:20px"> <input
							class="form-check-input" type="checkbox" name="hobby" value="movies">Movies
						</label>

					</div>



					<div class="col-12">
						<div class="form-check">
							<input class="form-check-input" type="checkbox" id="gridCheck">
							<label class="form-check-label" for="gridCheck"> Check me
								out </label>
						</div>
					</div>

					<br>

					<div class="col md-12 text-center">
						<nav aria-label="Page navigation example ">
							<ul class="pagination text-center " style="">
								<li class="page-item"><a class="page-link" href="login">Previous</a></li>

								 <li class="page-item"> </li>
							

							</ul>
						</nav>

					</div>
                     <div class="container text-center">
					<button type="submit" class="btn btn-primary" value="submit">NextPage</button>
					
					</div>
				</form>

				<br> <br>





				

			</div>


		</div>


	</div>

</body>
</html>