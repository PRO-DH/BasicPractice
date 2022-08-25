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
		request.setCharacterEncoding("UTF-8");
	
		String name = request.getParameter("name");
		String str = request.getParameter("age");
		int age = Integer.parseInt(str);
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		
	%>
	
	<jsp:useBean id="dto" class="com.jsp.circle.CircleMemberDTO" />
	
	<jsp:setProperty name="dto" property="name" value="<%=name %>" /> 
	<jsp:setProperty name="dto" property="age" value="<%=age %>" /> 
	<jsp:setProperty name="dto" property="phone" value="<%=phone %>" /> 
	<jsp:setProperty name="dto" property="email" value="<%=email %>" /> 
	
	<%
		CircleMemberDAO dao = CircleMemberDAO.getInstance();
		
		int result = dao.insertCircle(dto);
		
		if(result ==1){
	%>
		<script>
			alert('동아리 가입이 이루어졋습니다.');
		</script>
		<h2>동아리 가입이 되었습니다.</h2>
		<a href="circleList.jsp">동아리 목록 보기</a>
	<%
		}else{
		
	%>
		<script type="text/javascript">
			alert('동아리 가입이 이루어지지 않았습니다.');
		</script>
		<h2>동아리 가입이 되지 않았습니다.</h2>
		<a href="circleJoin.html">동아리 가입하기</a>
	
	<%
		}
	%>

</body>
</html>
