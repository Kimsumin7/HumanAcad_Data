package com.human.ex;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("*.servlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String uri = request.getRequestURI();
        System.out.println("URI:" + uri);
        String conPath = request.getContextPath();
        System.out.println("conPath:" + conPath);
        String command = uri.substring(conPath.length());
        System.out.println("command:" + command);
        String viewPage = "login.jsp";
        if (command.equals("/login.servlet")) {
            viewPage = "success.jsp";
        } else if (command.equals("/loginDB.servlet")) {
            System.out.println("login.servletDB");
            viewPage = "success.jsp";
            String user_id = request.getParameter("user_id");
            String user_pw = request.getParameter("user_pw");
            if (user_id.trim().equals("java") && user_pw.trim().equals("1234")) {
                HttpSession session = request.getSession();
                session.setAttribute("user_id", user_id);
                session.setMaxInactiveInterval(600);
            } else {
                viewPage = "login.jsp";
            }
        } else if (command.equals("/logout.servlet")) {
            viewPage = "login.jsp";
            HttpSession session = request.getSession();
            session.invalidate();
            System.out.println("logout.servlet");
        }
        System.out.println(viewPage);
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
