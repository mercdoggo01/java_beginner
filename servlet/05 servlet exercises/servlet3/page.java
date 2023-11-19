package com.servletexercises;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/page")
public class page extends HttpServlet 
{ 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		HttpSession session = request.getSession(false); //user already logged in 
		
		if(session!=null)
		{
			out.println("Welcome use: "+ request.getParameter("id"));
			out.println("Current session is: "+ session.getId());
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response);
			out.println("<font color=red> Invalid user id or password</font>");
		}
	}

}
