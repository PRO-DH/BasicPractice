<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="el03.jsp" method="post">
		아이디 : <input type="text" name="id" size="10"><br>
		비밀번호 : <input type="text" name="pw" size="10"><br>
		<input type="submit" value="로그인">
	</form>
	
	<%--
		EL 내장객체의 param객체로 넘어온 파라미터값을 사용할 수있다.
	 --%>
	 
	 넘어온 아이디 : ${param.id }<br>
	 넘어온 비밀번호 : ${param.pw }<br>

</body>
</html>
