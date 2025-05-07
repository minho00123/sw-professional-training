<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="${pageContext.request.contextPath}/index">home</a>
	<a href="${pageContext.request.contextPath}/intro">intro</a>
	<a href="${pageContext.request.contextPath}/bbs/list">bbs</a>
	<a href="${pageContext.request.contextPath}/login/login">login</a>
	<hr />
	<h1>login page</h1>
	<form action="login" method="post">
		<div>
			<label>id</label><input name="id"/>
		</div>
		<div>
			<label>pw</label><input name="pw"/>
		</div>
		<div>
			<button>로그인</button>
		</div>
	</form>
</body>
</html>