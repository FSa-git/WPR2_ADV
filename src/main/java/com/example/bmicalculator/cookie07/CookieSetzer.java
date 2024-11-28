package com.example.bmicalculator.cookie07;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CookieSetzer", value = "/CookieSetzer")
public class CookieSetzer extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Cookie keks = new Cookie("keks", "12345"); // Cookies brauchen Schlüssel-Werte-Paare
        // Inhalt immer String, aber sind nicht alle Inhalte erlaubt (keine Leerzeichen, Sonderzeichen)
        // Warenkorb wir im Server gespeichert und die id wird im client geschickt

        out.print("<html><head><title>Cookie-Beispiel</title></head><body>");
        out.print("<h1>Cookie-Beispiel</h1>");
        out.print("<p>Ein Cookie wird bzw. wurde gesetzt.</p>");
        response.addCookie(keks); // Cookie wird gesetzt
        // Ablfaufdatum ist bei -1 (default) bis zum Ende der Session
        // setAge(0) löscht das Cookie..?
    }
}