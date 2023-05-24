package com;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;



@WebServlet("/Dashboard")
public class Dashboard extends HttpServlet 
{
        private static final long serialVersionUID = 1L;

    public Dashboard() 
    {
        super();
    }


        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            
            String userId = request.getParameter("userid");
            if (userId == null ) {
                out.println("No UserId was found in the URL.<br>");
            } else {
                out.println("UserId obtained from URL Rewriting:" + userId + "<br>");
            }
            out.println("</body></html>");

        }

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                doGet(request, response);
        }

}


