package com.example.bmicalculator.cookie07;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CookieLeser", value = "/CookieLeser")
public class CookieLeser extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public CookieLeser() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Cookie[] alle = request.getCookies(); // Cookies werden in einem Array zurückgegeben
        Cookie keks = null;
        // Um Nullpointer-Exception zu vermeiden
        if (alle != null) {
            // Um den Cookie "Keks" zu finden
            for (Cookie c : alle){
                if (c.getName().equals("keks")){
                    keks = c;
                }
            }
        }
        out.print("<html><head><title>Cookie-Beispiel</title></head><body>");
        out.print("<h1>Cookie-Beispiel -Ausgabe-</h1>");
        if(keks != null){
            out.print("<p>Der Cookie-Wert beinhaltet: " + keks.getValue() + "</p>");
        } else {
            out.print("<p>Der Cookie wurde nicht gefunden</p>");
        }
        out.print("</body></html>");
    }

}