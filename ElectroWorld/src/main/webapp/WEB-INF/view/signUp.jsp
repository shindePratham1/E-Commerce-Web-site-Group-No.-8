
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign Up Page</title>
</head>
<style>
        * {
            padding-top: 10px;
            font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;
            color: rgb(14, 0, 5);
        }

        .rounded {
            border-style: solid;
            border-radius: 10px;
            width: fit-content;
        }
    </style>
<body style="background-color: lightslategray;margin-left: 30%;margin-right: 30%; ">

<a href="vendorRegister">Vendor Registration</a></option>
<a href="addCustomer">Customer Registration</a></option>
	
<br><br>
<div style="background-color:rgb(194, 237, 235); border:2px solid black;">
<center>
<form action="vendorRegister" method="POST" modelAttribute="vendor">  
        Enter First Name:<input type="text" name="vendor_firstName" value="FirstName..." onclick="this.value=''"/><br/>  
        Enter Last Name:<input type="text" name="vendor_lastName" value="LastName..." onclick="this.value=''"/><br/>
        Enter User Name: <input type="text" name="vendor_userName" value="Name..." onclick="this.value=''"/><br/>  
        Enter Shop Name:<input type="text" name="vendor_shopName" value="shopname" onclick="this.value=''"/><br/>
        Enter Mobile Number:<input type="text" name="vendor_mobileNo" value="Mobile..." onclick="this.value=''"/><br/>
        Enter Address:<input type="text" name="vendor_address" value="Address..." onclick="this.value=''"/><br/>
        Enter Password:<input type="text" name="vendor_password"  value="Password..." onclick="this.value=''"/><br/>  
        Enter Email: <input type="email" name="vendor_email" value="Email..." onclick="this.value=''"/><br/>
        Enter Licence Number:<input type="text" name="vendor_licenseNo" value="Licence numebr..." onclick="this.value=''"/><br/>
        Enter Adhar Number:<input type="text" name="vendor_adharCard" value="adhar" onclick="this.value=''"/><br/>
        Enter City:<input type="text" name="vendor_city" value="City..." onclick="this.value=''"/><br/>
        Enter Pincode:<input type="text" name="vendor_pincode" value="Pincode..." onclick="this.value=''"/><br/>	
        <input type="submit" value="register"/>  
</form>

</center>
</div>
</body>
</html>