package com.example.bmicalculator.a07_bean_uebung;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Weiterleitung", value = "/Weiterleitung")
public class Weiterleitung extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Databean dbs = new Databean();
        ServletContext context = getServletContext();

        dbs.setName(request.getParameter("name"));
        dbs.setAdresse(request.getParameter("adresse"));

        context.setAttribute("datas", dbs);
        out.print("<!DOCTYPE html><html><head><meta charset=\"UTF-8\">");
        out.print("<title>Adresseingabe</title></head><body>");
        out.print("<h1>Eingabe erfolgreich</h1>");
        out.print("<p>Die Daten wurden erfolgreich gespeichert.</p>");
        out.print("<p>Danke für Ihre Daten</p>");
        out.print("<a href=\"Continue\">Hier geht es weiter</a>");
        out.print("</body></html>");
    }

}