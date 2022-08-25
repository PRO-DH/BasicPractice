<%@page import="com.jsp.circle.CircleMemberDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.jsp.circle.CircleMemberDAO"%>
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
	
		CircleMemberDAO dao = CircleMemberDAO.getInstance();
		
		ArrayList<CircleMemberDTO> list = dao.circleList();
		
		out.print("<h1>동아리 회원 목록</h1>");
		for(int i = 0; i < list.size() ; i++){
			CircleMemberDTO dto = list.get(i);
			out.print("이름 : " + dto.getName() + ", 나이 : " + dto.getAge() + ", 핸드폰번호 : " + dto.getPhone() + ", 이메일 : " + dto.getEmail() + "<br>");
		}
	
	%>

	<h3><a href="circleJoin.html">동아리 가입하기</a></h3>


</body>
</html>
