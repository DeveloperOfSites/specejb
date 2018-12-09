<%-- 
    Document   : customer
    Created on : Dec 7, 2018, 8:25:52 PM
    Author     : Student1
--%>

<%@page import="java.util.List"%>
<%@page import="com.spec.Entity.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello Custome 1</h1>
            <%
                java.util.List cc = (java.util.List)request.getAttribute("cust");
                int k = cc.size();
                for(int i=0 ; i<k; i++) {
            %>
            <p><%=((Customer)cc.get(i)).getFirstName()%> - <%=((Customer)cc.get(i)).getLastName()%></p>
            <%        
                }
            %>
        <h1>Hello Customer 2</h1>
            <%
                List<Customer> cc1 = (List)request.getAttribute("cust");
                for(Customer c : cc1) {
            %>
            <p><%=c.getLastName()%>-<%=c.getFirstName()%></p>
            <%  
                }
            %>
    </body>
</html>
