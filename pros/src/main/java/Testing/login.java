package Testing;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
@WebServlet("/login")
public class login extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		
		String myemail = req.getParameter("email1");
		String mypass = req.getParameter("pass1");
		
		
		
		try {
			
			Connection con = Dbconnection.getConnection();
			String Select_Query = "Select * from rego where email = ? and password = ?";
			PreparedStatement ps = con.prepareStatement(Select_Query);
			ps.setString(1, myemail);
			ps.setString(2,	mypass);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				User user = new User();
				user.setName(rs.getString("name"));
				user.setCity(rs.getString("city"));
				user.setEmail(rs.getString("email"));
				
				HttpSession session = req.getSession();
				session.setAttribute("session_user", user);
				
				
				RequestDispatcher rd = req.getRequestDispatcher("profile.jsp");
				rd.forward(req, res);
				
				
			}
			else {
				out.println("<h3 style='color:red'>Email id and password did not match</h3>");
				RequestDispatcher rd = req.getRequestDispatcher("/login.html");
				rd.include(req, res);
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
