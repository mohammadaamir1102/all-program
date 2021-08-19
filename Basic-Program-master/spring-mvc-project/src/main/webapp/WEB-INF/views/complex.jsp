<!doctype html>
<html lang="en">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Aamir khan</title>
</head>

<body class="" style="background-image: url('https://unsplash.com/photos/bviex5lwf3s');">
    <div class="row">
        <div class="col-md-8 offset-md-2">
            <div class="card">
                <div class="card-body">
                    <h3 class="text-center">Student Fees Details</h3>
                    <form action="form" method="post" onsubmit="return validated()">
                        <div class="row">
                            <div class="col">
                                <input type="text" class="form-control" placeholder="First name" name="firstName"
                                    id="firstName">
                                <span style="color: red;" id="first_name"></span>
                            </div>
                            <div class="col">
                                <input type="text" class="form-control" placeholder="Last name" name="lastName"
                                    id="lastName">
                                <span style="color: red;" id="last_name"></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group"> <label for="form_need"></label> <select id="form_need"
                                        name="gender" class="form-control" required="required"
                                        data-error="Please specify your need.">
                                        <option value="" selected disabled>Choose Gender</option>
                                        <option>Male</option>
                                        <option>Female</option>
                                        <option>Other</option>

                                    </select> </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group"> <label for="form_need"></label> <select id="form_need"
                                        name="orphan" class="form-control" required="required"
                                        data-error="Please specify your need.">
                                        <option value="" selected disabled>Orphan?</option>
                                        <option>No</option>
                                        <option>Yes</option>


                                    </select> </div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col">
                                <input type="email" class="form-control" placeholder="example123@gmail.com" id="email"
                                    name="email">
                                <span style="color: red;" id="gmailName"></span>
                            </div>

                            <div class="col">
                                <input type="text" class="form-control" placeholder="Student mobile no"
                                    id="mobileNumber" name="mobileNumber">
                                <span style="color: red;" id="mobile_number"></span>
                            </div>

                        </div><br>
                        <div class="row">
                            <div class="col">
                                <input type="text" class="form-control" placeholder="Father name" id="fatherName"
                                    name="fatherName">
                                <span style="color: red;" id="father_name"></span>
                            </div>

                            <div class="col">
                                <input type="text" class="form-control" placeholder="Parent mobile no" id="parentNumber"
                                    name="parentNumber">
                                <span style="color: red;" id="parent_number"></span>
                            </div>

                        </div>
                        <br>
                        <div class="form-group">
                            <label for="comment">Address:</label>
                            <textarea class="form-control" rows="5" placeholder=""
                                id="address" name="address"></textarea>
                            <span style="color: red;" id="address_name"></span>
                        </div>

                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group"> <label for="form_need"></label> <select id="form_need"
                                        name="states" class="form-control" required="required"
                                        data-error="Please specify your need.">
                                        <option value="" selected disabled>Choose State</option>
                                        <option value="Andhra Pradesh">Andhra Pradesh</option>
                                        <option value="Andaman and Nicobar Islands">Andaman and Nicobar Islands</option>
                                        <option value="Arunachal Pradesh">Arunachal Pradesh</option>
                                        <option value="Assam">Assam</option>
                                        <option value="Bihar">Bihar</option>
                                        <option value="Chandigarh">Chandigarh</option>
                                        <option value="Chhattisgarh">Chhattisgarh</option>
                                        <option value="Dadar and Nagar Haveli">Dadar and Nagar Haveli</option>
                                        <option value="Daman and Diu">Daman and Diu</option>
                                        <option value="Delhi">Delhi</option>
                                        <option value="Lakshadweep">Lakshadweep</option>
                                        <option value="Puducherry">Puducherry</option>
                                        <option value="Goa">Goa</option>
                                        <option value="Gujarat">Gujarat</option>
                                        <option value="Haryana">Haryana</option>
                                        <option value="Himachal Pradesh">Himachal Pradesh</option>
                                        <option value="Jammu and Kashmir">Jammu and Kashmir</option>
                                        <option value="Jharkhand">Jharkhand</option>
                                        <option value="Karnataka">Karnataka</option>
                                        <option value="Kerala">Kerala</option>
                                        <option value="Madhya Pradesh">Madhya Pradesh</option>
                                        <option value="Maharashtra">Maharashtra</option>
                                        <option value="Manipur">Manipur</option>
                                        <option value="Meghalaya">Meghalaya</option>
                                        <option value="Mizoram">Mizoram</option>
                                        <option value="Nagaland">Nagaland</option>
                                        <option value="Odisha">Odisha</option>
                                        <option value="Punjab">Punjab</option>
                                        <option value="Rajasthan">Rajasthan</option>
                                        <option value="Sikkim">Sikkim</option>
                                        <option value="Tamil Nadu">Tamil Nadu</option>
                                        <option value="Telangana">Telangana</option>
                                        <option value="Tripura">Tripura</option>
                                        <option value="Uttar Pradesh">Uttar Pradesh</option>
                                        <option value="Uttarakhand">Uttarakhand</option>
                                        <option value="West Bengal">West Bengal</option>

                                    </select> </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group"> <label for="form_need"></label> <select id="form_need"
                                        name="courses" class="form-control" required="required"
                                        data-error="Please specify your need.">
                                        <option value="" selected disabled>Choose Course</option>
                                        <option>Core java</option>
                                        <option>Jsp servlet</option>
                                        <option>Spring core</option>
                                        <option>Spring mvc</option>
                                        <option>Spring boot</option>
                                        <option>Html</option>
                                        <option>Css</option>
                                        <option>Java Script</option>

                                    </select> </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col">
                                <input type="text" class="form-control" placeholder="Zipcode" id="zipcode"
                                    name="zipcode">
                                <span style="color: red;" id="zip_code"></span>
                            </div>
                            <div class="col">
                                <input type="text" class="form-control" placeholder="Country" id="country"
                                    name="country">
                                <span style="color: red;" id="country_name"></span>
                            </div>
                        </div><br>
                        <div class="row">
                            <div class="col">
                                <input type="text" class="form-control" placeholder="Total Fees" name="totalFees"
                                    id="totalFees">
                                <span style="color: red;" id="total_fees"></span>
                            </div>
                            <div class="col">
                                <input type="text" class="form-control" placeholder="Paid Fees" name="paidFees"
                                    id="paidFees" onchange="change()">
                                <span style="color: red;" id="paid_fees"></span>
                            </div>
                            <div class="col">
                                <input type="text" class="form-control" placeholder="Remain Fees" name="remainFees"
                                    id="remainFees">
                                <span style="color: red;" id="remain_fees"></span>
                            </div>
                        </div>
                </div>
                <div class="container text-center">
                    <button type="submit" class="btn btn-success btn-sm">Submit</button>
                    <a href="recordPage" class="btn btn-info btn-sm">View Records</a>
                </div>


                </form>
                <script>
                    function validated() {
                        var fname = document.getElementById('firstName').value;
                        var lname = document.getElementById('lastName').value;
                        var gmail = document.getElementById('email').value;
                        var studentMobile = document.getElementById('mobileNumber').value
                        var fathername = document.getElementById('fatherName').value;
                        var parentMobile = document.getElementById('parentNumber').value
                        var zipcodeDetails = document.getElementById('zipcode').value
                        var countryDetails = document.getElementById('country').value
                        var tfess = document.getElementById('totalFees').value;
                        var pfees = document.getElementById('paidFees').value;
                        var rfees = document.getElementById('remainFees').value;
                        var address = document.getElementById('address').value;



                        var mobilecheck = /^[0-9]{1,10}$/;
                        var aloneName = /^[a-zA-z ]{1,30}$/;
                        var gmailcheck = /^[a-z0-9](\.?[a-z0-9]){5,}@g(oogle)?mail\.com$/;
                        var zipcodeCheck = /^[0-9]{1,6}$/
                        var countryCheck = /^[a-zA-Z   ]{1,15}$/
                        var feesCheck = /^[0-9.]{1,7}$/


                        if (aloneName.test(fname)) {
                            document.getElementById('first_name').innerHTML = "";
                        }
                        else {
                            document.getElementById('first_name').innerHTML = "Invalid name";
                            return false;
                        }


                        if (aloneName.test(lname)) {
                            document.getElementById('last_name').innerHTML = "";
                        }
                        else {
                            document.getElementById('last_name').innerHTML = "Invalid name";
                            return false;
                        }



                        if (gmailcheck.test(gmail)) {
                            document.getElementById('gmailName').innerHTML = "";
                        }
                        else {
                            document.getElementById('gmailName').innerHTML = "Invalid name";
                            return false;
                        }


                        if (mobilecheck.test(studentMobile)) {
                            document.getElementById('mobile_number').innerHTML = "";
                        }
                        else {
                            document.getElementById('mobile_number').innerHTML = "Invalid no";
                            return false;
                        }


                        if (aloneName.test(fathername)) {
                            document.getElementById('father_name').innerHTML = "";
                        }
                        else {
                            document.getElementById('father_name').innerHTML = "Invalid name";
                            return false;
                        }


                        if (mobilecheck.test(parentMobile)) {
                            document.getElementById('parent_number').innerHTML = "";
                        }
                        else {
                            document.getElementById('parent_number').innerHTML = "Invalid no";
                            return false;
                        }


                        if (zipcodeCheck.test(zipcodeDetails)) {
                            document.getElementById('zip_code').innerHTML = "";
                        }
                        else {
                            document.getElementById('zip_code').innerHTML = "Invalid zipcode";
                            return false;
                        }


                        if (countryCheck.test(countryDetails)) {
                            document.getElementById('country_name').innerHTML = "";
                        }
                        else {
                            document.getElementById('country_name').innerHTML = "Invalid country";
                            return false;
                        }


                        if (feesCheck.test(tfess)) {
                            document.getElementById('total_fees').innerHTML = "";
                        }
                        else {
                            document.getElementById('total_fees').innerHTML = "Invalid no";
                            return false;
                        }


                        if (feesCheck.test(pfees)) {
                            document.getElementById('paid_fees').innerHTML = "";
                        }
                        else {
                            document.getElementById('paid_fees').innerHTML = "Invalid no";
                            return false;
                        }

                        if (feesCheck.test(rfees)) {
                            document.getElementById('remain_fees').innerHTML = "";
                        }
                        else {
                            document.getElementById('remain_fees').innerHTML = "Invalid no";
                            return false;
                        }


                        if (address == "" || address == null || address == undefined) {
                            document.getElementById('address_name').innerHTML = "invalid address";
                            return false;
                        }

                    }
                    function change() {

                        var a = document.getElementById('totalFees').value;
                        var b = document.getElementById('paidFees').value;
                        document.getElementById('remainFees').value = a - b;

                    }

                </script>


            </div>

        </div>

    </div>
    </div>

    </div>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
</body>

</html>