package com.abc.registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fn = request.getParameter("firstName");
		String ln = request.getParameter("lastName");
		String age = request.getParameter("age");
		String email = request.getParameter("email");
		String un = request.getParameter("userName");
		String pw = request.getParameter("password");
		String data[] = {fn,ln,age,email,un,pw};
		int insertionStatus = registerNewUser(data);
		PrintWriter out = response.getWriter();
		if(insertionStatus == 1){
			out.println("Registration Success");
		}
		else{
			out.println("Registration Failed");
		}
		out.close();
	}
	
	private int registerNewUser(String data[]){
		StringBuffer sql = new StringBuffer();
		sql.append("insert into users(first_name,");
		sql.append("last_name,age,email,username,password)");
		sql.append("values('"+data[0]+";");
		sql.append("'"+data[1]+"',");
		sql.append("'"+data[2]+"',");
		sql.append("'"+data[3]+"',");
		sql.append("'"+data[4]+"',");
		sql.append("'"+data[5]+"')");
		System.out.print("sql insert query : "+sql);
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		Connection con = null;
		Statement stmt = null;
		
		try{
			con = DriverManager.getConnection("jdbc:mysql://localhost/abc");
			stmt = con.createStatement();
			return stmt.executeUpdate(sql.toString());
		}
		catch(SQLException ex){
			ex.printStackTrace();
			return 0;
		}
		finally{
			try{
				if(stmt!=null){
					stmt.close();
					stmt = null;
				}
			}
			catch(SQLException e){
				System.out.println(e);
			}
			try{
				if(con!=null){
					con.close();
					con = null;
				}
			}
			catch(SQLException ex){
				ex.printStackTrace();
				return 0;
			}
		}	
	}
}