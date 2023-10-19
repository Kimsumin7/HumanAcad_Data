package com.human.ex;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.human.cal.CalClass;

@WebServlet("/CheckoutServlet")
public class CalculatorServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public CalculatorServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        double price1 = Double.parseDouble(request.getParameter("price1"));
        double price2 = Double.parseDouble(request.getParameter("price2"));
        double price3 = Double.parseDouble(request.getParameter("price3"));
        double price4 = Double.parseDouble(request.getParameter("price4"));
        double discount = Double.parseDouble(request.getParameter("coupon"));

        CalClass calClass = new CalClass(price1, price2, price3, price4, discount);
        calClass.calculateDiscountedPrices();

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("구입 물건 가격 및 할인 결과:<br>");
        out.println(calClass.getResult());
        out.println("</body>");
        out.println("</html>");
    }
}
