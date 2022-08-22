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
		Cookie cookie = new Cookie("cookieName", "cookieValue");
		
		cookie.setMaxAge(60*60);
		
		response.addCookie(cookie);
		
		
	
	%>
	
	<h2>쿠키가 탑재되었습니다.</h2>

	<a href="cookieGet.jsp">쿠키 얻기</a>

</body>
</html>
