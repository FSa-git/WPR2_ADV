<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" errorPage="/Fehler/fehler.html" %>
<!DOCTYPE html>
<html>
<head>
    <title>Startseite</title>
</head>
<body>
<h3>Startseite</h3>
<p><jsp:getProperty property="a" name="abc"/></p>
<% try { %>
    <p><jsp:getProperty property="a" name="abc"/></p>
<% } catch (Exception e) { %>
    <p>Ein Fehler ist aufgetreten</p>
<% } %>
</body>
</html>