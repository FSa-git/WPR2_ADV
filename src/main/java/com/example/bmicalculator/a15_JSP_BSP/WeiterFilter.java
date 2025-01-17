package com.example.bmicalculator.a15_JSP_BSP;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebFilter("weiter.html")
public class WeiterFilter extends HttpFilter implements Filter {

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {

       Cookie[] alle = ((HttpServletRequest)req).getCookies();
       Cookie login = null;

        if (alle != null) {
            for (Cookie c : alle){
                if (c.getName().equals("login") && c.getValue().equals("ok")){
                    login = c;
                }
            }
        }
        if (login != null){
            chain.doFilter(req, res);
        }
        else {
            ((HttpServletResponse) res).sendRedirect("index.jsp?fehler=2");
        }

    }
}
