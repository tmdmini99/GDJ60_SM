<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	up
	<form action="./update" method="post">
		
		
		번호 :<input type="text" name="noticeNum" value="${update.noticeNum}" readonly>
		제목 :<input type="text" name="noticeTitle" value="${update.noticeTitle}">
		내용 :<input type="text" name="noticeContents" value="${update.noticeContents}">
		작성자 :<input type="text" name="noticeWriter" value="${update.noticeWriter}">
		조회수 : <input type="text" name="noticeHit" value="${update.noticeHit}">
		<button type="submit">등록</button>
		
	
	</form>
</body>
</html>