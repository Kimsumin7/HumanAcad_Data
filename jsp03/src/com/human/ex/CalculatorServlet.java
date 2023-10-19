package com.human.ex;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.human.cal.CalClass;

@WebServlet("/CalculatorEx")
public class CalculatorServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public CalculatorServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        myCalculator(request, response);
    }

    private void myCalculator(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        double num1 = Double.parseDouble(request.getParameter("num1"));
        double num2 = Double.parseDouble(request.getParameter("num2"));

        String operator = request.getParameter("operation");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("num1, num2 계산 결과<br>");

        CalClass calClass = new CalClass();
        calClass.setNum1(num1);
        calClass.setNum2(num2);
        calClass.setOperator(operator);
        System.out.println(calClass);
        out.println(": " + calClass.resultString());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        doGet(request, response);
    }
}