package com.mit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Customerret1 {
	static Connection conn;
	static PreparedStatement pst;
	static ResultSet res;
	public static  ResultSet selectCustomer() {
		ResultSet status=null;
		try {
			conn=ConnectionProvider.getCon();
			pst=conn.prepareStatement("select * from company");
			status=pst.executeQuery();
			conn.close();
			
		}catch(Exception ex)
		{
			System.out.println(ex);
		}
		return status;

}
}

