<%@page import="com.jsp.board.BoardDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.jsp.board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<%
		BoardDAO dao = BoardDAO.getInstance();
		ArrayList<BoardDTO> list = dao.boardList();
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>나의 게시판<</h1>
	<table border="1">
		<tr>
			<th>번호</th>
			<th>작성자</th>
			<th>제목</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
		<c:forEach var="dto" items="${list }">
			<tr>
				<td>${dto.bId }</td>
				<td>${dto.bName }</td>
				<td>
					<a href="contentView.jsp?bId=${dto.bId }">${dto.bTitle }</a>
				</td>
				<td>${dto.bTitle }</td>
				<td>${dto.bDate }</td>
				<td>${dto.bHit }</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="5">
				<a href="writeForm.jsp">글 작 성</a>
			</td>
		</tr>
	</table>

</body>
</html>
