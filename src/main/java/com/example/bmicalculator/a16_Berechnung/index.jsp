<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.LinkedList, java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
    <title>Berechnung</title>
</head>
<body>
<h2>Berechnung</h2>
<form method="get" action="index.jsp">
    <!-- Action wieder auf die gleiche Seite -->
    <p>
        <label for="zahl">Zahl:</label>
        <input type="number" name="zahl" id="zahl">
    </p>
    <p>
        <button type="submit">Berechnen</button>
</form>
    <!-- Hier ist die Berechnung des Nachfolgers der eingegebenen Zahl;
        diese wird nur angezeigt, wenn der Parameter aus dem Formular vorhanden
        (d.h. nicht null) ist
    -->
    <% String zahl = request.getParameter("zahl");
        int z = 0;
            if (zahl != null) {
                z = zahl + 1;
            }
    %>
<p>Der Nachfolger der Zahl <%= zahl %> lautet <%= z %></p>
</body>
</html>