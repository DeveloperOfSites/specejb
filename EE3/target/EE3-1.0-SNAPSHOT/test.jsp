<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World! test</h1>
            <form action="/EE3/ProcessorServlet" method="POST">
                <label for="fname">First Name</label>
                <input type="text" id="fname" name="per1">
                <label for="lname">Action</label>
                <input type="text" id="oname" name="action">
                <label for="lname">Last Name</label>
                <input type="text" id="lname" name="per2">
                <input type="submit" value="Submit">
            </form>    
    </body>
</html>
