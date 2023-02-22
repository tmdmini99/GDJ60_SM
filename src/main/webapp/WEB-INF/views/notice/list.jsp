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
					<th>게시물</th>
					<th>작성자</th>
					<th>작성날짜</th>
					<th>조회수</th>
				</tr>
				</thead>
				<tbody class="table-group-divider">
					<c:forEach items="${list}" var="list">
					<tr>
						<td><a href="./detail?num=${list.num}">${list.title}</a></td>
						<td>${list.writer}</td>
						<td class="tb1_td td1 td">${list.regDate}</td>
						<td class="tb1_td td">${list.hit}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

	
	<div class="row">
				<nav aria-label="Page navigation example">
		 			<ul class="pagination">
			    		<li class="page-item ">
			      			<a class="page-link" href="./list?page" aria-label="Previous">
			        			<!-- 						==page=1 -->
			        			
			        			<span aria-hidden="true">&laquo;</span>
			      			</a>
			    		</li>
			    		<li class="page-item ${pager.before ? 'disabled' : ''}">
			      			<a class="page-link" href="./list?page=${pager.startNum-1}" aria-label="Previous">
			        			<span aria-hidden="true">&lsaquo;</span> <!--lsaquo는 꺽쇠 하나 laquo는 꺽쇠 두개  -->
			      			</a>
			    		</li>
			    		<c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
			    		<li class="page-item"><a class="page-link ${pager.page eq i ? 'active' : '' }" href="./list?page=${i}&kind=${pager.kind}&search=${pager.search}">${i}</a></li>
			    		</c:forEach>
			    		<!-- &gt = <꺽쇠를 표현 &lt는 >꺽쇠를 표현 -->
			    		<li class="page-item ${pager.after eq false ? 'disabled' : ''}"> <!--  -->
			      			<a class="page-link " href="./list?page=${pager.lastNum+1}"  aria-label="Next">
			        			<span aria-hidden="true">&rsaquo;</span>
			      			</a>
			    		</li>
			    		<li class="page-item "> <!--  -->
			      			<a class="page-link " href="./list?page=${pager.totalPage}"  aria-label="Next">
			        			<span aria-hidden="true">&raquo;</span>
			      			</a>
			    		</li>
		  			</ul>
				</nav>
		
			</div>
			<!-- 검색창 -->
			<form class="row g-3" action="./list" method="name">
				<div class="col-auto">
					<label for="kind" class="visually-hidden">Kind</label>
					<select class="form-select" name="kind" id="kind" aria-label="Default select example">
						<option value="title">제목</option>
						<option value="contents">컨텐츠</option>
						
					</select>
				</div>
				<div class="col-auto">
					<label for="Search" class="visually-hidden">Search</label>
					<input type="text" class="form-control" name="search" id="search" placeholder="검색어 입력">
				</div>
				<div class="col-auto">
					<button type="submit" class="btn btn-primary mb-3">검색</button>
				</div>
			</form>
	
	<a href="./add">상품 등록</a>
	
	<c:import url="../template/common_js.jsp"></c:import>
</body>
</html>