<%@ page import="java.util.HashMap" %>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>for-each Beispiele</title>
</head>
<body>
    <h3>for-each Beispiele</h3>
    <h4>Schleife</h4>
    <c:forEach begin="1" end="5">
        5 x Hallo
    </c:forEach>
    <c:forEach var="i" begin="1" end="5">
        <p>Zahl: ${i}</p>
    </c:forEach>
    <p>Alle ungeraden Zahlen zwischen 1 und 10</p>
<c:forEach begin="1" end="10" step="2" var="i">
    ${i}
</c:forEach>
<h4>
    Listendurchlauf
</h4>
<p>Buchstaben von A bis F:</p>
<c:forEach items="A,B,C,D,E,F" var="x">Buchstaben: ${x}</c:forEach>
<br>
    <p>Ich glaube das ist in entsprechenden Elementen unterteilt</p>
    <c:forEach items="{A,B,C,D,E,F}" var="x">Buchstaben: ${x}</c:forEach>
<br>
    <c:forEach items="[A B C D E F]" var="x">Buchstaben: ${x}</c:forEach>
<br>
    <c:forEach items="A B C D E F" var="x">Buchstaben: ${x}</c:forEach>
<br>
<h4>Listendurchlauf mit Status</h4>
<p>Buchstaben von A bis F:</p>
    <table border="1">
        <tr>
            <th>Current</th>
            <th>index</th>
            <th>count</th>
            <th>first</th>
            <th>last</th>
        </tr>
        <c:forEach items="A,B,C,D,E,F" varStatus="x">
            <tr>
                <td>${x.current}</td>
                <td>${x.index}</td>
                <td>${x.count}</td>
                <td>${x.first}</td>
                <td>${x.last}</td>
                <c:set var="anzahl" value="${x.count}" scope="page"></c:set>
            </tr>
        </c:forEach>
    </table>
<p>Es waren insgesamt ${anzahl} Elemente</p>
<h4>Durchlauf einer Map</h4>

</body>
</html>