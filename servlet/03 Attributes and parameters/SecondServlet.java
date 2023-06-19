package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class SecondServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int number1 = Integer.parseInt(req.getParameter("num1"));
		int number2 = Integer.parseInt(req.getParameter("num2"));
		int mul = number1*number2;
		
		int sum = (int)req.getAttribute("s");
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<h1> The sum of two numbers is: <h1>" + sum + 
				"<h1> And the product is: <h1>" + mul);
		
	}
         
}
