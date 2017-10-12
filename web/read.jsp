<%-- 
    Document   : read
    Created on : Oct 4, 2017, 10:57:33 AM
    Author     : guohuinan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Lipsticks</title>
    </head>
    
     <% String table = (String) request.getAttribute("table"); %> 
    
    <body>
      
       <h1>My Lipsticks</h1>
        
         <%= table %>
     
         <br><br>
         <a href="add"> Add a New Lipstick</a>
        
    </body>
</html>
