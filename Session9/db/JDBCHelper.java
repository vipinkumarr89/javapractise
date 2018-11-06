package Session9.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Session9.model.Student;

public class JDBCHelper {
	
	Connection con;
	
	Statement stmt;
	PreparedStatement pStmt;
	
	CallableStatement cStmt;
	
	//1. Load the Driver
	public JDBCHelper() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("--Driver Loaded--");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
	}
	
	// 2. Create Connection
	public void createConnection(){
		
		try {
		
			String user = "root";
			String password = "";
			String url = "jdbc:mysql://localhost/edureka"; 
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println("--Connection Created--");			
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	//3. Write and Execute SQL Statement
	public void insertStudent(Student sRef){
		
		try {
			
			String sql = "insert into Student values(null,'"+sRef.name+"','"+sRef.email+"',"+sRef.age+",'"+sRef.address+"')";
			
			stmt = con.createStatement();
			int i = stmt.executeUpdate(sql);
			System.out.println("Student inserted: "+i);		
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
	}
	
	//4. Close the Connection
	public void closeConnection(){
		try {
			if(stmt!=null)
				stmt.close();
			
			if(con!=null)
				con.close();
			
			if(pStmt!=null)
				pStmt.close();
			
			System.out.println("--Connection Closed--");		
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}

}
