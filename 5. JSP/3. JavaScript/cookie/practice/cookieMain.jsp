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
	
		Cookie[] cookies = request.getCookies();
	
		for(int i = 0; i<cookies.length; i++){
			String str = cookies[i].getValue();
			
			if(str.equals("hong")){
				out.print("<h2>홍길동님 안녕하세요~!!</h2>");
				out.print("<a href=\"cookieLogout.jsp\">로그아웃<a>");
			}
		}
		
	%>

</body>
</html>
