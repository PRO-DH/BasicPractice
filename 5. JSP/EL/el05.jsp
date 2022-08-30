<%@page import="java.util.ArrayList"%>
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
		request.setAttribute("score", new int[]{100,200,300,400,500});
	%>
	
	배열 : ${requestScope.score[0] }<br>
	
	<%
		ArrayList<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("성춘향");
		list.add("이몽룡");
		list.add("이순신");
		
		request.setAttribute("names", list);
		//request 영역에 올린다.(바인딩)	
	%>
	
	ArrayList : ${requestScope.names[0] }<br>



</body>
</html>
