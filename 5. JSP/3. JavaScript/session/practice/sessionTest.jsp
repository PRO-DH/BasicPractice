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
		
		int count = 0;
		
		while(e.hasMoreElements()){
			
			count ++;
			
			String sName = e.nextElement();
			String sValue = session.getAttribute(sName).toString();
			
			out.print("세션 이름 : " + sName + "<br>");
			out.print("세션 값 : " + sValue + "<br>");
				
		}
		
		if(count ==0){
			out.print("<p>해당 세션이 삭제되었습니다.</p>");
		}
	
	%>

</body>
</html>
