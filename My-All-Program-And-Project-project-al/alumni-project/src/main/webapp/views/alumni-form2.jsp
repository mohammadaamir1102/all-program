<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1">
<title>Page2 Professional and Qualification details</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body style="background-color: #BFC9CA">

	<div class="container">

		<div class="row mt-5">

			<div class="col-md-8 offset-md-2">

				<form class="row g-2" action="alumni-form_registred" method="post">

					<marquee>
						<h1 align="center">professional and education details</h1>
					</marquee>

					<h1 align="center">Qualification</h1>
					<table>

						<tr>
							<td align="center"><b>Sl.No.</b></td>
							<td align="center"><b>Examination</b></td>
							<td align="center"><b>Board</b></td>
							<td align="center"><b>Percentage</b></td>
							<td align="center"><b>Year of Passing</b></td>
						</tr>

						<tr>
							<td>1</td>
							<td>Class X</td>
							<td><input type="text" name="ClassX_Board"
								placeholder="Enter ClassX_Board" maxlength="30" /></td>
							<td><input type="text" name="ClassX_Percentage"
								placeholder="Enter Percentage" maxlength="30" /></td>
							<td><input type="text" name="ClassX_YrOfPassing"
								placeholder="Enter ClassX_YrOfPassing" maxlength="30" /></td>
						</tr>


						<tr>
							<td>2</td>
							<td>Class XII</td>
							<td><input type="text" name="ClassXII_Board"
								placeholder="Enter ClassXII_Board" maxlength="30" /></td>
							<td><input type="text" name="ClassXII_Percentage"
								placeholder="Enter ClassXII_Percentage" maxlength="30" /></td>
							<td><input type="text" name="ClassXII_YrOfPassing"
								placeholder="Enter ClassXII_YrOfPassing" maxlength="30" /></td>
						</tr>

						<tr>
							<td>3</td>
							<td>Graduation</td>
							<td><input type="text" name="Graduation_Board"
								placeholder="Enter Graduation_Board" maxlength="30" /></td>
							<td><input type="text" name="Graduation_Percentage"
								placeholder="Enter Graduation_Percentage" maxlength="30" /></td>
							<td><input type="text" name="Graduation_YrOfPassing"
								placeholder="Enter Graduation_YrOfPassing" maxlength="30" /></td>
						</tr>

						<tr>
							<td>4</td>
							<td>Masters</td>
							<td><input type="text" name="Masters_Board"
								placeholder="Enter Masters_Board" maxlength="30" /></td>
							<td><input type="text" name="Masters_Percentage"
								placeholder="Enter Masters_Percentage" maxlength="30" /></td>
							<td><input type="text" name="Masters_YrOfPassing"
								placeholder="Enter Masters_YrOfPassing" maxlength="30" /></td>
						</tr>

						<tr>
							<td></td>
							<td></td>
							<td align="center">(10 char max)</td>
							<td align="center">(upto 2 decimal)</td>
						</tr>
					</table>

					</td>
					</tr>

<h5 align="center"><u>Our Cources</u></h5>
					<div class="col md-12">
						<label for="inputAddress" class="form-label"><strong>Language</strong></label> <br>


						<label class="radio-outline-primary "  > <input
							class="form-check-input" type="checkbox"  name="course" value="c">C
							
						</label> <label class="radio-inline" style="padding-left:50px"> <input
							class="form-check-input" type="checkbox" name="course" value="c++">C++
						</label> <label class="radio-inline" style="padding-left:50px"> <input
							class="form-check-input" type="checkbox" name="course" value="java">Java
						</label> <label class="radio-inline" style="padding-left:50px"> <input
							class="form-check-input" type="checkbox" name="course" value="ui">UI
						</label> <label class="radio-inline" style="padding-left:50px"> <input
							class="form-check-input" type="checkbox" name="course" value="android">Android
						</label> <label class="radio-inline" style="padding-left:50px"> <input
							class="form-check-input" type="checkbox" name="course" value="python">Python
						</label> <label class="radio-inline" style="padding-left:50px"> 
						<input
							class="form-check-input" type="checkbox" name="course" value="db">DB
						</label>

					</div>

                        <u> <h5 align="center">Mode of Student</h5></u>
     
     <table>
                       
                       
                        <div class="col md-12">
						<label for="inputAddress" class="form-label"> <strong>Student mode:</strong></label> <br>


						
						<label class="radio-inline" style="padding-left:50px"> <input
							class="form-check-input" type="radio" name="mode" value="regular">Regular
						</label> <label class="radio-inline" style="padding-left:100px"> <input
							class="form-check-input" type="radio" name="mode" value="alternate">Alternate
						</label> <label class="radio-inline" style="padding-left:100px"> 
						<input
							class="form-check-input" type="radio" name="mode" value="weekend">Weekend
						</label>
						
						 <label class="radio-inline" style="padding-left:100px"> 
						<input
							class="form-check-input" type="radio" name="mode" value="monthly">Monthly
						</label>

					</div>
					
					
			</table>			
						 <div class="col-md-3">
						<label for="inputEmail4" class="form-label">Total Fee</label> <input
							 type="text" name="t_fee" value="30,000" class="form-control" readonly="readonly" />
					</div>
					 <div class="col-md-3">
						<label for="inputEmail4" class="form-label">Paid Fee</label> <input
							type="text" name="p_fee" placeholder="enter amount" class="form-control">
					</div>
					 <div class="col-md-3">
						<label for="inputEmail4" class="form-label">Remaining Fee</label> <input
							type="text" name="r_fee" placeholder="amount" class="form-control">
					</div>
					<div class="col-md-3">
						<label for="inputEmail4" class="form-label">Reference By:</label> <input
							type="text" name="ref_by" placeholder="enter name" class="form-control">
					</div>

				

				<br> <br>
				
				<h3 align="center">Working(Company Info.)</h3>
				
				
			
					<table>
					<div>
							<label class="radio-inline" style="padding-left:100px"> 
						<input
							class="form-check-input" type="radio" name="st_status" value="fresher">Fresher
						</label>
						<label class="radio-inline" style="padding-left:100px"> 
						<input
							class="form-check-input" type="radio" name="st_status" value="experience">Experience
						</label>
						
						</div>
						
						</table>
						
						

<h6 align="center"><u>Company Details:</u></h6>
						<div class="col-md-6">
						<label for="inputEmail4" class="form-label">1-Co.Name</label> <input
							type="text" name="f_co_Name" placeholder="enter 1 co." class="form-control">
					</div>
					<div class="col-md-6">
						<label for="inputEmail4" class="form-label">2-Co.Name</label> <input
							type="text" name="s_co_Name" placeholder="enter 2 co." class="form-control">
					</div>
					<div class="col-md-6">
						<label for="inputEmail4" class="form-label">3-Co.Name</label> <input
							type="text" name="t_co_Name" placeholder="enter 3 co." class="form-control">
					</div>
					<div class="col-md-6">
						<label for="inputEmail4" class="form-label">4-Co.Name</label> <input
							type="text" name="fourth_co_Name" placeholder="enter 4 co." class="form-control">
					</div>
					
						<div class="col-md-12">
						<label for="inputEmail4" class="form-label">technology(working)</label> <input
							type="text" name="co_Technology" placeholder="enter tech. name" class="form-control">
					</div>
					
						<div class="col-md-12">
						<label for="inputEmail4" class="form-label">Co.Address</label> <input
							type="text" name="co_Address" placeholder="enter address" class="form-control">
					</div>
					
					<div class="col-md-12">
						<label for="inputEmail4" class="form-label">Role & Responsibilities:</label> <input
							type="text" name="role_Responsi" placeholder="enter role &responsibilities" class="form-control">
					</div>
					<div class="container text-center">
					<button type="submit" class="btn btn-primary">Submit</button>
					
					</div>
					
				


				</form>
				
				
				<form action="prev" method="post">
					<div class="container text-center">
					<button type="submit" class="btn btn-primary" <a class="page-link" >Previous</a>></button>
					
					</div>
				</form>
				</div>
				</div>
				</div>
				</body>
				</html>
			