<%@page import="com.jsp.members.MembersDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%--
		1.넘어온 데이터 받기
		2. DAO 객체 생성 후 updateMember 메소드 호출
		3. 결과값을 얻어 로직처리하기 
	 --%>
	 
	 <jsp:useBean id="dto" class="com.jsp.members.MembersDTO" />
	 <jsp:setProperty property="*" name="dto" />
	 
	 <%
	 	MembersDAO dao = MembersDAO.getInstance();
	 	int result = dao.updateMember(dto);
	 	if(result ==1){	// 수정이 잘 되었다면
	 		
	 %>
	 
	 	<script>
	 		alert('회원 정보수정이 되었습니다.');
	 		window.location='main.jsp';
	 	</script>
	 <%
	 	}
	 	else{	// 수정이 잘 되지 않았다면
	 %>
	 	<script>
	 		alert('회원 정보수정 실패입니다.');
	 		history.back();
	 	</script>
	 
	 <%
	 	}
	 %>
	

</body>
</html>
