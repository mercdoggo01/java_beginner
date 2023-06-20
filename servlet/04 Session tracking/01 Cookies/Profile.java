package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;


@WebServlet("/profile")
public class Profile extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cookie ck[]= req.getCookies();
		if(ck==null)
		{
			resp.sendRedirect("index.html");
		}
		else
		{
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			out.print("<h1> Welcome user: "+ ck[0].getValue()+"</h1>");
			out.print("<h1> Your password is: "+ ck[1].getValue()+"</h1>");
			out.print("<h1> <a href='logout'>Logout</a>");
		}
		
	}
    
}
