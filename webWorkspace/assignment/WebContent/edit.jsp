<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>✏️ 게시글 수정</title>
<style>
body {
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
	text-align: center;
	margin-bottom: 30px;
	color: #333;
}

form {
	display: flex;
	flex-direction: column;
	gap: 15px;
}

label {
	font-weight: bold;
}

input[type="text"], textarea {
	padding: 10px;
	font-size: 15px;
	border: 1px solid #ccc;
	border-radius: 5px;
	width: 100%;
}

textarea {
	resize: vertical;
	min-height: 200px;
}

input[readonly] {
	background-color: #eee;
}

.buttons {
	display: flex;
	justify-content: flex-end;
	gap: 10px;
	margin-top: 20px;
}

.buttons input, .buttons a {
	padding: 10px 18px;
	border: none;
	border-radius: 6px;
	font-weight: bold;
	cursor: pointer;
	text-decoration: none;
}

.submit-btn {
	background-color: #4a90e2;
	color: white;
}

.submit-btn:hover {
	background-color: #3b7dc4;
}

.cancel-btn {
	background-color: #ccc;
	color: #333;
}

.cancel-btn:hover {
	background-color: #bbb;
}
</style>
</head>
<body>
	<div class="container">
		<h2>✏️ 게시글 수정</h2>

		<form action="edit.do" method="post">
			<!-- 게시글 번호(hidden) -->
			<input type="hidden" name="num" value="<%="넘버"%>">

			<div>
				<label for="writer">작성자</label> <input type="text" id="writer"
					name="id" value="<%="아이디"%>" readonly>
			</div>

			<div>
				<label for="subject">제목</label> <input type="text" id="subject"
					name="sub" value="<%="제목"%>" required>
			</div>

			<div>
				<label for="content">내용</label>
				<textarea id="content" name="content" required><%="내용"%></textarea>
			</div>

			<div class="buttons">
				<input type="submit" class="submit-btn" value="수정 완료"> <a
					href="<%=request.getContextPath()%>/list" class="cancel-btn">취소</a>
			</div>
		</form>
	</div>
</body>
</html>
