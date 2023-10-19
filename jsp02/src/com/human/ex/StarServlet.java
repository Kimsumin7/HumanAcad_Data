package com.human.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StarServlet")
public class StarServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String char1 = request.getParameter("char1");
        int num1 = Integer.parseInt(request.getParameter("num1"));

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        for (int i = 0; i < num1; i++) {
            for (int j = i; j < num1; j++) {
                out.println("&nbsp;");
            }
            for (int j = 0; j <= i; j++) {
                out.println("*");
            }
            out.println("<br>");
        }
        out.println("</body>");
        out.println("</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
