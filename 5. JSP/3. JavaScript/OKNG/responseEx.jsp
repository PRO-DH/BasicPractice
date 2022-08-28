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
		response.sendRedirect("OK.jsp");
	}else{
		response.sendRedirect("NG.jsp");
	}
	%>
	

</body>
</html>
