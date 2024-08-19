<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 작성</title>
</head>

<body>
	<h1>새글쓰기</h1>
	
	<form action="/board/save/" method="post"> 
		<div class="form-group">
			<label for="id">닉네임</label>
			<input type="text" class="form-control" placeholder="닉네임 입력" id="name" name="name" maxlength="20" >
		</div>
		<div class="form-group">
			<label for="title">제목</label>
			<input type="text" class="form-control" placeholder="제목 입력" id="title" name="title" maxlength="20">
		</div>
		<div class="form-group">
			<label for="content">내용</label>
			<input type="text" class="form-control" placeholder="내용 입력" id="content" name="content" maxlength="20" >
		</div>		
		
		<div class="btn--area">
			<button type="submit" class="btn--up">글 올리기</button>
		</div>
		
	</form>
	
</body>
</html>