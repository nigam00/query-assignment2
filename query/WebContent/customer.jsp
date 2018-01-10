<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="ADD8E6">
<h1>INSERT INTO DATABASE</h1>
<form name="f1" method="get" action="success.jsp">
EMPLOYEE ID:<input type="text" name="cid"/><br/> <br/>

EMPLOYEE NAME:<input type="text" name="cname"/><br/><br/>

EMPLOYEE ROLE:<input type="text" name="crole"/><br/><br/>

<input type="submit" name="SUBMIT"/>
</form>
<hr/>


<h1>SEARCH FROM DATABASE</h1>
<form name="f2" method="get" action="success1.jsp">
ENTER NAME:<input type="text" name="name1"><br/><br/>
<input type="submit" name="SUBMIT"/>
</form><hr/>
<h1>DELETE ENTRY BY NAME</h1>
<form name="f4" method="get" action="success3.jsp">
ENTER NAME:<input type="text" name="name2"><br/><br/>
<input type="submit" name="SUBMIT"/>
</form><hr/>
<h1>SHOW TABLE</h1>
<form name="f3" method="get" action="success2.jsp">
Click To see Table: <input type="submit" name="submit"/>
</form>
</body>
</html>