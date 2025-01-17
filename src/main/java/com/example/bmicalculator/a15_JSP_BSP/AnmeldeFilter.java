package com.example.bmicalculator.a15_JSP_BSP;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebFilter("/willkommen.jsp")
public class AnmeldeFilter extends HttpFilter implements Filter {

    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {

        String id = req.getParameter("id");

        if ((id == null) || (!id.contains("e"))){
            // Wenn im Anmeldenamen kein "e" enthalten ist oder die id null ist, wird auf die index.jsp-Seite zurückgeleitet
            ((HttpServletResponse) res).sendRedirect("index.jsp?fehler=1");
        }
        else {
            Cookie keks = new Cookie("login", "ok");
            ((HttpServletResponse) res).addCookie(keks); // Cookie wird gesetzt
            chain.doFilter(req, res); // Weiterleitung auf die willkommen.jsp-Seite
        }
    }
}
