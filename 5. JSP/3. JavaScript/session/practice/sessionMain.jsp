<%@page import="java.util.Enumeration"%>
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
	
		Enumeration<String> e = session.getAttributeNames();
		
		while(e.hasMoreElements()){
			
			String sName = e.nextElement();
			String sValue = session.getAttribute(sName).toString();
			
			if(sValue.equals("sung")){
				out.print("<h2>성춘향님 안녕하세요</h2>");
				out.print("<a href=\"sessionTest.jsp\">세션 확인</a>");
				out.print("&nbsp;&nbsp;&nbsp;");
				out.print("<a href=\"sessionLogout.jsp\">로그 아웃</a>");
				
				
			}
		}
	
	
	%>

</body>
</html>
