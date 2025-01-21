<%@ page import="com.example.bmicalculator.a18_bean.Person" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Eingegeben</title>
</head>
<body>
<h3>Eingegeben!</h3>
<p>Ihre Daten wurden gespeichert</p>
<p><a href="ausgabe.jsp">Hier</a> geht es weiter</p>

<!--JSP Aktionselemente-->
<!--Nimm den Queryparameter "vorname" aus dem Formular und schreibe den Inhalt in das Attribut "vorname" der Bean-->
<jsp:useBean id="p" class="a18_bean.Peson" scope="session"/>
<jsp:setProperty name="p" property="vorname" param="vorname"/>
<jsp:setProperty name="p" property="nachname" param="nachname"/>

<!--Daten werden in der Session gespeichert und der untere Teil wird nicht angezeigt -->

<%--<%--%>
<%--    Person p = new Person();--%>
<%--    p.setVorname(request.getParameter("vorname"));--%>
<%--    p.setNachname(request.getParameter("nachname"));--%>
<%--    session.setAttribute("person", p);--%>
<%--%>--%>
</body>
</html>