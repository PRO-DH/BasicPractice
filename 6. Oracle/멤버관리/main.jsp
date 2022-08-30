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
		if(session.getAttribute("id") == null ||
		session.getAttribute("name") == null){
	%>
		<jsp:forward page="login.jsp"/>
	<%
		}
		String id = (String)session.getAttribute("id");
		String name = (String)session.getAttribute("name");
	%>
	
	<h1><%=name %>님 안녕하세요~!</h1>
	<a href="Logout.jsp">로그아웃</a>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="modify.jsp">회원 정보수정</a>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="delete.jsp">회원 탈퇴</a>


</body>
</html>
