package com.registration.Dao;

import java.sql.*;

import com.registration.model.Employee;

public class EmployeeDao {
	public int registerEmployee(Employee employee) throws ClassNotFoundException {
		int result = 0;
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:49161/xe", "system", "oracle");

			String insertEmpSql = "INSERT INTO EMPLOYEE22 (ID, FIRST_NAME, LAST_NAME, USERNAME, PASSWORD, ADDRESS, CONTACT) VALUES (?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement psmt = con.prepareStatement(insertEmpSql);
			psmt.setInt(1, 102);
			psmt.setString(2, employee.getFirstname());
			psmt.setString(3, employee.getLastname());
			psmt.setString(4, employee.getUsername());
			psmt.setString(5, employee.getPassword());
			psmt.setString(6, employee.getAddress());
			psmt.setString(7, employee.getContact());
			result = psmt.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
