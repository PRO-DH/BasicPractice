-<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	
	request.setCharacterEncoding("UTF-8");
	String str = request.getParameter("answer");
	
	if(str.equals("안녕")){
	
		name = URLEncoder.encode(name, "UTF-8");
		// URLEncoder를 사용해서 인코딩을 UTF-8로 변경해서 보낼 수 있다.
		response.sendRedirect("OK.jsp?name=" + name);
	}else{
		name = URLEncoder.encode(name, "UTF-8");
		response.sendRedirect("NG.jsp?name=" + name);
	}
	%>
	

</body>
</html>
