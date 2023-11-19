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

// servlet session management

@WebServlet("/main")
public class main extends HttpServlet 
{
	private final String userID = "abc";
	private final String passwordUnique = "abc@123";
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   
		PrintWriter out = response.getWriter();
		String user = request.getParameter("id");
		String password = request.getParameter("password");
		
		if(user.equals(userID) && password.equals(passwordUnique))
		{
			/*IHttp session is used for session
			 * The container uses this id to identify the particular user
			 * getSession()  --> Retuns current associated session or creates an new one if none found
			 * setAttribute() is used to set id to session
			 * setMaxInactiveInterval() --> used to set max inactive time
			 * 
 			 * */
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			session.setMaxInactiveInterval(120);
			RequestDispatcher rd = request.getRequestDispatcher("page");
			rd.forward(request, response);
			
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response);
			out.println("<font color=red> Invalid user id or password</font>");
		}
		
	}

}
