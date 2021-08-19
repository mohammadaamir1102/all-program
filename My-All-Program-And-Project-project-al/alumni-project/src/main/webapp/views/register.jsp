<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1">
<title>Registration form</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<script>

/* function validation()
{
	//alert("do you want?");

var name=document.getElementById("name").value;
	if(name == "" || name.length<=3)
	{
      //alert("please enter valid name");
		 document.getElementById("name1").innerHTML="*invalid username*";
		 return false;
	}
	return true;
 */

 function validation(){

     var name = document.getElementById('name').value;
     var mo_no = document.getElementById('mo_no').value;
     var User_name = document.getElementById('User_name').value;
     var password = document.getElementById('password').value;
     var address = document.getElementById('address').value;
     
     var number = /^[0-9]{1,10}$/;
     var userCheck = /^[a-zA-z]{1,30}[a-zA-z    ]{1,30}$/;
     var mail= /^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$/;
    // var passs=/^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[^A-Za-z0-9])(?=.{8,})$/;
     var pass= /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,20}$/;
     if (userCheck.test(name)) {
         document.getElementById('name').innerHTML = "";
     }
     else {
         document.getElementById('name1').innerHTML = "Invalid Name";
         return false;
     }
     if (number.test(mo_no)) {
         document.getElementById('mo_no').innerHTML = "";
     }
     else {
         document.getElementById('mo_no1').innerHTML = "Invalid Mobile Number";
         return false;
     }
      
     if (mail.test(User_name)) {
         document.getElementById('User_name').innerHTML = "";
     }
     else {
         document.getElementById('User_name1').innerHTML = "Invalid user name";
         return false;
     }
     if (pass.test(password)) {
         document.getElementById('password').innerHTML = "";
     }
     else {
         document.getElementById('password1').innerHTML = "Invalid password";
         return false;
     }
     if (userCheck.test(address)) {
         document.getElementById('address').innerHTML = "";
     }
     else {
         document.getElementById('address1').innerHTML = "Invalid address";
         return false;
     }




 }
	

</script>

<body style="background-color:#BFC9CA " >
	<li><a href="home"><strong>Click here for back</a></li></strong>
	<div class="container">

		<div class="row mt-5">

			<div class="col-md-6 offset-md-3">

				<form action="login" method="post">
				
                  <h1 align="center">Register Here!!</h1>



					
						<label for="exampleInputEmail1" >Name</label> 
						<br>
						
							
							<input 
							type="text" 
							
							id="name"
							
							name="name"
							
							 class="form-control" 
							
							placeholder="Enter Name"
							 
							/>
							
							<span style="color: red" id="name1"></span>
							


					<div class="mb-3">
						<label for="exampleInputPassword1" class="form-label">Mobile Number</label>
						<br>
						<input type="tel" 
						
						
						 name="mo_no"
						 
						 id="mo_no"
						 
						  class="form-control" 
						  
						  placeholder="Enter Mobile no."
						 maxlength="10"
                          
                        />
							<span style="color: red" id="mo_no1"></span>
							
					</div>
					
					
					
					
					
					<div class="mb-3">
						<label for="exampleInputPassword1" class="form-label">User Name</label>
						<br>
						<input
						 type="text"
						 
						 id="User_name"
						 
						  name="User_name" 
						  
						 placeholder="Enter User Name"
						  
							class="form-control" />
							<span style="color: red" id="User_name1"></span>
							
					</div>
					
					
					

                       <div class="mb-3">
						<label for="exampleInputPassword1" class="form-label">Password(*At least One capital letter*)</label>
						<br>
						<input
						 type="password"
						 
						 id="password"
						 
						  name="password" 
						  
						 placeholder="Genrate Password"
						 maxlength="8"
						  
							class="form-control"/>
							<span style="color: red" id="password1"></span>
							
					</div>
					
					
					
                       <div class="mb-3">
						<label for="exampleInputPassword1" class="form-label">Address</label>
						<br>
						<input
						 type="text"
						 
						  name="address" 
						  
						  
						  id="address"
						
						
						
						 placeholder="Enter address"
						  
							class="form-control"/>
							
							<span style="color: red" id="address1"></span>
					</div>
					
				
					<button type="submit" class="btn btn-outline-success container text-center" onclick= "return validation()" >Click here for Registration</button>
					
					<br>
				<br>
					
					</div>
				</form>
	
			</div>


		</div>
		

	</div>
	
</body>
</html>