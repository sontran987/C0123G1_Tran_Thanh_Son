package com.example.bai_1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;



@WebServlet(name = "helloServlet", urlPatterns = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String productDescription =req.getParameter("Product-Description");
        double listPrice = Double.parseDouble(req.getParameter("List-Price"));
        double discountPercent = Double.parseDouble(req.getParameter("Discount-Percent"));
        double discountAmount =listPrice * discountPercent * 0.01;
        double discountPrice =listPrice-discountAmount;
        req.setAttribute("Product_Description",productDescription);
        req.setAttribute("List_Price",listPrice);
        req.setAttribute("Discount_Percent",discountPercent);
        req.setAttribute("Discount_Amount",discountAmount);
        req.setAttribute("Discount_Price",discountPrice);
        RequestDispatcher requestDispatcher= req.getRequestDispatcher("display-discount.jsp");
        requestDispatcher.forward(req,resp);
    }


}