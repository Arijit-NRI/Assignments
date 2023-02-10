package com.registration.Dao;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CreateDB")
public class CreateDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:49161/xe", "system", "oracle");
			
			Statement smt = con.createStatement();
			smt.executeUpdate("CREATE TABLE Employee22(ID NUMBER(5) NOT NULL, FIRST_NAME VARCHAR2(20), "
					+ "LAST_NAME VARCHAR2(20), USERNAME VARCHAR2(20), PASSWORD VARCHAR2(20), "
					+ "ADDRESS VARCHAR2(20), CONTACT VARCHAR2(20))");
			response.getWriter().append("/nTable created successfully");
		}
		catch (Exception e) {
			response.getWriter().append(e.getMessage());
		}
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
