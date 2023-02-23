<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="./add" method="post" enctype="multipart/form-data">

<input type="text" name="title">
<input type="text" name="contents">
<input type="text" name="writer">


<input type="file" name="pic">
<button type="submit">전송</button>
</form>
</body>
</html>