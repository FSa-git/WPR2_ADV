package com.example.bmicalculator.a03;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/PizzaBestellungServlet")
public class PizzaBestellung extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public PizzaBestellung() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<!DOCTYPE html><html><head><meta charset=\"UTF-8\">");
        out.print("<title>Pizza-Bestellung</title></head><body>");
        out.print("<h1>Menu-Auswahl</h1>");
        out.print("");
        out.print("</body></html>");
    }

}
