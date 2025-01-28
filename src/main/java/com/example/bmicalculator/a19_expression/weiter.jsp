<%@ page import="com.example.bmicalculator.a18_bean.Person" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="bohne.Person" %>
<!DOCTYPE html>
<html>
<head>
    <title>Willkommen</title>
</head>
<body>
<% if (request.getParameter("vorname").equals("Thomas")){
    response.sendRedirect("index.jsp?fehler=ja");
}%>
<h3>Willkommen

<% out.print(request.getParameter("vorname"));
    out.print(request.getParameter("nachname"));
%>
</h3>
<!--Ist das gleiche wie das hier, expression langauge-->
<h3>Willkommen

    ${param.vorname}
    ${param.nachname}
</h3>
<% session.setAttribute("vorname", request.getParameter("vorname")); %> <!--Setze den Wert des Queryparameters "eingabe" in die Session-->
<%--<% session.setAttribute("vorname", request.getParameter("vorname")); %> <!--Setze den Wert des Queryparameters "eingabe" in die Session-->--%>
<jsp:useBean id="person" class="bohne.Person" scope="session"/>
<jsp:setProperty name="person" property="*" />

<jsp:setProperty name="person" property="vorname" value="${ empty param.vorname ? 'hurz' : param.vorname}" />

<p><a href="nochweiter.jsp">Hier</a> geht es weiter</p>
<!-- Die folgende Zuweisung -->
</body>
</html>