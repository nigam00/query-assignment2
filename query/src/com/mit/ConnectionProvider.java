package com.mit;
import java.sql.*;
public class ConnectionProvider{

	static Connection con;
	public static Connection getCon() {
		String username="postgres";
		String pwd="1234";
		String connURL="jdbc:postgresql://localhost:5432/postgres";
		try {
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection(connURL,username,pwd);
			
		}catch(Exception ex) {
			System.out.println("UNABLE TO ESTABLISH CONNECTION");
			//System.out.println(ex);
		}
		return con;
	}
}
