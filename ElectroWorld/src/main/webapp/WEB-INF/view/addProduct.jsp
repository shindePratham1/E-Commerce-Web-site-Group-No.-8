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
<br>
<div style="background-color:rgb(194, 237, 235); border:2px solid black;">
<center>
<form method="post" action="addProduct" enctype="multipart/form-data">  
<h2>Product Details </h2>
Enter User Name: <input type="text" name="name" value=""/><br><br>
Enter Category: <input type="text" name="category" value=""/><br><br>
Enter Price Per Quantity: <input type="text" name="price" value=""/><br><br> 
Enter Quantity:<input type="text" name="quantity"  value=""/><br> <br> 
Enter Product Description:<input type="text" name="desc" value="" /><br>
Vendor name:<input type="text" name="vendor_name" value="" /><br>
Add Product Image <input type="file" name="image"/><br/> 

<input type="submit" value="submit">
</form>