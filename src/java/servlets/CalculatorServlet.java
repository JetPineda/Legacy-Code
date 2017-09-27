/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import domainClasses.calculator;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 686623
 */
public class CalculatorServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/calculator.jsp").forward(request, response);
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String firstNum = request.getParameter("num1");
        String secondNum = request.getParameter("num2");
        String operator = request.getParameter("operator");
        
        
        calculator calc = new calculator();
        int result = calc.calculate(firstNum, secondNum, operator);
        
       request.setAttribute("result", "RESULT: " + result);
      getServletContext().getRequestDispatcher("/WEB-INF/calculator.jsp").forward(request, response);
        
        
        
        
        
        
        
        
        
 
    }

    
}
