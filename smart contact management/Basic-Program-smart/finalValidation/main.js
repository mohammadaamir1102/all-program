function validation() {
    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;
    var checkpassword = document.getElementById('checkpassword').value;
    var emails = document.getElementById('email').value;
    var mobile = document.getElementById('mobile').value;


    var usercheck = /^[A-Za-z. ]{3,30}$/;
    var passwordcheck = /^(?=.*)[A-Z][a-zA-Z]{1,6}[!@#$%^&*]{1}[0-9]{1,3}$/;
    var emailcheck = /^[a-zA-Z0-9.]{1,}@[a-z]{1,5}[.a-z]{1,5}[.]{1}[a-z]{1,4}$/;

    var mobilecheck = /^[6789]{1}[0-9]{9}$/
    if (usercheck.test(username)) {
        document.getElementById('usererror').innerHTML = "";

    } else {
        document.getElementById('usererror').innerHTML = "Invalid Username.";
        return false;
    }

    if (passwordcheck.test(password)) {
        document.getElementById('passerror').innerHTML = " ";

    } else {
        document.getElementById('passerror').innerHTML = "Invalid Password.";
        return false;
    }

    if (checkpassword.match(password)) {
        document.getElementById('checkpasserror').innerHTML = " ";

    } else {
        document.getElementById('checkpasserror').innerHTML = "Password not match.";
        return false;
    }

    if (emailcheck.test(emails)) {
        document.getElementById('emailerror').innerHTML = " ";

    } else {
        document.getElementById('emailerror').innerHTML = "Invalid Email.";
        return false;
    }

    if (mobilecheck.test(mobile)) {
        document.getElementById('mobileerror').innerHTML = " ";

    } else {
        document.getElementById('mobileerror').innerHTML = "Invalid Mobile Number.";
        return false;
    }

}