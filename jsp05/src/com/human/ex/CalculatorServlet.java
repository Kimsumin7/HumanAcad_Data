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
        request.setCharacterEncoding("utf-8"); // 한글 처리 추가
        double price1 = Double.parseDouble(request.getParameter("product1"));
        double price2 = Double.parseDouble(request.getParameter("product2"));
        double price3 = Double.parseDouble(request.getParameter("product3"));
        double price4 = Double.parseDouble(request.getParameter("product4"));
        double discount = Double.parseDouble(request.getParameter("coupon"));

        CalClass calClass = new CalClass(price1, price2, price3, price4, discount);
        calClass.calculateDiscountedPrices();

        double total = price1 + price2 + price3 + price4;
        double discountAmount = total * discount;
        double discountedTotal = total - discountAmount;

        request.setAttribute("total", total);
        request.setAttribute("discountAmount", discountAmount);
        request.setAttribute("discountedTotal", discountedTotal);

        // 결과 페이지로 이동
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
