<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>구구단 출력</h1>
	<!--  <table border="solid">
		<tr>
	// for (int i = 2; i <= 9; i++) {
			%>
			<th>
		// out.print(i + "단");				%>
			</th>
	}
			%>
		</tr>


for (int i = 1; i <= 9; i++) {
				out.print("<tr>");
				for (int j = 2; j <= 9; j++) {
					out.print("<td>" + j + "X" + i + "=" + j * i + "</td>");
				}
				out.print("</tr>");
			}
		%>

	</table> -->

	<table border="1" width="100%">
		<tr>
			<%
				for (int dan = 2; dan < 10; dan++) {
			%>
			<td><%=dan%>단</td>
			<%
				}
			%>
		</tr>
		<%
			for (int i = 1; i < 10; i++) {
		%>
		<tr>
			<%
				for (int dan = 2; dan < 10; dan++) {
			%>
			<td><%=dan%>x<%=i%> = <%=dan * i%></td>
			<%
				}
			%>
		</tr>
		<%
			}
		%>
	</table>

</body>
</html>