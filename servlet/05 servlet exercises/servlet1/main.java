package com.servletexercises;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// annotation (comment out annotation to use xml based deployment descriptor
// @WebServlet("/main")


// This exercise is to demonstrate the use of doGet() and doPost() methods in Java servlet
public class main extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
	// will display data in the url
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter o = response.getWriter();
		o.println("First name is: "+ request.getParameter("firstname"));
		o.println("Last name is: "+ request.getParameter("lastname"));
		o.close();
	}

    // will not display data in the url
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter o = response.getWriter();
		o.println("First name is: "+ request.getParameter("firstname"));
		o.println("Last name is: "+ request.getParameter("lastname"));
		o.close();
	}

}
