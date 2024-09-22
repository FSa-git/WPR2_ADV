package com.example.bmicalculator;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/bmi")
public class BmiServlet extends HttpServlet {

    public BmiServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        // super.doGet(req, res);

        PrintWriter out = res.getWriter();
        out.println("<html><body>");
        out.println("<h1>BMI Rechner</h1>");
        out.println("<form method='post' action='bmi'>");
        out.println("KG: <input type='text' name='gewicht'><br>");
        out.println("M (Meter): <input type='text' name='groesse'><br>");
        out.println("Geschlecht: <input type='radio' name='geschlecht' value='m'>Männlich");
        out.println("<input type='radio' name='geschlecht' value='w'>Weiblich<br>");
        out.println("<input type='submit' value='Berechne BMI'>");
        out.println("</form>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        double height = Double.parseDouble(req.getParameter("groesse"));
        double weight = Double.parseDouble(req.getParameter("gewicht"));

        double bmi = weight / (height * height);
        String geschlecht = req.getParameter("geschlecht");

        res.setContentType("text/html");
        // super.doPost(req, res);

        PrintWriter out = res.getWriter();

        out.println("<html><body>");
        out.println("<h1>BMI-Ergebnis: " + bmi + "</h1>");
        out.println("<h2>Auswertung:</h2>");
        out.println("<br>");
        if (bmi < 16) {
            out.println("Starkes Untergewicht");
        } else if (bmi < 18.5) {
            out.println("Untergewicht");
        } else if (bmi <= 20 && bmi < 25 && geschlecht.equals("m")) {
            out.println("Normalgewicht");
        } else if (bmi <= 19 && bmi < 24 && geschlecht.equals("w")) {
            out.println("Normalgewicht");
        } else if (bmi > 25){
            out.println("Übergewicht");
        } else if (bmi > 40) {
            out.println("Starkes Übergewicht");
        }
        out.println("<br>");
        out.println("<br>");
        // Zum testen
        out.println("Geschlecht: " + geschlecht);

        out.println("<br>");
        out.println("<a href='bmi'>Zurück zur Startseite</a>");
        out.println("</body></html>");
    }
}