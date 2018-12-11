<%-- 
    Document   : getaccount
    Created on : 11.12.2018, 9:39:45
    Author     : UserAdmin
--%>
<%@page import="com.spec.entity.UserAccount"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello Accaunt!</h1>
        <%
            List<UserAccount> lua = (List) request.getAttribute("listaccount");
            String str = (String) request.getAttribute("mytext");
        %>    
        <p>mytext =<%=str%></p>
        <p>mytext =<%=lua.size()%></p>
        <% for(UserAccount a : lua) { %>
        <p><%=a.getUsername()%></p>
        <% } %>
    </body>
</html>
