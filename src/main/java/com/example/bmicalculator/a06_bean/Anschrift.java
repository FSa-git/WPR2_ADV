package com.example.bmicalculator.a06_bean;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Anschrift", value = "/Anschrift")
public class Anschrift extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public Anschrift() {
        super();
    }

    /**
     * Speicher Daten aus dem vorhergehenden Formular in der
     * Daten-Bean und zeige Link zur nachfolgenden Seite an
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {
        PrintWriter out = response.getWriter();
        Daten neu = new Daten();
        // Datenspeichern, man kann auch this.getServletContext() schreiben...
        ServletContext kontext = getServletContext();

        neu.setName(request.getParameter("name"));
        neu.setVorname(request.getParameter("vorname"));
        neu.setWohnort(request.getParameter("wohnort"));

        kontext.setAttribute("daten", neu); // Ist jetzt im Servlet-Kontext gespeichert

        out.print("<!DOCTYPE html><html><head><meta charset=\"UTF-8\">");
        out.print("<title>Adresseingabe</title></head><body>");
        out.print("<h1>Eingabe erfolgreich</h1>");
        out.print("<p>Die Daten wurden erfolgreich gespeichert.</p>");
        out.print("<p>Danke für Ihre Daten</p>");
        out.print("<a href=\"Weiter\">Hier geht es weiter</a>");
        out.print("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}