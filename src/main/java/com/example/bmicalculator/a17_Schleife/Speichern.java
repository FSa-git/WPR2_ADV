package com.example.bmicalculator.a17_Schleife;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;

@WebFilter("/weiter.jsp")
public class Speichern extends HttpFilter implements Filter {

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpSession session = ((HttpServletRequest)request).getSession();
        ArrayList<String> artikelliste = new ArrayList<String>();
        for (int i = 1; i < 4; i++){
            artikelliste.add(request.getParameter("art" + i));
        }
        session.setAttribute("artikelliste", artikelliste);
        chain.doFilter(request, response);
    }
}
