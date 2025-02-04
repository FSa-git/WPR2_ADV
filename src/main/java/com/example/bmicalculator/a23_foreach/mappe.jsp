<%@ page import="java.util.HashMap" %>
<%@page language="java" contentType="text/html; charset=UTF-8" import="java.util.HashMap" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Map-Beispiele</title>
</head>
<body>
<h3>Durchlauf einer Map</h3>
<% HashMap<String, String> liste = new HashMap<String , String>();
    pageContext.setAttribute("liste", liste);
%>
    <c:set target="${liste}" property="eins" value="A"></c:set>
    <c:set target="${liste}" property="zwei" value="B"></c:set>
    <c:set target="${liste}" property="drei" value="C"></c:set>
    <table border="1">
        <tr><th>Referenz</th><th>Schlüssel</th><th>Wert</th></tr>
        <c:forEach items="${liste}" var="x">
            <tr><td>${x}</td><td>${x.key}</td><td>${x.value}</td></tr>
        </c:forEach>
        <c:forEach items="${param}" var="q">
            <tr><td>${q}</td><td>${q.key}</td><td>${q.value}</td></tr>
        </c:forEach>
    </table>
</body>
</html>