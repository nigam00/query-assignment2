package com.mit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Customerret {
	static Connection conn;
	static PreparedStatement pst;
	static ResultSet res;
	public static  ResultSet selectCustomer(String u) {
		ResultSet status=null;
		try {
			conn=ConnectionProvider.getCon();
			System.out.println(u);
			pst=conn.prepareStatement("select * from company where cname='"+u+"'");
//			pst.setString(1, u.getCname());
			status=pst.executeQuery();
			conn.close();
			
		}catch(Exception ex)
		{
			System.out.println(ex);
		}
		return status;

}
}

