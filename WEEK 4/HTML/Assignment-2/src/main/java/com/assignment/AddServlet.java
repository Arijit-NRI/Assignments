package com.assignment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/show")
public class AddServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//
//		int result = i + j;
		
		if(req.getParameter("c1") != null)
		{
			PrintWriter out = res.getWriter();
			out.println("T&C accepted");
			out.println("name : "+req.getParameter("name"));
			out.println("email : "+req.getParameter("email"));
			out.println("address : "+req.getParameter("address"));
		}
		else
		{
			PrintWriter out = res.getWriter();
			out.println("T&C not accepted");
		}
	}
}
