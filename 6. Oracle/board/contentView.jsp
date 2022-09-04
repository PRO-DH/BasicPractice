<%@page import="com.jsp.board.BoardDTO"%>
<%@page import="com.jsp.board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<%
		String bId = request.getParameter("bId");
		BoardDAO dao = BoardDAO.getInstance();
		BoardDTO dto = dao.contentView(bId);
		
		request.setAttribute("content_view", dto);
	
	%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<	<table border="1">

		<tr>
			<td colspan="2" style="text-align: center">
			<a href="boardList.jsp">게시판 목록보기</a>
			</td>
		</tr>

		<tr>
			<th>게시판 번호</th>
			<td>${content_view.bId }</td>
		</tr>	
		
		<tr>
			<th>조회수</th>
			<td>${content_view.bHit }</td>
		</tr>
		
		<tr>
			<th>작성자</th>
			<td>${content_view.bName }</td>
		</tr>
			
		<tr>
			<th>제목</th>
			<td>${content_view.bTitle }</td>
		</tr>	
		
		<tr>
			<th>내용</th>
			<td>${content_view.bContent }</td>
		</tr>	
		

	
	</table>

	<form action ="modifyForm.jsp">
		<input type="hidden" name="bid" value="${content_view.bId }">
		<input type="hidden" name="bName" value="${content_view.bName }">
		<input type="hidden" name="bTitle" value="${content_view.bTitle }">
		<input type="hidden" name="bContent" value="${content_view.bContent }">
		<input type="hidden" name="bHit" value="${content_view.bHit }">
		
		<input type="submit" value="게시글 수정하기">
	</form>
	
	<br><br>
	
	<form action ="delete.jsp">
		<input type="hidden" name="bid" value="${content_view.bId }">
		<input type="submit" value="게시글 삭제하기">
	</form>

</body>
</html>
