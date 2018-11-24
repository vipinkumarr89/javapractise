import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uid = request.getParameter("uid");
		String pwd = request.getParameter("pwd");
		if(uid.equals("vipin") && pwd.equals("password")){
				RequestDispatcher rd = request.getRequestDispatcher("/welcome");
				rd.forward(request, response);
			}
			else{
				PrintWriter out = response.getWriter();
				out.println("<p style=text-align:center;font-size:18px;color:red> Invalid Username / Password</p>");
				RequestDispatcher rd = request.getRequestDispatcher("/index.html");
				rd.include(request, response);
			}
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doGet(request,response);
	}
}
