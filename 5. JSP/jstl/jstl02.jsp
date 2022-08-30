<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--
		choose는 자바의 if-else문과 비슷한 역할을 한다.
			if = choose
			else if = when 태그
			else =  otherwise
	 --%>

	<c:set var="i" value="20" />
	<c:choose>
		<c:when test="${i == 10 }">
			i 는 10 입니다.<br>
		</c:when>
		<c:when test="${i == 20 }">
			i 는 20 입니다.<br>
		</c:when>
		<c:when test="${i == 30 }">
			i 는 30 입니다.<br>
		</c:when>
		<c:otherwise>
			i는 10, 20, 30이 아닙니다.<br>
		</c:otherwise>
		
	</c:choose>
	
	
	<%--
		forEach : for문
	 --%>
	 
	 <c:forEach var="a" begin="0" end="30" step="3">
	 	${a}
	 </c:forEach>
	 
	 
	 <hr>
	 
	 <%
	 	ArrayList<String> list = new ArrayList<>();
	 	list.add("홍길동");
	 	list.add("성춘향");
	 	list.add("이순신");
	 	list.add("이몽룡");
	 	
	 	request.setAttribute("list",list);
	 	//request 영역에 ArrayList 객체를 바인딩한다.
	 %>
	 
	 <c:forEach var="name" items="${requestScope.list}">
	 	${name }
	 </c:forEach>
	 
	 <%--
	 	향상된 for 문
	 		items 속성에 Collection 을 EL로 넣어주면 컬렉션안에 있는 객체를 하나씩 꺼내 변수한테 저장시킨다.
	 		
	  --%>

</body>
</html>
