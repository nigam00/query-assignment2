package com.mit;

import java.sql.Connection;
import java.sql.PreparedStatement;
public class Customerret2 {
	static Connection conn;
	static PreparedStatement pst;
	//static ResultSet res;
	public static  int selectCustomer(String u) {
		int status=0;
		try {
			conn=ConnectionProvider.getCon();
			System.out.println(u);
			pst=conn.prepareStatement("delete from company where cname='"+u+"'");
//			pst.setString(1, u.getCname());
			status=pst.executeUpdate();
			conn.close();
			
		}catch(Exception ex)
		{
			System.out.println(ex);
		}
		return status;

}
}

