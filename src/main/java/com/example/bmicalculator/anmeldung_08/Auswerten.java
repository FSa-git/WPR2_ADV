package com.example.bmicalculator.anmeldung_08;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Auswerten", value = "/Auswerten")
public class Auswerten extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Prüfen, ob die Anmeldedaten aus dem Formular korrekt sind

        PrintWriter out = response.getWriter();

        // Falls ja: Cookie für automatischen Login setzen (sonst landet er immer auf der Anmeldeseite!)
        //            + Weiterleitung zur Willkommensseite "willkommen.html"
        out.print("<!DOCTYPE html><html><head><meta charset=\"UTF-8\">");
        out.print("<title>Willkommen</title></head><body>");
        out.print("<h1>Willkommen</h1>");
        out.print("<p>Herzlich willkommen, Herr XY!</p>");
        out.print("</body></html>");

        // Falls nein: Weiterleitung zur Anmeldung "indexAnmeldung.html" mit dem Parameter "fehler"

    }

    // Registrierung kann auch zusätzlich gemacht werden  -> Register.java / Servlet 
}