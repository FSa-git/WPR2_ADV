package com.example.bmicalculator.anmeldung_08;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/indexAnmeldung.html")
public class Start extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {
        PrintWriter out = response.getWriter();

        Cookie[] alle = request.getCookies(); // Cookies werden in einem Array zurückgegeben
        Cookie login = null;

        // Ausfiltern des Cookies
        if (alle != null) {
            for (Cookie c : alle) {
                if (c.getName().equals("login")) {
                    login = c;
                }
            }
        }

        // Wenn der Benutzer schon angemeldet ist, dann wird er kein Login sehen
        // Vielleicht wurde noch kein login cookie angelegt
        if (login == null) {
            out.print("<!DOCTYPE html><html><head><meta charset=\"UTF-8\">");
            out.print("<title>Anmeldung</title></head><body>");
            out.print("<h1>Anmeldung</h1>");

            // Falls eine vorherige Anmeldung nicht erfolgreich war, und hierher zurückgeleitet wurde, soll die Fehlermeldung erscheinen
            // interne Umleitung mit
            if (request.getAttribute("fehler") != null) {
                out.print("<p style='color:red'>Fehler bei der Anmeldung</p>");
            }

            out.print("<form method='post' action='Auswerten'>");
            out.print("<label>Login: <input type='text' name='login'></label><br>");
            out.print("<label>Passwort: <input type='password' name='passwort'></label><br>");
            out.print("<input type='submit' value='Anmelden'>");
            out.print("</form>");
            out.print("</body></html>");
        }
        else {
            request.getRequestDispatcher("willkommen.html").forward(request, response); // serverseitige Umleitung
            // oder clientseitige Umleitung
        }

    }

}