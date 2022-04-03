<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<style>
  .body{
    
    background-image: url("https://www.shopickr.com/wp-content/uploads/2015/10/amazon-india-electronics-sale-2015-banner1.jpg");
  
  }
  .navbar {
 
 align-items: center;
 justify-content: space-between;
 padding: 20px;
 background-color: rgb(0, 7, 7);
 color: #fff;
}
.nav-items a{
    
    color: rgb(247, 242, 242);
    margin-left: 100px;
     font-size: 15px;
    text-decoration:none;
    text-align: right;

}
.nav-items a:hover {
    color: #b4afaf;
  }
 
.brand-logo{
   
    width: 60px;
    height: 60px;
    border-radius:50px;
    align-items: center;
    
}

</style>
<body class="body">
  <nav class="navbar">
    <div class="nav">
    <div class="nav-items">
      <div class="container">
    <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQFTkl44pUoG2MaIqgOIh42AHLVkdnhZQTs16AfSpiOPQ&s" class="brand-logo" alt=""> 
      <a class="active" href="/homePage">Home</a>
      <a href="/addProduct">Products</a>
      <a href="/contactUs">Contact Us</a>
      <a href="aboutUs">About Us</a>
      <a href="/signUp">Sign Up</a>
      <a href="/signIn">Sign In</a>
       <a href="/feedback">Feedback</a>
    </div> 
    </div>
    </div>
    </nav>

</body>
</html>