<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	ad
	<form action="./add" method="post" enctype="multipart/form-data">
		제목 :<input type="text" name="noticeTitle">
		내용 :<input type="text" name="noticeContents">
		작성자 :<input type="text" name="noticeWriter">
		파일 : <input type="file" name="pic">
		<button type="submit">등록</button>
		
	
	</form>
</body>
</html>