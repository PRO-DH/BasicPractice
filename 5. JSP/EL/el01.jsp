<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%--
		EL(Expression Language)은 정수, 실수, 논리, 문자열, null을 표현할 수 있다.
				
	 --%>
	 
	 정수 : ${100 }<br>
	 실수 : ${3.14 }<br>
	 논리 : ${true }<br>
	 문자열 : ${"Hello EL" }<br>
	 널 : ${null }<br>
	 
	 <%--
	 	EL에서 사용하는 연산자는 산술, 비교, 논리, 조건(삼항) 연산자가 있다.
	  --%>
	  
	  <p>EL 산술연산자</p>
	  
	 

</body>
</html>
