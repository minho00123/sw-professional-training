<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Refresh" content="1; URL=/web02/guest.jsp" />
<title>Insert title here</title>
</head>
<body>
	<%
		String idx = request.getParameter("idx");
		String sql = "DELETE FROM guest01 WHERE idx=" + idx;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:scott/tiger@172.30.1.22:1521:xe";
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url);
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if (result > 0) {
				out.print("<h1>삭제 성공</h1>");
			} else {
				out.print("<h1>삭제 실패</h1>");
			}
		} finally {
			if (stmt != null) {
				stmt.close();
			}
			
			if (conn != null) {
				conn.close();
			}
		}
	%>
</body>
</html>