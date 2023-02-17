<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	ㅎㅇ
	<c:forEach items="${list}" var="list">
	NoticeNum : ${list.noticeNum}<br>
	NoticeTitle :<a href="./detail?noticeNum=${list.noticeNum}">${list.noticeTitle}</a><br>
	NoticeContents :${list.noticeContents}<br>
	NoticeWriter :${list.noticeWriter}<br>
	NoticeRegDate :${list.noticeRegDate}<br>
	NoticeHit :${list.noticeHit}<br>
	
	</c:forEach>
	
	<a href="./add">상품 등록</a>
	
	
</body>
</html>