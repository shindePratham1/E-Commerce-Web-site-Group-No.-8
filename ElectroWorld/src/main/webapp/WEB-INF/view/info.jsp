<%@page import="com.ElectroWorld.ElectroWorld.POJO.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products List</title>
</head>
<body>
<%  Customer c=(Customer)request.getAttribute("customer"); %>
<h3> <%=c.getCustomerFirstName() %></h3>
	
</body>
</html>
