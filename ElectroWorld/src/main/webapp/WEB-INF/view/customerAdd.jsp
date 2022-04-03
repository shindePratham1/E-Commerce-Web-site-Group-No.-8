<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Details</title>
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
<form action="product.jsp">  
<h2> Customer Details </h2>
Enter Customer Id: <input type="text" name="cust_id" value=""/><br><br>
Enter Customer First Name: <input type="text" name="Fname" value=""/><br><br>
Enter Customer Last Name: <input type="text" name="Lname" value=""/><br><br> 
Enter Customer Username :<input type="text" name="Uname"  value=""/><br> <br> 
Enter Customer Password:<input type="text" name="password" value="" /><br><br>
Enter  Customer Address <input type="text" name="add" value=""/><br/> <br>
Enter Customer Mobile Number <input type="text" name="MobNo" value=""/><br/> <br>
Enter Customer Email <input type="text" name="email" value=""/><br/> <br>
Enter Customer City <input type="text" name="city" value=""/><br/> <br>
Enter Customer Pincode <input type="text" name="pincode" value=""/><br/> <br>

</form>
</center>
</div>
</body>
</html>