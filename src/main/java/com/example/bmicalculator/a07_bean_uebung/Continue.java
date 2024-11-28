package com.example.bmicalculator.a07_bean_uebung;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Continue", value = "/Continue")
public class Continue extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        ServletContext c = this.getServletContext();
        Databean alt = (Databean) c.getAttribute("datas");
        out.print("<!DOCTYPE html><html><head><meta charset=\"UTF-8\">");
        out.print("<title>Ausgabe</title></head><body>");
        out.print("<h1>Ausgabe</h1>");
        out.print("<p> Name: " + alt.getName() + "</p>");
        out.print("<p> Adresse: " + alt.getAdresse() + "</p>");
        out.print("</body></html>");
    }

}