<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.DriverManager" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! 
    Connection connection;
    Statement statement;
    String driver = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    String uid = "c##human";
    String upw = "human";
    String query = "insert into member values(6, '추가해보기', 188.33, sysdate)";
%>
<%
try {
    Class.forName(driver);
    connection = DriverManager.getConnection(url, uid, upw);
    statement = connection.createStatement();
    statement.executeUpdate(query);
} catch (Exception e) {
    out.println(e.getMessage());
} finally {
    try {
        if (statement != null) {
            statement.close();
        }
        if (connection != null) {
            connection.close();
        }
    } catch (Exception e) {
        // Handle any cleanup errors here
    }
}
%>
새로운 데이터를 입력함
</body>
</html>
