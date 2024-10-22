package com.example.bmicalculator.a04_loesung;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "umrechnung", value = "/umrechnung")
public class Umrechnung extends HttpServlet {

    private static final long serialVersionUID = 1L;
    // Konstruktor
    public Umrechnung() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String meilen = request.getParameter("meilen"); // Formularparamter auslesen
        ServletConfig konfig = this.getServletConfig(); // Servletconfig-Parameter auslesen
        String meilenFaktor = konfig.getInitParameter("meilenFaktor"); // Init-Parameter auslesen

        PrintWriter out = response.getWriter();

        Double ergebnis; // Ergebnisvariable
        ergebnis = Double.parseDouble(meilen) * Double.parseDouble(meilenFaktor); // Berechnung

        // HTML-Response
        response.setContentType("text/html");
        out.print("<!DOCTYPE html><html><head><meta charset=\"UTF-8\">");
        out.print("<title>Meilen in Kilometer umrechnen</title></head><body>");
        out.print("<h1>Meilen in Kilometer umrechnen</h1>");
        out.print("<h3>Ergebnis:</h3>");
        out.print("<p>" + meilen + " Meilen entsprechen " + ergebnis + " Kilometern.</p>");
        out.print("</body></html>");

    }
}