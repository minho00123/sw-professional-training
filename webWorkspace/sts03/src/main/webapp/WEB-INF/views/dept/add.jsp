<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%@ include file="/WEB-INF/views/layouts/header.jspf"%>
<body>
	<c:forEach items="${errs }" var="err">
		<div class="alert alert-danger" role="alert">
			<button type="button" class="close" data-dismiss="alert"
				aria-label="Close">
				<span aria-hidden="true">&times;</span>
			</button>
			${err.defaultMessage}
		</div>
	</c:forEach>
	<%@ include file="/WEB-INF/views/layouts/menu.jspf"%>
	<h1>입력 페이지</h1>
	<form class="form-horizontal" action="add.do" method="post">
		<div class="form-group">
			<label for="deptno" class="col-sm-2 control-label">deptno</label>
			<div class="col-sm-10">
				<input class="form-control" name="deptno" id="deptno"
					placeholder="deptno">
			</div>
		</div>
		<div class="form-group">
			<label for="dname" class="col-sm-2 control-label">dname</label>
			<div class="col-sm-10">
				<input class="form-control" name="dname" id="dname"
					placeholder="dname">
			</div>
		</div>
		<div class="form-group">
			<label for="loc" class="col-sm-2 control-label">loc</label>
			<div class="col-sm-10">
				<input class="form-control" name="loc" id="loc"
					placeholder="location">
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-primary">입력</button>
				<button type="reset" class="btn btn-default">취소</button>
				<button type="button" class="btn btn-default"
					onclick="history.back();">뒤로</button>
			</div>
		</div>
	</form>
	<%@ include file="/WEB-INF/views/layouts/footer.jspf"%>
</body>
</html>