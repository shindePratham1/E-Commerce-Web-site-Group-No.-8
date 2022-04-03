<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign In</title>
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
<br><br>
<div style="background-color:rgb(194, 237, 235); border:2px solid black;">
<center>
<a href="signIn">Vendor LogIn</a>
<h3>Customer LogIn</h3>
<form action="loginCustomer" method="post">  
Enter User name: <input type="text" name="username"/><br/><br/>  
Enter Password: <input type="password" name="password"/><br/><br/>  
<input type="submit" value="Login"/> 
</form> 
</center>
</div>
</body>
</html>