package context;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Uebersicht", value = "/Uebersicht")
public class Uebersicht extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public Uebersicht() {
        super();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {
        PrintWriter out = response.getWriter();
        ServletContext context = getServletContext();

        /* Bestellungsartikel und Adressdaten ausgeben */
        out.print("<!DOCTYPE html><html><head><meta charset=\"UTF-8\">");
        out.print("<title>Bestellungs&uuml;bersicht</title></head><body>");
        out.print("<h1>Bestellungs&uuml;bersicht</h1>");
        // Wegen Formularparameter benutze hier request.getParameter und nicht context.getAttribute
        out.print("<ol><li>Artikel 1: " + context.getAttribute("artikel1") + "</li>");
        out.print("<ol><li>Artikel 2: " + context.getAttribute("artikel2") + "</li>");
        out.print("<ol><li>Artikel 3: " + context.getAttribute("artikel3") + "</li>");
        out.print("</ol><h3>Adresse:</h3>");
        // Wegen Formularparameter benutze hier request.getParameter und nicht context.getAttribute
        out.print("<p>Vorname: " + request.getParameter("vorname") + "</p>");
        out.print("<p>Nachname: " + request.getParameter("nachname") + "</p>");

        out.print("</body></html>");

        response.setContentType("text/html");
    }
}