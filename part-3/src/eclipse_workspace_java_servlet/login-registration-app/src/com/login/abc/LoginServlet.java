package com.login.abc;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.*;

public class LoginServlet extends HttpServlet{
        public void service (HttpServletRequest request,HttpServletResponse response)
                             throws ServletException,IOException{
                String uid = request.getParameter("username");
                String pw = request.getParameter("password");
                //boolean loginStatus = false;
                //if("admin".equals(uid) && "abc".equals(pw)){
                //        loginStatus = true;
                //}

		boolean loginStatus = authenticateUser(uid,pw);
                PrintWriter out = response.getWriter();
                if(loginStatus){
                         out.println("login success");
                }
                else{
                        out.println("login failed");
                }
                out.close();
        }
	
	private boolean authenticateUser(String uid, String pw){
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		java.sql.Connection con=null;
		java.sql.Statement stmt=null;
		ResultSet rs=null; 
		try{
			con=DriverManager.getConnection("jdbc:mysql://localhost:3307/abc","root","admin123");
			stmt=con.createStatement();
			rs = stmt.executeQuery("select * from abc where username = '"+uid+"'and password = '"+pw+"';");
			return rs.next();
		}
		catch(SQLException e){
			e.printStackTrace();
			return false;
		}
		finally{
			try {
				if(rs!=null){
					rs.close();
					rs = null;
				}
			}
			catch(SQLException e){
				System.out.println(e);
			}
			try {
				if(stmt!=null){
					stmt.close();
					stmt = null;
				}
			}
			catch(SQLException e){
				System.out.println(e);
			}
			try {
				if(con!=null){
					con.close();
					con = null;
				}
			}
			catch(SQLException e){
				System.out.println(e);
			}
		}
	}	
}
        

