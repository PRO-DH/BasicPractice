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
	
		Object obj1 = session.getAttribute("sessionName");
		//getAttribute 의 반환타입은  object 타입이다.
		String sessionNameValue = (String)obj1;
		out.print("sessionName 의 값 : " + sessionNameValue + "<br>");
		Object obj2 = session.getAttribute("sessionNumber");
		int sessionNumberValue = (Integer)obj2;
		
		out.print("sessionNumber의 값 : " + sessionNumberValue + "<br>");
		
		out.print("<hr>");
		
		String sName;
		String sValue;
		
		Enumeration<String> e = session.getAttributeNames();
		
		while(e.hasMoreElements()){
			
			sName = e.nextElement();
			
			sValue = session.getAttribute(sName).toString();
			
			out.print("세션 이름 : " + sName + ", 세션 값 : " + sValue + "<br>");
		}
		
		out.print("<hr>");
		
		
		
		
			
		
		String sessionID = session.getId();
		
		out.print("세션아이디 : " + sessionID + "<br>");
		
		int sessionInter = session.getMaxInactiveInterval();
		
		session.removeAttribute("sessionName");
		
		e = session.getAttributeNames();
		
		while(e.hasMoreElements()){
			
			sName = e.nextElement();
			
			sValue = session.getAttribute(sName).toString();
			
			out.print("세션 이름 : " + sName + ", 세션 값 : " + sValue + "<br>");
		}
		out.print("<hr>");
		
		session.invalidate();
		
		if(request.isRequestedSessionIdValid()){
			out.print("유요한 세션이 있음 <br>");
		}else{
			out.print("유요한 세션이 없음 <br>");
		}
		
	
	%>

</body>
</html>
