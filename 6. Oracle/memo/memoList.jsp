<%@page import="com.jsp.memo.MemoDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.jsp.memo.MemoDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table, th, td{
		border : 1px solid black;
		border-collapse : collapse;
		margin : 0 auto;
	}
	table{
		width : 700px;
	}
	td, th {
		text-align : center;
		vertical-align : middle;
		height : 100px;
	}
</style>
</head>
<body>

	<h1 style="text-align:center">나의 메모장</h1>
	
	<table>
		<tr>
			<th>닉네임</th>
			<th>메모</th>
			<th>메모 작성일</th>
			<th>삭제</th>
		</tr>
		<%
			//DAO, DTO 객체 받기
			MemoDAO dao = MemoDAO.getInstance();
			ArrayList<MemoDTO> list = dao.memoList();
			
			for(int i = 0; i < list.size() ; i++){
				MemoDTO dto = list.get(i);
		%>
		<tr>
			<td><%=dto.getNickName()%></td>
			<td><%=dto.getContents()%></td>
			<td><%=dto.getRegTime()%></td>
			<td><a href="memoDelete.jsp?memoId=<%=dto.getMemoId()%>">삭제<</a></td>
		</tr>
		<% 
		} 
		%>
	</table>

	
	<h3 style="text-align:center"><a href="memoForm.jsp">메모작성</a></h3>
	
	
	

</body>
</html>
