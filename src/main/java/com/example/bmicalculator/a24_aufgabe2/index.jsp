<%@ page import="java.util.HashMap" %>
<%@page language="java" contentType="text/html; charset=UTF-8" import="java.util.HashMap" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri=""%>
<!DOCTYPE html>
<html>
<head>
    <title>Linklistenverwaltung</title>
</head>
<body>
<h3>Linklistenverwaltung</h3>
<p>Version ohne Anmeldung</p>
<form method="post" action="hinzu.jsp">
    <p><label for="url">URL:</label>
        <input type="text" name="url" id="url">
    </p>
    <p><button type="submit">Hinzufügen</button></p>
    <p><button type="submit" formaction="entfernen.jsp">Entfernen</button></p>
</form>
<form method="post" action="index.jsp">
        <input type="hidden" name="anzeigen" value="ja">
    <p><button type="submit">Liste anzeigen</button></p>
</form>
<c:if test="${not empty param.anzeigen}">
    <h4>Derzeitige Linkliste</h4>
</c:if>
</body>
</html>