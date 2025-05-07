<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<%@ page import="com.mvc.model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>📋 수정 게시판</title>
<link
	href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR&display=swap"
	rel="stylesheet">
<style>
body {
	font-family: 'Noto Sans KR', sans-serif;
	background-color: #f7f9fc;
	margin: 0;
	padding: 0;
}

.container {
	width: 80%;
	max-width: 900px;
	margin: 40px auto;
	background-color: #fff;
	box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
	border-radius: 10px;
	padding: 30px;
}

h2 {
	margin-bottom: 20px;
	color: #333;
	border-bottom: 2px solid #4a90e2;
	padding-bottom: 10px;
}

.info {
	color: #777;
	font-size: 14px;
	margin-bottom: 20px;
}

textarea,
input[type="text"] {
	width: 100%;
	height: 40px;
	padding: 10px;
	margin: 10px 0;
	border: 1px solid #ccc;
	border-radius: 5px;
}

textarea {
	height: 150px;
}

.btn-group {
	text-align: right;
}

.btn-group button,
.btn-group a {
	background-color: #4a90e2;
	color: white;
	padding: 10px 18px;
	border-radius: 6px;
	text-decoration: none;
	font-weight: bold;
	margin-left: 10px;
}

.btn-group button:hover,
.btn-group a:hover {
	background-color: #3b7dc4;
}
</style>
</head>
<body>
	<%
		BoardDto bean = (BoardDto) request.getAttribute("bean");
	%>
	<div class="container">
		<h2>게시글 수정</h2>

		<div class="info">
			작성자: <strong><%=bean.getUserId()%></strong> &nbsp;|&nbsp; 날짜:
			<%=bean.getCreatedAt()%>
		</div>

		<form action="<%=request.getContextPath()%>/modify" method="POST">
			<input type="hidden" name="id" value="<%=bean.getId()%>">
			
			<label for="title">제목</label>
			<input type="text" name="title" id="title" value="<%=bean.getTitle()%>" required>

			<label for="content">내용</label>
			<textarea name="content" id="content" required><%=bean.getContent()%></textarea>

			<div class="btn-group">
				<button type="submit">✏️ 수정 완료</button>
				<a href="<%=request.getContextPath()%>/detail?id=<%=bean.getId()%>">← 취소</a>
			</div>
		</form>

	</div>
</body>
</html>
