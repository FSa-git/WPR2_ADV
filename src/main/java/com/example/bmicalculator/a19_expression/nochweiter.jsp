<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="bohne.Person" %>
<!DOCTYPE html>
<html>
<head>
    <title>nochweiter</title>
</head>
<body>
<h3>Hallo
<% out.print(session.getAttribute("vorname")); %> <!--Hole den Wert des Attributes "eingabe" aus der Session und gib ihn aus-->
</h3>
<jsp:useBean id="person" class="bohne.Person" scope="session"/>
<h3>Hallo
    ${sessionScope.vorname} <!--Ist das gleiche wie das hier, expression langauge-->
</h3>
<h3>Hallo
    ${sessionScope.nachname} <!--Ist das gleiche wie das hier, expression langauge-->
</h3>
<h3>Hallo 
    <jsp:getProperty name="person" property="nachname"/>
</h3>
<h3>Hallo ${person.vorname} ${person.nachname}</h3> <!--Mit Expression Language geht es auch noch einfacher-->
<%--<% Person pers = (Person) session.getAttribute("person");--%>
<%--    out.print(pers.getVorname());--%>
<%--%>--%>
<p>Referer: ${header.referer}</p>
<p><a href="vielweiter.jsp"Hier></a>noch weiter</p>
</body>
</html>