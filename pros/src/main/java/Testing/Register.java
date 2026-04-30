package Testing;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/reform")
public class Register extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		
		
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		
		String myname = req.getParameter("name1");
		String mycity = req.getParameter("city1");
		String myemail = req.getParameter("email1");
		String mypass = req.getParameter("pass1");
		
		try {
			
			Connection con = Dbconnection.getConnection();
			
			
			String Insetion_Query ="Insert into rego values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(Insetion_Query);
			
			ps.setString(1, myname);
			ps.setString(2,myemail);
			ps.setString(3,mypass);
			ps.setString(4,mycity);
			
			
			int count = ps.executeUpdate();
			
			if(count>0) {
				out.println("<h3 style='color:green'>Registered Successfully ! </h3>");
				RequestDispatcher rd = req.getRequestDispatcher("/login.html");
				rd.include(req, res);
				
				
			}
			else {
				out.println("<h3 style='color:red'>User Not Registered May be Your Fault </h3>");
				RequestDispatcher rd = req.getRequestDispatcher("/registration.html");
				rd.include(req, res);
				
				
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
