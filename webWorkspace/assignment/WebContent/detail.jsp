<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><%="제목"%> - 게시판</title>
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

.content {
	font-size: 16px;
	line-height: 1.6;
	white-space: pre-wrap;
	color: #333;
	margin-bottom: 30px;
}

.btn-back {
	text-align: right;
}

.btn-back a {
	background-color: #4a90e2;
	color: white;
	padding: 10px 18px;
	border-radius: 6px;
	text-decoration: none;
	font-weight: bold;
}

.btn-back a:hover {
	background-color: #3b7dc4;
}
</style>
</head>
<body>
	<div class="container">
		<h2><%="제목"%></h2>

		<div class="info">
			작성자: <strong><%="아이디"%></strong> &nbsp;|&nbsp; 날짜:
			<%="날짜"%>
		</div>

		<div class="content">
			<%="내용"%>
		</div>

		<div class="btn-back">
			<a href="<%=request.getContextPath()%>/list">← 목록으로</a>
		</div>
	</div>
</body>
</html>
