<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		request.setCharacterEncoding("UTF-8");
	%>
	
	<h2>게시글 수정</h2>

	<form action="modifyCheck.jsp" method="post">
		
		<input type="hidden" name="bId" value="${param.bId }">
	
		<table border="1">
		
			<tr>
				<th>게시판 번호</th>
				<td>${param.bId }</td>
			</tr>
		
			<tr>
				<th>조회수</th>
				<td>${param.bHit }</td>
			</tr>
			
			<tr>
				<th>작성자</th>
				<td>
					<input type="text" name="bName" value="${param.bName }">
				</td>
			</tr>
				
			<tr>
				<th>제목</th>
				<td>
					<input type="text" name="bTitle" value="${param.bTitle }">
				</td>
			</tr>	
			
			<tr>
				<th>내용</th>
				<td>
					<input type="text" name="bContent" value="${param.bContent }">
				</td>
			</tr>	
			
			<tr>
				<td colspan="2">
					<input type="submit" value="게시글 수정하기">
				</td>
			</tr>
		</table>
	</form>

</body>
</html>
