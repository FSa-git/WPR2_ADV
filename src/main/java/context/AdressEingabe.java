package context;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AdressEingabe", value = "/AdressEingabe")
public class AdressEingabe extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public AdressEingabe() {
        super();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        ServletContext context = getServletContext();
        /* Formulardaten aus der vorhergehenden Bestellung speichern */
        context.setAttribute("artikel1", request.getParameter("artikel1"));
        context.setAttribute("artikel2", request.getParameter("artikel2"));
        context.setAttribute("artikel3", request.getParameter("artikel3"));
        /* Neues Formular zur Adresseingabe */
        out.print("<!DOCTYPE html><html><head><meta charset=\"UTF-8\">");
        out.print("<title>Adresseingabe</title></head><body>");
        out.print("<h1>Adresseingabe</h1>");
        out.print("<form method='post' action='Uebersicht'>");
        out.print("<h3>Adresse:</h3>");
        out.print("<label for='vorname'>Vorname:</label>");
        out.print("<input type='text' id=\"vorname\" name=\"vorname\"><br>");
        // Von Seite zu Seite mitschleppen der Formulardaten
        // Der Kontext zu speichern ist mit diesem Ansatz eher nicht geeignet
        // out.print("<input type='hidden' name='artikel1' value='" + request.getParameter("artikel1") + "'>");
        // Stattdessen speichern wir die Daten Serverseitig
        out.print("<label for=\"nachname\">Nachname:</label>");
        out.print("<input type=\"text\" id=\"nachname\" name=\"nachname\"><br>");
        out.print("<p><button type=\"submit\">Zur &UUml;bersicht</button></p>");
        out.print("</form></body></html>");


    }
}