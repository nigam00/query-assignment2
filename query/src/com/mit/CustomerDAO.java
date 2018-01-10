package com.mit;
import java.sql.*;
public class CustomerDAO {
static Connection conn;
static PreparedStatement pst;

public static int insertCustomer(CustomerBean u) {
	int status=0;
	try {
		conn=ConnectionProvider.getCon();
		pst=conn.prepareStatement("insert into company values(?,?,?)");
		pst.setInt(1,u.getCid());
		pst.setString(2, u.getCname());
		pst.setString(3, u.getCrole());
		status=pst.executeUpdate();
		conn.close();
		
	}catch(Exception ex)
	{
		System.out.println(ex);
	}
	return status;
}
}
