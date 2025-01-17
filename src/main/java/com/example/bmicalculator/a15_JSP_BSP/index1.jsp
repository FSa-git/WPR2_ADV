<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h2>Hallo</h2>
<br/>
    <p>Mir geht es gut
        <% if (request.getParameter("x").equals("1")) { %>
            gut
        <% } else { %>
            schlecht
        <% } %>
    </p>
</body>
</html>