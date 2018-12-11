<%-- 
    Document   : getaccount
    Created on : 11.12.2018, 10:13:51
    Author     : UserAdmin
--%>

<%@page import="java.util.List"%>
<%@page import="com.spec.entity.UserAccount"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <% List<UserAccount> list = (List) request.getAttribute("listUA"); %>
        <% for(UserAccount u : list) { %>
        <p><%=u.getUsername()%> - <%=u.getEmail()%></p>
        <% } %>
    </body>
</html>
