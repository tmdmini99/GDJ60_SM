<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<c:import url="../template/common_css.jsp"></c:import>
<body>
<c:import url="../template/header.jsp"></c:import>
	
	<div class="container-fluid ">
		<div class="row col-md-7 mx-auto my-3">
			<h1 class="text-center mx-auto mb-5 border-bottom border-dark border-2 pb-2">게시글 추가</h1>
			
			<form action="./add" method="post" enctype="multipart/form-data">
				<div class="mb-3 row col-md-7 mx-auto" >
					<label for="id" class="form-label ">제목</label> 
					<input type="text" name="noticeTitle">
					
					
				</div>
				<div class="mb-3 row col-md-7 mx-auto" >
					<label for="pw" class="form-label">내용</label> 
					<input type="text" name="noticeContents">
					
					
				</div> 
				<div class="mb-3 row col-md-7 mx-auto" >
					<label for="pw1" class="form-label">작성자</label> 
					<input type="text" name="noticeWriter">
					
					
				</div>
				<div class="mb-3 row col-md-7 mx-auto" >
					<label for="name" class="form-label">이름</label> 
					<input type="text" name="noticeWriter">
					
					
				</div>
				<div class="mb-3 row col-md-7 mx-auto" >
					<label for="address" class="form-label">파일</label> 
					<input type="file" name="pic">
					
					
				</div>
				<button type="submit">등록</button>
			</form>
		</div>
	</div>
	
	
	<c:import url="../template/common_js.jsp"></c:import>
</body>
</html>