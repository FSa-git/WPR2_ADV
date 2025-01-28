<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Willkommen</title>
</head>
<body>
<h3>Willkommen</h3>

<p>Wir kommen von ${empty header.referer ? "nirgendwoher" : header.referer}</p>
<!--Cookie filtern 2 -->
<p>Der Cookie ${cookie.keks.name} beinhaltet den Wert ${cookie.keks.value}</p>


<%--<jsp:setProperty name="bohne" property="inhalt" value="${ empty cookie.keks ? 'default' : cookie.keks.value}"/> <!--.value ist hier wie .getValue(); -->--%>
<!-- ${cookie} gibt den Array mit allen Cookies zurück -->
<table>
    <tr><th>Variable</th><th>Inhalt</th></tr>
    <tr><td>cookie</td><td>${cookie}</td></tr>
    <tr><td>cookie.keks</td><td>${cookie.keks}</td></tr>
    <tr><td>cookie.keks.name</td><td>${cookie.keks.name}</td></tr>
    <tr><td>cookie.keks.maxAge</td><td>${cookie.keks.maxAge}</td></tr><!--Lebensdauer des Cookies-->
</table>

<!--Cookie filtern 1 -->
<% Cookie[] alle = request.getCookies();
    for (Cookie c : alle){
        if (c.getName().equals("keks")){ %>
            <p> Der Cookie
                <% out.print(c.getName()); %>
                beinhaltet
                <% out.print(c.getValue()); %>
            </p>
<%
        }
    }
%>

<p><a href="weiter.jsp">Hier</a> geht es weiter</p>
</body>
</html>