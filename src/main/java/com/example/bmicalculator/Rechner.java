package com.example.bmicalculator;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/rechner")
public class Rechner extends HttpServlet {

    public Rechner() {
        super();
    }

    @Override
protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    res.setContentType("text/html");

    PrintWriter out = res.getWriter();
    out.println("<html><body>");
    out.println("<h1>Calculator</h1>");
    out.println("<form method='post' action='rechner'>"); // Korrigierter action-Wert
    out.println("Zahl 1: <input type='text' name='number1'><br>");
    out.println("Operator: <select name='operator'>");
    out.println("<option value='+'>+</option>");
    out.println("<option value='-'>-</option>");
    out.println("<option value='*'>*</option>");
    out.println("<option value='/'>/</option>");
    out.println("</select><br>");
    out.println("Zahl 2: <input type='text' name='number2'><br>");
    out.println("<input type='submit' value='Berechnen'>");
    out.println("</form>");
    out.println("</body></html>");
}

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        try {
            int number1 = Integer.parseInt(req.getParameter("number1"));
            String operator = req.getParameter("operator");
            int number2 = Integer.parseInt(req.getParameter("number2"));
            double result;

            switch (operator) {
                case "+":
                    result = number1 + number2;
                    break;
                case "-":
                    result = number1 - number2;
                    break;
                case "*":
                    result = number1 * number2;
                    break;
                case "/":
                    if (number2 == 0) {
                        out.println("<h1>Fehler: Division durch Null ist nicht erlaubt.</h1>");
                        out.println("<a href='calculator'>Versuchen Sie es erneut</a>");
                        return;
                    }
                    result = number1 / number2;
                    break;
                default:
                    out.println("<h1>Fehler: Ungültiger Operator.</h1>");
                    return;
            }

            out.println("<h1>Ergebnis: " + number1 + " " + operator + " " + number2 + " = " + result + "</h1>");
            out.println("<a href='rechner'>Erneut berechnen</a>");
        } catch (NumberFormatException e) {
            out.println("<h1>Fehler: Bitte gültige Zahlen eingeben.</h1>");
            out.println("<a href='calculator'>Versuchen Sie es erneut</a>");
        }

}
}
