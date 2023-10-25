package com.human.ex;

import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/MyScope")
public class MyScope extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public MyScope() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 페이지 메소드 안에 변수를 생성해서 사용한다.
        String page2 = "hello page2";
        request.setAttribute("request2", "hello request2");
        HttpSession session = request.getSession();
        session.setAttribute("session2", "hello session2");

        ServletContext application = getServletContext();
        application.setAttribute("application2", "hello application2");

        System.out.println(page2);
        System.out.println((String) request.getAttribute("request2"));
        System.out.println((String) session.getAttribute("session2"));
        System.out.println((String) application.getAttribute("application2"));

        response.sendRedirect("scopeResult.jsp");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}