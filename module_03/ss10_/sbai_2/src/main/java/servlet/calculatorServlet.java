package servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "calculatorServlet", value = "/calculator")
public class calculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double firstOperand = Integer.parseInt(request.getParameter("first"));
        double secondOperand = Integer.parseInt(request.getParameter("second"));
        char operator =request.getParameter("operator").charAt(0);
        double result = Calculator.calculate(firstOperand, secondOperand, operator);
        request.setAttribute("first",firstOperand);
        request.setAttribute("second",secondOperand);
        request.setAttribute("result",result);
        request.getRequestDispatcher("index.jsp").forward(request,response);

    }
}
