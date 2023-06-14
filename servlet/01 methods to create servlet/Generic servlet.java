package com.servelts;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


// In this technique, all other 4 methods are overridden hence need to edit only service method 
public class SecondProgram extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Generic servlet");
		res.setContentType("Text/html");
		PrintWriter out = res.getWriter();
		out.print(new Date().toString());
	}

}
