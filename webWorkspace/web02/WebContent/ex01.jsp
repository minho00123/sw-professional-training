<%@ page language="java"%>
<%@ page import="java.util.Date"%>
<%@ page contentType="text/plain; charset=UTF-8" pageEncoding="UTF-8"%>
<!--  디렉티브(Directive) - 클래스 밖 -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/plain">
<title>Insert title here</title>
</head>
<body>
	<h1>jsp의 문법 구조</h1>
	<%!// 선언부(Declaration) - class 안 메서드 밖 (필드, 메서드, 생성자, 클래스가 올 수 있다.)
	int su1 = 1111;

	public void func() {
	}

	class Inner {
	}%>
	<p>
		<%
			// 스크립트릿 - main 메서드 안쪽
			System.out.println(new Date());
		%>
	</p>

	<%
		// 스크립트릿 - main 메서드 안쪽
		System.out.println(new Date());
	%>

</body>
</html>

<%
	// 스크립트릿 - main 메서드 안쪽
	System.out.println(new Date());
%>