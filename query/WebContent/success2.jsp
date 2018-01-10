<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.mit.*"%>
     <%@page import="java.sql.ResultSet"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj" class="com.mit.CustomerBean"/>
<jsp:setProperty property="*" name="obj"/>
<table align="center" cellpadding="10" cellspacing="10" border="10">
<tr>

</tr>
<tr bgcolor="#ADD8E6">
<td><b>EMPLOYEE ID</b></td>
<td><b>EMPLOYEE NAME</b></td>
<td><b>EMPLOYEE ROLE</b></td>
</tr>
<%
ResultSet resultSet = Customerret1.selectCustomer();
while(resultSet.next()){
%>
<tr bgcolor="#D3D3D3">

<td><%=resultSet.getInt("cid") %></td>
<td><%=resultSet.getString("cname") %></td>
<td><%=resultSet.getString("crole") %></td>
</tr>

<% 
}
%>
</table>

</body>
</html>