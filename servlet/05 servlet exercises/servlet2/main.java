package com.servletexercises;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// This exercise is used to demonstrate the working of the two
// methods of RequestDispatcher which are forward() and include()

@WebServlet("/main")
public class main extends HttpServlet {
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   
		  PrintWriter o = response.getWriter();
		  String user = request.getParameter("id");
		  String password = request.getParameter("password");
		  
		  if(user.equals("abc") && password.equals("abc@123"))
		  {
			  RequestDispatcher rd;
			  rd = request.getRequestDispatcher("welcome");
			  rd.forward(request, response);
		  }
		  else
		  {
			  RequestDispatcher rd;
			  rd = request.getRequestDispatcher("/index.html");
			  rd.include(request,response);
			  o.println("<font color=red> Invalid username and password </font>");
		  }
	    
	}

}
