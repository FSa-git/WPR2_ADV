<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.LinkedList, java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
    <title>Eingabe</title>
</head>
<body>
<h3>Eingabe</h3>
<!--Beliebige Inhalte anhand einer Schleife anzeigen-->
<form method="post" action="weite.jsp">
    <ol>
        <% String name;
            for (int i = 1; i < 4; i++){
        name = "art" + i; %>
        <li>
            <label for="art">Artikel:</label>
        <input type="text" id="art" name="<% out.print(name); %>">
        </li>
        <% } %> 
    </ol>
    <p>
        <button type="submit">Senden</button>
    </p>
</form>
</body>
</html>