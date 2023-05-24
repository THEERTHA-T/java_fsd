package com;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet 
{
        private static final long serialVersionUID = 1L;
 
    public LoginServlet() 
    {
        super();
    }

     
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                
                 String userId = request.getParameter("userid");
             response.sendRedirect("dashboard?userid=" + userId);  
                
        }

     
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                doGet(request, response);
        }

}
