package com;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;



@WebServlet("/Dashboard")
public class Dashboard extends HttpServlet {
        private static final long serialVersionUID = 1L;
       
  
    public Dashboard() 
    {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
            Cookie cookie = null;
            Cookie[] cookies = null;
            boolean found = false;
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            
            cookies = request.getCookies();
            if (cookies != null) {
                    for (int i = 0; i < cookies.length; i++) {
                    cookie = cookies[i];
                    if (cookie.getName().contentEquals("userid") && cookie.getValue() != null) {
                        out.println("UserId read from cookie:" + cookie.getValue() + "<br>");
                        found = true;
                    }
                 }
            }
            if (!found) 
            {
                out.println("No UserId was found in cookie.<br>");
            }
            out.println("</body></html>");

        }

        /**
         * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                doGet(request, response);
        }
}

