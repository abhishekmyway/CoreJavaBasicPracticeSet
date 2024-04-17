package com.abc;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet
{
   public void service(HttpServletRequest request,HttpServletResponse response)
          throws ServletException, IOException
   {
          PrintWriter out = response.getWriter();
          String name = request.getParameter("myname");
          out.println("Hello "+name);
          out.close();
   }
}
        
                                
