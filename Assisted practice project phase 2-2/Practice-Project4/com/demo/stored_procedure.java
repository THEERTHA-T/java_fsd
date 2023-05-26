package com.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet("/list")
public class stored_procedure extends HttpServlet
{
	private static final long serialVersionUID = 1L;
 
    public stored_procedure()
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		CallableStatement callable=null;
		try
		{
			// LOAD THE JDBC DRIVER
						Class.forName("com.mysql.jdbc.Driver");
						
						// STEP 2 GET THE CONNECTION TO THE DATABSE
						con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "root123");
						 if(con != null)
						 {	
							out.println("DATABASE CONNECTION ESTABLISHED!!");

							 callable=con.prepareCall("{call add_product('new product',90000)}");
							 ResultSet result=callable.executeQuery();
							 out.println("SUCCESSFULLY UPDATED STORED PROCEDURE");

						 }
						 
		}
		catch(ClassNotFoundException | SQLException e)
			{

				out.println("DATABASE CONNECTION NOT ESTABLISHED!!");
			}
	}

}
