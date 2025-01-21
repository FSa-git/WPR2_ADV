<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.LinkedList, java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Ausgabe</title>
</head>
<body>
<h3>Ausgabe</h3>
<ol>
    <% @SuppressWarnings("unchecked")
        ArrayList<String> artikelliste = (ArrayList<String>) session.getAttribute("artikelliste");
        for (String element: artikelliste) {
    %>
    <li>Artikel: <% out.print(element); %></li>
    <% } %>
</ol>
</body>
</html>