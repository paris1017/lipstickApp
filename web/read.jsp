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
      
        
        <link rel="StyleSheet" type="text/css" href="StyleSheet.css" />
   
    
    </head>
    
     <% String table = (String) request.getAttribute("table"); %> 
    
    <body>
           <div class="wrap"> 

            
              <%@ include file="includes/header.jsp" %>
            
              <%@ include file="includes/menu.jsp" %>
              
         <div class="main">   
      
       <h1>My Lipsticks</h1>
        
         <%= table %>
     
         <br><br>
         
         <a href="add"> Add a New Lipstick</a>
         
         <br><br>
         
         
         <a href="search.jsp">Search Lipsticks</a>
         
         
         
         </div>
         
        <br><br><br>
         <%@ include file="includes/footer.jsp" %>
        </div>
        
    </body>
</html>
