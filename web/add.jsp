<%-- 
    Document   : add
    Created on : Oct 11, 2017, 5:47:29 PM
    Author     : guohuinan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add a New Lipstick</title>
        <link rel="StyleSheet" type="text/css" href="StyleSheet.css" />
    </head>
    <body>
        <h1>Add a New Lipstick</h1>
        
        <form name="addForm" action="addLipstick" method="get">
        
            <label> Product Name:</label>
            <input type="text" name="productname" value=""/>
            <br>
            <label>Brand:</label>
            <input type="text" name="brand" value=""/>
            <br>
            <label>Color:</label>
            <input type="text" name="color" value=""/>
            <br>
            <label>Price</label>
            <input type="text" name="price" value=""/>
            <br>
            <input type="submit" name="submit" value="Submit"/>
        </form>
    </body>
</html>
