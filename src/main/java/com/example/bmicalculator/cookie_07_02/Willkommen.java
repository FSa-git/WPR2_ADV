package com.example.bmicalculator.cookie_07_02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Willkommen", value = "/Willkommen")
public class Willkommen extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String login = request.getParameter("login");
        if (login.equals("kessler") || login.equals("thomas")) {
//            out.print("<html><head><title>Willkommen</title></head><body>");
//            out.print("<h1>Willkommen Herr Kessler!</h1>");

            // Für Redirect

            request.setAttribute("anrede","Herr"); // Zusatsinformationen, die im Parameter nicht drin steht ...
            request.getRequestDispatcher("Startseite").forward(request, response);
        }
        else {
            response.sendRedirect("cookies2.html");
        }
    }
}