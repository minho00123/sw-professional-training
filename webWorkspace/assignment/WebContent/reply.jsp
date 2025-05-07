<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<%@ page import="com.mvc.model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>✏️ 답글 작성</title>
<style>
body {
	font-family: 'Noto Sans KR', sans-serif;
	background-color: #f7f9fc;
}

.container {
	width: 80%;
	max-width: 800px;
	margin: 40px auto;
	background-color: #fff;
	box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
	border-radius: 10px;
	padding: 30px;
}

h2 {
	text-align: center;
	color: #333;
	margin-bottom: 20px;
}

form label {
	display: block;
	margin: 12px 0 6px;
	font-weight: bold;
}

form input[type="text"], form textarea {
	width: 100%;
	padding: 10px;
	border: 1px solid #ccc;
	border-radius: 6px;
	box-sizing: border-box;
	font-size: 14px;
}

form textarea {
	resize: vertical;
	height: 200px;
}

form .btns {
	margin-top: 20px;
	text-align: right;
}

form input[type="submit"], form a {
	background-color: #4a90e2;
	color: white;
	padding: 10px 16px;
	border: none;
	border-radius: 6px;
	text-decoration: none;
	cursor: pointer;
}

form a {
	margin-left: 10px;
}

form input[type="submit"]:hover, form a:hover {
	background-color: #3b7dc4;
}
</style>
</head>
<body>
	<%
		int groupId = Integer.parseInt(request.getParameter("groupId"));
		int orderInGroup = Integer.parseInt(request.getParameter("orderInGroup"));
		int depth = Integer.parseInt(request.getParameter("depth"));
	%>

	<div class="container">
		<h2>✏️ 답글 작성</h2>
		<form method="post" action="<%=request.getContextPath()%>/reply">
			<input type="hidden" name="groupId" value="<%=groupId%>">
			<input type="hidden" name="orderInGroup" value="<%=orderInGroup%>">
			<input type="hidden" name="depth" value="<%=depth%>">

			<label for="userId">작성자</label>
			<input type="text" name="userId" id="userId" required>
				
			<label for="title">제목</label>
			<input type="text" name="title" id="title" required>
			
			<label for="content">내용</label>
			<textarea name="content" id="content" required></textarea>


			<div class="btns">
				<input type="submit" value="답글 등록"> <a
					href="<%=request.getContextPath()%>/list">취소</a>
			</div>
		</form>
	</div>
</body>
</html>
