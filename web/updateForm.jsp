<%-- 
    Document   : updateForm
    Created on : Oct 19, 2017, 8:17:19 PM
    Author     : guohuinan
--%>

<%@page import="model.Lipsticks"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Lipsticks lipstick = (Lipsticks) request.getAttribute("lipstick");%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update a Lipstick</title>
        <link rel="StyleSheet" type="text/css" href="StyleSheet.css" />
    </head>
    <body>
         <h1>Update a Lipstick</h1>
        
        <form name="updateForm" action="updateLipstick" method="get">
        
            <table class="update">
            <tr>
            <td class="right"> Item ID:</td>
            <td><input type="text" name="itemid" value="<%= lipstick.getItemID() %>" readonly/><td>
            </tr>
            
            <tr>
            <td class="right"> Product Name:</td>
            <td><input type="text" name="productname" value="<%= lipstick.getProductName() %>"/><td>
            </tr>
            
             <tr>
            <td class="right"> Brand:</td>
            <td><input type="text" name="brand" value="<%= lipstick.getBrand() %>"/><td>
            </tr>
            
            <tr>
            <td class="right"> Color:</td>
            <td><input type="text" name="color" value="<%= lipstick.getColor() %>"/><td>
            </tr>
            
            <tr>
            <td class="right"> Price:</td>
            <td><input type="text" name="price" value="<%= lipstick.getPrice() %>"/><td>
            </tr>
            
           
            </table>
             <br>
              <input type="reset" name="reset" value="Clear" />
            <input type="submit" name="submit" value="Update"/>
        </form>
    </body>
</html>
