<%-- 
    Document   : newjsp
    Created on : 11.12.2018, 11:15:47
    Author     : UserAdmin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% String userName = (String)request.getAttribute("userName"); %>
        <h1>Hello User! <%=userName%></h1>
    </body>
</html>
