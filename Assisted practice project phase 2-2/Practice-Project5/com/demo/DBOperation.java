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
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet("/init")
public class DBOperation extends HttpServlet
{
	private static final long serialVersionUID = 1L;
 
    public DBOperation()
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try
		{
			// LOAD THE JDBC DRIVER
			Class.forName("com.mysql.jdbc.Driver");
			
			// STEP 2 GET THE CONNECTION TO THE DATABSE
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "root123");
			 if(con != null)
			 {	              
				 out.println("<html><body>");
	              out.println("<h5>DATABASE CONNECTION ESTABLISHED!!</h5>");
	              
	              stmt =  con.createStatement();  
	              rs = stmt.executeQuery("select * from eproduct");  
	              out.println("<h4>DISPLAY TABLE IN DATABASE</h4>");
	              out.println("<table cellspacing=5 cellpadding=1 border=1>");  
	              out.println("<tr><th>ProductID</th><th>Product Name</th><th>Price</th><th>Date</th><tr>");  
	             
	              while (rs.next()) 
	              {  
	                  int n = rs.getInt("ID");  
	                  String nm = rs.getString("name");  
	                  int s = rs.getInt("price");   
	                  Date d=rs.getDate("date_added");
	                 
	                  out.println("<tr><td>" + n + "</td><td>" + nm + "</td><td>" + s + "</td><td>"+d+"</td></tr>");   	     
	               }  
	                  out.println("</body></html>");
	                 
	                }
				 else
					 {
								out.println("DATABASE CONNECTION NOT ESTABLISHED!!");
					 }
			 con.close(); 
             
			
		}
		catch(ClassNotFoundException | SQLException e)
			{

			}
		
		
	}

}
