<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <html>
        <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Product Page</title>
        </head>
        <style>
        * {
            padding-top: 10px;
            font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS',
                sans-serif;
            color: rgb(14, 0, 5);
        }
        
        
        
        .item a {
            color: rgb(0, 0, 0);
            margin-left: 30px;
            text-decoration: none;
        }
        
        .rounded {
            border-style: solid;
            border-radius: 10px;
            width: fit-content;
        }
        </style>
        
        <body
            style="background-color: lightslategray; margin-left: 30%; margin-right: 30%;">
            <br>
            <br>
            <div
                style="background-color: rgb(194, 237, 235); border: 2px solid black;">
                <center>
                    <form action="addProduct" method="POST" modelAttribute="addProduct"
                        enctype="multipart/form-data">
                        <div class="item">
                            <a class="active" href="homePage">Home Page</a>
                            <a href="addProduct">Add Products</a> 
                            <a href="viewProducts">Show Products</a>
                        </div>
                        
                </center>
            </div>
        </body>
        </html>