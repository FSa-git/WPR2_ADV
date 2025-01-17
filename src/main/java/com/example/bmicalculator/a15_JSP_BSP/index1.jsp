<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Startseite</title>
</head>
<body>
<h2>Anmeldung</h2>
<% if (request.getParameter("id") != null) { %>
    <p style="color: red">Falsche ID!</p>
<% } %>
<br/>
    <p>Mir geht es gut
        <% String x = request.getParameter("fehler");

            if ((x != null) && (x.equals("1"))) { %>
                    <%-- if (request.getParameter("x").equals("1")) { %>--%>
            gut
        <% } else { %>
            schlecht
        <% } %>
        <!-- index1.jsp?x=2, dann schlecht -->
        <!-- index1.jsp?x=1, dann gut -->
        <!-- index1.jsp, error weil Parameter null ist => null equals 1 ? Falsch! (Nullpointer Exception) -->
    </p>
    <br/>
<form method="post" action="willkommen.jsp">
    <p>
        <label for="id">ID:</label>
        <input type="text" name="id" id="id">
    </p>

    <p>
        <button type="submit">Anmelden</button>
    </p>
</form>
</body>
</html>