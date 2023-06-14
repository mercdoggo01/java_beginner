package com.servelts;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

// implementing servlet through interfacing 
// Step 1: select class name and select first option to get all 5 Servlet methods and override them
// Interface is an abstract class, Hence inside details are hidden


public class FirstProgram implements Servlet {
	
	ServletConfig con;

	// First three are life-cycle methods
	
	// 1.) This method is used to intialise the Servlet
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Calls the init method");
		con = config;
	}

	// 2.) This method is used to provide response in case of request provided by user
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Calls the service method");
		res.setContentType("Text/html");
		PrintWriter out = res.getWriter();
		out.println("Welcome to servlet");
		out.println("Today is "+ new Date().toString());
		System.out.println(getServletInfo());
		System.out.println(getServletConfig());
	}
	
	// 3.) Destroys servlet after use
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Calls the destroy method");
	}


	
	
	// These two are non life cycle methods
	
	// 4.) Returns object of servlet config
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return con;
	}
	
    // 5.) Returns info about version, copyright etc.
	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "My first program";
	}

}
