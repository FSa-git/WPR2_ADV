<%@ page import="com.example.bmicalculator.a18_bean.Person" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Ausgabe</title>
</head>
<body>
<h3>Ausgabe</h3>
<%--<%--%>
<%--    Person p = (Person) session.getAttribute("person");--%>
<%--    out.print();--%>
<%--%>--%>
<%--<p>Vorname: <%out.print(p.getVorname());%></p>--%>
<%--<p>Nachname: <%out.print(p.getNachname());%></p>--%>

<!--Bei scope="application" wäre die Session im ServletContext-->
<jsp:useBean id="p" scope="session" class="a18_bean.Person"/>
<p>Vorname: <jsp:getProperty name="p" property="vorname"/></p>
<p>Nachname: <jsp:getProperty name="p" property="nachname"/></p>
</body>
</html>