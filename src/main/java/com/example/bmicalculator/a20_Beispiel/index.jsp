<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Willkommen</title>
</head>
<body>
<h3>Ein guter Start</h3>

<!--Cookie setzen -->
<% Cookie keks = new Cookie("keks", "kruemel");
    response.addCookie(keks);
%>

<p><a href="weiter.jsp">Hier</a> geht es weiter</p>
</body>
</html>