package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet")
public class Login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String email = req.getParameter("user_email");
		String password = req.getParameter("user_password");
		
		//Making cookies
		Cookie ck = new Cookie("ema",email);
		Cookie ck1 = new Cookie("psswd",password);
		
		res.addCookie(ck);
		res.addCookie(ck1);
		
		res.sendRedirect("profile");
	}
	

}
