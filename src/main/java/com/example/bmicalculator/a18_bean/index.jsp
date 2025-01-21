<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Eingabe</title>
</head>
<body>
<h3>Eingabe</h3>
<!--Beliebige Inhalte anhand einer Schleife anzeigen-->
<form method="post" action="weiter.jsp">
    <p>
        <label for="vn">Vorname:</label>
            <input type="text" name="vorname" id="vn">
    </p>
    <p>
        <label for="nn">Nachname:</label>
            <input type="text" name="nachname" id="nn">
    </p>
    <p><button type="submit">Senden</button> </p>
</form>
</body>
</html>