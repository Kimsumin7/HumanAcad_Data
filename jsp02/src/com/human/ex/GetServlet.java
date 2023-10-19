package com.human.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetServlet")
public class GetServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String data1 = request.getParameter("data1");
        String[] data2 = request.getParameterValues("data2");
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("data1값은 :");
        out.println(data1 + "<br>");
        out.println("data2값은 :");
        if (data2 != null) {
            for (String str : data2) {
                out.println(str + "<br>");
            }
        } else {
            out.print("값이 없음<br>");
        }
        out.print("</body>");
        out.print("</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doPost 시작");
        doGet(request, response);
        System.out.println("doPost 종료");
    }
}
