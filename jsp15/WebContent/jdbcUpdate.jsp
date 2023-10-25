<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.DriverManager" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! 
    Connection connection;
    Statement statement;
    ResultSet resultSet;
    String driver = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    String uid = "c##human";
    String upw = "human";
    String query = "update member set no=44 where name='ceb3'";
%>
<%
try{
	Class.forName(driver);
	connection = DriverManager.getConnection(url, uid, upw);
	statement = connection.createStatement();
	resultSet = statement.executeQuery(query);
} catch(Exception e){
	out.println(e.getMessage());
} finally{
	try{
		if(resultSet != null){resultSet.close();}
		if(statement != null){statement.close();}
		if(connection != null){connection.close();}
	} catch(Exception e){
		out.println(e.getMessage());
	}
}
%>
</body>
</html>