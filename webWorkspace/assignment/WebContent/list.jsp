<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<%@ page import="java.util.List, com.mvc.model.*"%>
<!DOCTYPE html>
<html>
<head>
<title>📋 게시판</title>
<style>
body {
	background-color: #f7f9fc;
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
	color: #333;
}

table {
	width: 100%;
	border-collapse: collapse;
	margin-top: 20px;
}

a {
    text-decoration: none;
    color: #333;
    font-weight: bold;
}

a:hover {
    color: #4a90e2;
    transition: color 0.3s ease;
}

td a {
    display: inline-block;
    padding: 5px 10px;
    border-radius: 4px;
    transition: background-color 0.3s ease;
}

td a:hover {
    background-color: #e1ecf7;
}

th, td {
	padding: 14px 10px;
	text-align: center;
}

th {
	background-color: #4a90e2;
	color: white;
}

tr:nth-child(even) {
	background-color: #f1f5fa;
}

tr:hover {
	background-color: #e1ecf7;
	transition: 0.3s;
}

.write-btn, .search-box {
	margin-top: 20px;
	display: flex;
	justify-content: space-between;
}

.write-btn a {
	background-color: #4a90e2;
	color: white;
	padding: 10px 18px;
	border-radius: 6px;
	text-decoration: none;
}

.pagination {
	text-align: center;
	margin-top: 30px;
}

.pagination a {
	margin: 0 5px;
	padding: 8px 12px;
	text-decoration: none;
	background-color: #eee;
	color: #333;
	border-radius: 4px;
}

.pagination a.active {
	background-color: #4a90e2;
	color: white;
}

.pagination .arrow {
	font-size: 16px;
	font-weight: bold;
}

.pagination a.arrow:hover {
	background-color: #4a90e2;
	color: white;
}

.search-box input[type="text"] {
	padding: 8px;
	width: 200px;
	border-radius: 4px;
	border: 1px solid #ccc;
}

.search-box input[type="submit"] {
	padding: 8px 12px;
	background-color: #4a90e2;
	color: white;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}
</style>
</head>
<body>
	<div class="container">
		<h2>📋 게시판</h2>

		<div class="search-box">
			<form method="get" action="<%=request.getContextPath()%>/list">
				<input type="text" name="keyword"
					value="<%=request.getAttribute("keyword") != null ? request.getAttribute("keyword") : ""%>"
					placeholder="검색어 입력"> <input type="submit" value="검색">
			</form>
			<div class="write-btn">
				<a href="write">✏️ 글쓰기</a>
			</div>
		</div>

		<table>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
			</tr>
			<%
				List<BoardDto> boardList = (List<BoardDto>) request.getAttribute("boardList");
				int currentPage = (Integer) request.getAttribute("currentPage");
				int totalPages = (Integer) request.getAttribute("totalPages");
			%>
			<%
				for (BoardDto board : boardList) {
			%>
			<tr>
				<td><%=board.getId()%></td>
				<td style="text-align: left;">
					<a href="detail?id=<%=board.getId()%>">
						<%
							int depth = board.getDepth();
						
							for (int i = 0; i < depth; i++) {
								out.print("&nbsp;&nbsp;&nbsp;&nbsp;");
							}
							if (depth > 0) {
								out.print("↳ ");
							}
						%>
						<%=board.getTitle()%>
					</a>
				</td>
				<td><%=board.getUserId()%></td>
				<td><%=board.getCreatedAt()%></td>
			</tr>
			<%
				}
			%>
		</table>

		<div class="pagination">
			<%
				int prevPage = currentPage - 1 > 0 ? currentPage - 1: 1;
				int nextPage = currentPage + 1 <= totalPages ? currentPage + 1 : totalPages;
				
				int pageGroupSize = 10;
				int startPage = ((currentPage - 1) / pageGroupSize) * pageGroupSize + 1;
				int endPage = Math.min(startPage + pageGroupSize - 1, totalPages);
				
				int prevGroup = startPage - 1 > 0 ? startPage - 1 : 1;
				int nextGroup = endPage + 1 <= totalPages ? endPage + 1 : totalPages;
			%>
			
			<%
				if (startPage > 1) {
			%>
			<a class="arrow" href="?page=<%=prevGroup%>&keyword=<%=request.getParameter("keyword") != null ? request.getParameter("keyword") : ""%>">&lt;</a>
			<%
				}
			%>
			
			<%
				for (int i = startPage; i <= endPage; i++) {
					if (i == currentPage) {
			%>
			<a class="active" href="?page=<%=i%>&keyword=<%=request.getParameter("keyword") != null ? request.getParameter("keyword") : ""%>"><%=i%></a>
			<%
					} else {
			%>
			<a href="?page=<%=i%>&keyword=<%=request.getParameter("keyword") != null ? request.getParameter("keyword") : ""%>"><%=i%></a>
			<%
					}
				}
			%>
			
			<%
				if (endPage < totalPages) {
			%>
			<a class="arrow" href="?page=<%=nextGroup%>&keyword=<%=request.getParameter("keyword") != null ? request.getParameter("keyword") : ""%>">&gt;</a>
			<%
				}
			%>
		</div>
	</div>
</body>
</html>