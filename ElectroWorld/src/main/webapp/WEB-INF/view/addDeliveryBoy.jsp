<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><html>
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

<body  style="background-color: lightslategray;margin-left: 30%;margin-right: 30%; ">
<br><br>
<div style="background-color:rgb(194, 237, 235); border:2px solid black;">
<center>
<form method="post" action="addDeliveryBoy">  
<h2> Delivery Boy Details </h2>
Enter First Name: <input type="text" name="deliveryboy_firstname" value=""/><br><br>
Enter Last Name: <input type="text" name="deliveryboy_lastname" value=""/><br><br> 
Enter Username :<input type="text" name="deliveryboy_username"  value=""/><br> <br> 
Enter Password:<input type="text" name="deliveryboy_password" value="" /><br><br>
Enter Mobile Number <input type="text" name="deliveryboy_mobileNo" value=""/><br/> <br>
Enter Address <input type="text" name="deliveryboy_address" value=""/><br/> <br>
Enter City <input type="text" name="deliveryboy_city" value=""/><br/> <br>
Enter Pincode <input type="text" name="deliveryboy_pincode" value=""/><br/> <br>
<input type="submit" value="submit">
</form>


