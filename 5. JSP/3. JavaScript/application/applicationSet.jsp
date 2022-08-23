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
	
		application.setAttribute("name", "홍길동");
		application.setAttribute("age", 20);
	%>
	
	<h2>어플리케이션이 생성되었습니다.</h2>

	<a href="applicationGet.jsp"> 어플리케이션 얻기 </a>
	

</body>
</html>
