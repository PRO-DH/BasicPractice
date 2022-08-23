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
	
		int count = 0;
	
		if(application.getAttribute("visit") != null){
			count = (Integer)application.getAttribute("visit");
		}
	
		count++;
		
		application.setAttribute("visit", count);
		
	%>
	
	
	<h2>현재 방문자 수 : <%=count %>명입니다.</h2>

</body>
</html>
