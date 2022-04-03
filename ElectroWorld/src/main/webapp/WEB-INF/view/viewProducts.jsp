<%@page import="java.util.List"%>
<%@page import="com.ElectroWorld.ElectroWorld.POJO.Product"%>
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
<form action="getProducts" method="GET">
<table border="1">


<%

List<Product> list = (List<Product>)request.getAttribute("view_products"); 

for(Product be : list ){
%>

<tr>
<td><%=be.getProduct_name() %></td>
<td><%=be.getProduct_category() %></td>
<td><%=be.getProduct_pricePerQuantity() %></td>
<td><%=be.getProduct_quantity() %></td>
<td><%=be.getProduct_desc() %></td>
<td><%=be.getImage() %></td>
<td><%=be.getVendor() %></td>
<td><%="Edit" %></td>
<td><%="Delete" %></td>
</tr>

<% }
%>
</table>
</form>
</center>
</div>
</body>
</html>