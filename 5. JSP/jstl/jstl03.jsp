<%@page import="java.util.ArrayList"%>
<%@page import="com.jsp.el.MemberEL"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
	ArrayList<MemberEL> list = new ArrayList<>();
	list.add(new MemberEL("hong","1234","홍길동",20));
	list.add(new MemberEL("sung","1111","성춘향",22));
	list.add(new MemberEL("mong","2222","이몽룡",23));
	list.add(new MemberEL("jang","3333","장보고",24));
	list.add(new MemberEL("lee","4444","이순신",25));
	request.setAttribute("member",list);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%--
		table 태그와 jstl forEach, EL로 ArrayList 안에 있는 MemeberEL 객체들의
		아이디, 비밀번호, 이름, 나이를 웹브라우저에 출력하기
	 --%>
	 
	 <table>
	 	<tr>
		 	<th>아이디</th>
		 	<th>비밀번호</th>
		 	<th>이름</th>
		 	<th>나이</th>
		 </tr>
		 
		 <c:forEach var="member" items="${member }">
		 	<tr>
		 		<td>${member.id }</td>
		 		<td>${member.pw }</td>
		 		<td>${member.name }</td>
				<td>${member.age }</td>
			</tr>
		 </c:forEach>
		
	 </table>

	

</body>
</html>
