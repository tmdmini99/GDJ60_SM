<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/common_css.jsp"></c:import>
</head>
<body>
<c:import url="../template/header.jsp"></c:import>
	<table class="table table-hover">
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>상세내용</th>
					<th>작성자</th>
					<th>작성시간</th>
					<th>조회수</th>
				</tr>
				</thead>
				<tbody class="table-group-divider">
					
					<tr>
						<td>${detail.noticeNum}</td>
						<td class="tb1_td td">${detail.noticeTitle}</td>
						<td class="tb1_td td1 td">${detail.noticeContents}</td>
						<td>${detail.noticeWriter}</td>
						<td>${detail.noticeRegDate}</td>
						<td>${detail.noticeHit}</td>
						</tr>
					
				</tbody>
			</table>
	<img alt="img x" src="../resources/notice/img/${detail.noticeImgDTO.fileName}">
	
	<a href="./update?noticeNum=${detail.noticeNum}">게시판 수정</a>
	<a href="./delete?noticeNum=${detail.noticeNum}">게시글 삭제</a>
	<c:import url="../template/common_js.jsp"></c:import>
</body>
</html>