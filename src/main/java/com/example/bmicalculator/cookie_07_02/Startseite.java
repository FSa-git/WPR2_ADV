package com.example.bmicalculator.cookie_07_02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Startseite", value = "/Startseite")
public class Startseite extends HttpServlet {


    // Diesmal geht es um Redirects

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {
        PrintWriter out = response.getWriter();
        out.print("<html><head><title>Willkommen</title></head><body>");
        out.print("<h1>Willkommen Herr Kessler!</h1>");
        out.print(request.getAttribute("anrede"));
        out.print(" " + request.getParameter("login"));
        out.print("</body></html>");
    }

}