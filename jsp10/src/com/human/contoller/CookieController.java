package com.human.contoller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.Servlet")
public class CookieController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public CookieController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String uri = request.getRequestURI();
        System.out.println("URI: " + uri);
        // 원하는 주소에 대한 처리 방법
        String conPath = request.getContextPath();
        System.out.println("conPath: " + conPath);

        String command = uri.substring(conPath.length());
        System.out.println("command: " + command);

        String viewPage = "main.html";
        if (command.equals("/Create.Servlet")) {
            viewPage = "create.jsp";
            String name = request.getParameter("name");
            String value = request.getParameter("value");
            Cookie cookie = new Cookie(name, value);
            cookie.setMaxAge(600); // 쿠키 사용시간 설정 600초 동안 쿠키 유지
            response.addCookie(cookie);
            request.setAttribute("name", cookie.getName());
            request.setAttribute("value", cookie.getValue());
            request.setAttribute("age", cookie.getMaxAge());
        } else if (command.equals("/Read.Servlet")) {
            Cookie cookies[] = request.getCookies();
            request.setAttribute("cookies", cookies);
            viewPage = "read.jsp";
        } else if (command.equals("/Update.Servlet")) {
            Cookie cookies[] = request.getCookies();
            String name = request.getParameter("name");
            String updateValue = request.getParameter("updateValue");
            String value = ""; // 기존값
            for (int i = 0; i < cookies.length; i++) {
                if (name.equals(cookies[i].getName())) {
                    value = cookies[i].getValue();
                    Cookie cookie = new Cookie(name, updateValue);
                    cookie.setMaxAge(600);
                    response.addCookie(cookie);
                    request.setAttribute("name", name);
                    request.setAttribute("value", value);
                    request.setAttribute("updateValue", updateValue);
                    request.setAttribute("age", 100);
                }
            }
            viewPage = "update.jsp";
        } else if (command.equals("/Delete.Servlet")) {
            viewPage = "delete.jsp";
            Cookie cookies[] = request.getCookies();
            String delName = request.getParameter("delName");
            boolean check = false;
            String name = "";
            String value = "";
            for (int i = 0; i < cookies.length; i++) {
                if (delName.equals(cookies[i].getName())) {
                    check = true;
                    name = cookies[i].getName();
                    value = cookies[i].getValue();
                    cookies[i].setMaxAge(0); // 삭제됨
                    response.addCookie(cookies[i]);
                    request.setAttribute("name", name);
                    request.setAttribute("value", value);
                }
            }
            request.setAttribute("check", check);
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
