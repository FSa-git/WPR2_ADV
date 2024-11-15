package com.example.bmicalculator.a06_bean;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Weiter", value = "/Weiter")
public class Weiter extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        ServletContext kontext = getServletContext();
        Daten alt = (Daten) kontext.getAttribute("daten");; // Typecast, damit wir auf die Methoden zugreifen können
        // Typeacast ist notwendig, weil wir nur Objecte speichern können
        // Sind aber in der Klausur nicht notwendig !!
        out.print("<!DOCTYPE html><html><head><meta charset=\"UTF-8\">");
        out.print("<title>Ausgabe</title></head><body>");
        out.print("<h1>Ausgabe</h1>");
        out.print("<p>Name: " + alt.getName() + "</p>");
        out.print("<p>Vorname: " + alt.getVorname() + "</p>");
        out.print("<p>Wohnort: " + alt.getWohnort() + "</p>");
        out.print("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}