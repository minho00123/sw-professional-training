<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="ex08.jsp" method="get">
		id:<input type="text" name="id"><br>
		pw:<input type="text" name="pw"><br>
		<select name="sel" size="4" multiple="multiple">
			<option value="val1">item1</option>
			<option value="val2">item2</option>
			<option value="val3">item3</option>
			<option value="val4">item4</option>
		</select><br>
		<input type="checkbox" name="ck" value="ck1">item1
		<input type="checkbox" name="ck" value="ck2">item1
		<input type="checkbox" name="ck" value="ck3">item3<br>
		<input type="radio" name="ra" value="i1">item1
		<input type="radio" name="ra" value="i2">item1
		<input type="radio" name="ra" value="i3">item3<br>
		<input type="submit"> <br>
	</form>
	<br>
	<a href="ex08.jsp?id=abcd&pw=1234">go</a>
</body>
</html>