package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class FirstServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		// Parsing values obtained from form from String to Integer
		int number1 = Integer.parseInt(req.getParameter("num1"));
		int number2 = Integer.parseInt(req.getParameter("num2"));
		int sum = number1+number2;
		System.out.println(sum);
        
		req.setAttribute("s", sum);
		
		RequestDispatcher rd;
		rd = req.getRequestDispatcher("/servlet2");
		rd.forward(req, res);
		
	}
	
       
}
