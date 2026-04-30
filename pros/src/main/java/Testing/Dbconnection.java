package Testing;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnection {
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc_practice","root","bappi");
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return con;
		
	}

}
