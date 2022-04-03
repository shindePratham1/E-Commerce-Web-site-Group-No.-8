<%@page import="com.ElectroWorld.ElectroWorld.POJO.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products List</title>
</head>
<body>
<%-- <%  Customer c=(Customer)request.getAttribute("customer"); %>
<h3> <%=c.getCustomer_firstName() %></h3> --%>
	
	<!-- hello customer
	<form action="cust" method="get" >
	<input type="number" id="id">
	<input type="submit" value="submit">
	</form>
	
	<div class="container" id="container">
		sign in page
		<div class="form-container sign-in-container">
			<form method="POST" action="loginCustomer" class="form" id="login">
				<h1 class="form__title">Login</h1>
				<div class="form__input-group">
					<label for="username">Username: </label> <input type="text"
						class="form__input" name="username" id="username" maxlength="20"
						required>
				</div>
				<div class="form__input-group">
					<label for="pass">Password: </label> <input type="password"
						class="form__input" name="password" id="password" maxlength="20" required>
				</div>
				<div class="form__input-group">
					<button type="submit" class="form__button">Submit</button>
				</div>
			</form>
		</div> -->
<!-- <form method="post" action="addProduct">  
<h2>Product Details </h2>
Enter User Name: <input type="text" name="name" value=""/><br><br>
Enter Category: <input type="text" name="category" value=""/><br><br>
Enter Price Per Quantity: <input type="text" name="price" value=""/><br><br> 
Enter Quantity:<input type="text" name="quantity"  value=""/><br> <br> 
Enter Product Description:<input type="text" name="desc" value="" /><br>
Vendor Id:<input type="number" name="vend_id" value="" /><br>
Add Product Image <input type="file" name="file" value="image"/><br/>  -->

<div class="navbar">
  <a href="#home">Home</a>
  <a href="#news">News</a>
  <div class="dropdown">
    <button class="dropbtn">Select Profile
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="#">Link 1</a>
      <a href="#">Link 2</a>
      <a href="#">Link 3</a>
    </div>
  </div> 
</div>

<h3>Dropdown Menu inside a Navigation Bar</h3>
<p>Hover over the "Dropdown" link to see the dropdown menu.</p>






</body>
</html>
