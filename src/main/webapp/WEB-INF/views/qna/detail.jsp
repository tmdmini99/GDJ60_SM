<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/common_css.jsp"></c:import>
</head>
<body>
<c:import url="../template/header.jsp"></c:import>

<c:import url="../template/common_js.jsp"></c:import>

${detail.num}
${detail.title}
${detail.contents}
${detail.writer}
${detail.regDate}
${detail.hit}
${detail.ref}
${detail.step}
${detail.depth}
<img alt="img x" src="../resources/qna/img/${detail.qnaImgDTO.fileName}">

</body>
</html>