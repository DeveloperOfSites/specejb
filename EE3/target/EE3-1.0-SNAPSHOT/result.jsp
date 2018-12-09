
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result Page</title>
    </head>
    <body>
        <h1>Result Page</h1>
        <% 
            String str = (String)request.getAttribute("result1");
        %>
        <%=str%>
        
        <table border="1">
            <%
                for(int i = 0 ; i<10; i++) {
            %>
            <tr>
                <td><%=i%></td>
                <td>2</td>
            </tr>
            <%
                }
            %>
        </table>
    </body>
</html>
