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
	
		for(int i = 0; i < cookies.length; i++){
			String str = cookies[i].getName();
			
			if(str.equals("cookieName")){
				out.print("쿠키 이름 : " + cookies[i].getName() + "<br>");
				out.print("쿠키 값 : " + cookies[i].getValue() + "<br>");
				
			}
		}
	
	%>


</body>
</html>