package com.example.bmicalculator.a03;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/aufrufzaehler")
public class Aufrufzaehler extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Aufrufzaehler() {
        super();
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        // Zugriff auf den Servlet-Kontext
        ServletContext context = getServletContext();

        // Den aktuellen Zählerwert holen
        Integer counter = (Integer) context.getAttribute("counter");

        // Wenn der Zähler noch nicht existiert, wird er auf 0 gesetzt
        if (counter == null) {
            counter = 0;
        }

        // Den Zählerwert um 1 erhöhen
        counter++;

        // Aktualisierten Zählerwert im Servlet-Kontext speichern
        context.setAttribute("counter", counter);


        // HTML-Response
        res.setContentType("text/html");

        PrintWriter out = res.getWriter();
        out.print("<!DOCTYPE html><html><head><meta charset=\"UTF-8\">");
        out.print("<title>Aufrufzähler</title></head><body>");
        out.print("<h1>Aufrufzähler</h1>");
        out.print("<p>Dieses Servlet wurde " + counter + " mal aufgerufen.</p>");
        out.print("</body></html>");
    }
}
