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
        String Product_Description =req.getParameter("Product-Description");
        double List_Price = Double.parseDouble(req.getParameter("List-Price"));
        double Discount_Percent = Double.parseDouble(req.getParameter("Discount-Percent"));
        double Discount_Amount =List_Price * Discount_Percent * 0.01;
        double Discount_Price =List_Price-Discount_Amount;
        req.setAttribute("Product_Description",Product_Description);
        req.setAttribute("List_Price",List_Price);
        req.setAttribute("Discount_Percent",Discount_Percent);
        req.setAttribute("Discount_Amount",Discount_Amount);
        req.setAttribute("Discount_Price",Discount_Price);
        RequestDispatcher requestDispatcher= req.getRequestDispatcher("display-discount.jsp");
        requestDispatcher.forward(req,resp);
    }


}