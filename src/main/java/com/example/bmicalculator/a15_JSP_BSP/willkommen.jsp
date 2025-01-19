<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.LinkedList, java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
    <title>Willkommen - JSP</title>
</head>
<body>
   <h2>Willkommen
    <%= request.getParameter("id") %>
</h2>
<p>
    <a href="weiter.html">Hier</a> geht es weiter
</p>
<!-- Aufrufzähler -->
<p>Dies ist der
    <% Integer anzahl = (Integer) application.getAttribute("anzahl");
        if (anzahl == null) {
            anzahl = 0;
        }
        anzahl++;
        application.setAttribute("anzahl", anzahl);
    %>
    . Aufruf dieser Seite</p>
</body>
</html>