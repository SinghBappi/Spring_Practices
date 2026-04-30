package Testing;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
@WebServlet("/logout")
public class logout extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		HttpSession session = req.getSession();
		session.invalidate();
		
		RequestDispatcher rd = req.getRequestDispatcher("/login.html");
		rd.forward(req, res);
		
	}
}
