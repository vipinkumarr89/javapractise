//package EdurekaHW.module8;
//
//import javax.servlet.*;
//import javax.servlet.http.*;
//import java.io.*;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.Connection;
//import java.sql.*;
//import java.sql.ResultSet;
//import java.sql.PreparedStatement;
//
//public class LoginServlet extends HttpServlet {
//    private static PreparedStatement pst=null;
//    public void init(ServletConfig config) throws ServletException {
//        super.init(config);
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Edureka","root","password");
//            pst = con.PreparedStatement("Select * from login where username=? and password=?");
//        }
//        catch(Exception e){e.printStackTrace();}
//    }
//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String uid = request.getParameter("uid");
//        String pwd = request.getParameter("pwd");
//        try{
//            pst.setString(1,uid);
//            pst.setString(2,pwd);
//            ResultSet rs = pst.executeQuery();
//            if(rs.next){
//                RequestDispatcher rd = request.getRequestDispatcher("/welcome");
//                rd.forward(request, response);
//            }
//            else{
//                PrintWriter out = response.getWriter();
//                out.println("<p style=text-align:center;font-size:18px;color:red> Invalid Username / Password</p>");
//                RequestDispatcher rd = request.getRequestDispatcher("/Login.html");
//                rd.include(request, response);
//            }
//        }
//        catch(Exception e){e.printStackTrace();}
//    }
//
//    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        doGet(request,response);
//    }
//}
