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
	private static PreparedStatement pst=null;
	Connection con = null;
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		try{
	        Connection con = ConnectionFactory.getDBConnection();
			System.out.println("inside login Servlet -> init -> try block");
			pst = con.prepareStatement("Select * from login where username=? and password=?");			
		}
		catch(Exception e){e.printStackTrace();}
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside login Servlet -> doGet ");
		String uid = request.getParameter("uid");
		String pwd = request.getParameter("pwd");
		try{
			System.out.println("inside login Servlet -> doGet -> try block ");
			pst.setString(1,uid);
			System.out.println("inside login Servlet -> doGet -> try block -> uid processed");
			pst.setString(2,pwd);
			System.out.println("inside login Servlet -> doGet -> try block -> pwd processed");

			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				System.out.println("inside login Servlet -> doGet -> try block -> username/passwd matched -> moving to welcome Servlet");

				RequestDispatcher rd = request.getRequestDispatcher("/welcome");
				rd.forward(request, response);
				System.out.println("inside login Servlet -> doGet -> try block -> username/passwd matched -> moving to welcome Servlet -> forwarded to welcome Servlet");
			}
			else{
				PrintWriter out = response.getWriter();
				out.println("<p style=text-align:center;font-size:18px;color:red> Invalid Username / Password</p>");
				System.out.println("inside login Servlet -> doGet -> try block -> username/passwd match failed -> moving to index.html");
				RequestDispatcher rd = request.getRequestDispatcher("/index.html");
				rd.include(request, response);
			}
		}
		catch(Exception e){e.printStackTrace();
		System.out.println("inside login Servlet -> doGet -> catch block");
}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("inside login Servlet -> doPost");
	doGet(request,response);
	}
}
