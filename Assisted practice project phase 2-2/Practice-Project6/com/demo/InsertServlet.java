package com.demo;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


import com.demo.InitServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/insert")

public class InsertServlet extends HttpServlet 
{
        private static final long serialVersionUID = 1L;
       
   
    public InsertServlet() 
    {
        super();
    }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
        {
                
                try {
                         PrintWriter out = response.getWriter();
                         out.println("<html><body>");
                         
                        InputStream in = getServletContext().getResourceAsStream("/WEB-INF/config.properties");
                        Properties props = new Properties();
                        props.load(in);
                        
                        
                        InitServlet conn = new InitServlet(props.getProperty("url"), props.getProperty("userid"), props.getProperty("password"));
                        PreparedStatement stmt = conn.getConnection().prepareStatement("INSERT INTO eproduct(name,price) values (?,?)");
                        stmt.setString(1, "DELL Y78");
                        stmt.setDouble(2, 27000.60);
                        int count=stmt.executeUpdate();
                        out.println("Sucessfully inserted "+count+" records into the table");
                        
                       ResultSet rs = stmt.executeQuery("select * from eproduct");  
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
                        stmt.close();
                        
                        conn.closeConnection();
                        
                        
                        out.println("</body></html>");
                        conn.closeConnection();
                        
                } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                } catch (SQLException e) {
                        e.printStackTrace();
                }
        }

      
}
