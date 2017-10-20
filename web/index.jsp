<%-- 
    Document   : indext
    Created on : Oct 4, 2017, 10:04:42 AM
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
    <body>
        <div class="wrap"> 

            
              <%@ include file="includes/header.jsp" %>
            
              <%@ include file="includes/menu.jsp" %>
              
         <div class="main">     
        
             <h1>My Lipsticks Database</h1>
             <br>
        <a href="read">View All Lipsticks</a>
        <br>
        
        <a href="search.jsp">Search Lipsticks</a>
        </div>
        <br><br><br><br>
         <%@ include file="includes/footer.jsp" %>
        </div>
    </body>
</html>
