<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	de<br>
	${detail.noticeNum}<br>
	${detail.noticeTitle}<br>
	${detail.noticeContents}<br>
	${detail.noticeWriter}<br>
	${detail.noticeRegDate}<br>
	${detail.noticeHit}<br>
	
	<img alt="img x" src="../resources/notice/img/${detail.noticeImgDTO.fileName}">
	
	<a href="./update?noticeNum=${detail.noticeNum}">게시판 수정</a>
	<a href="./delete?noticeNum=${detail.noticeNum}">게시글 삭제</a>
</body>
</html>