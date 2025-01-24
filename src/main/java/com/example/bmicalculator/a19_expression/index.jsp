<%@ page import="com.example.bmicalculator.a18_bean.Person" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Eingabe</title>
</head>
<body>
<h3>Eingabe</h3>
    <form method="post" action="weiter.jsp">
        <p>
            <label for="eingabe">Vorname: </label>
            <input type="text" name="vorname" id="vorname">
        </p>
        <p>
            <label for="eingabe2">Nachname: </label>
            <input type="text" name="nachname" id="nachname">
        </p>
        <p>
            <button type="submit">Senden</button>
        </p>

    </form>
</body>
</html>