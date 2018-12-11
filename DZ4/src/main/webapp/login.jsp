<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login form</h1>
        <%
            String massage = (String)request.getAttribute("massage");
            if(massage!=null) {
        %>
        <p><%=massage%></p>
        <%
            }
        %>
            <form action="/DZ4/AuthServlet" method="POST">
                <label for="ilogin">Login</label>
                <input type="text" id="ilogin" name="login">
                <label for="ipasswd">Passwd</label>
                <input type="text" id="ipasswd" name="passwd">
                <input type="submit" value="Submit">
            </form>    
    </body>
</html>
