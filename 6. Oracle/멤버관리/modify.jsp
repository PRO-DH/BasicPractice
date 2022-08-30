<%@page import="com.jsp.members.MembersDTO"%>
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
		1. session에 있는 id값 얻기
		2. DAO 객체 생성 후 getMember메소드 호출하여 DTO객체 얻기
		3. 수정 폼 만들기
	 --%>
	 
	<%
	
		String id = (String)session.getAttribute("id");
		MembersDAO dao = MembersDAO.getInstance();
		MembersDTO dto = dao.getMember(id);
		
			
	%>
	
	<form name="modifyForm" action="modifyCheck.jsp" method="post">
	
		<input type="hidden" name="id" value="<%=dto.getId()%>">
		아이디 : <%=dto.getId() %><br>
		비밀번호 : <input type="password" name="pw" size="10"><br>
		비밀번호 확인 : <input type="password" name="pwCheck" size="10"><br>
		
		이름 : <%=dto.getName()%><br>
		이메일 : <input type="text" name="email" value="<%=dto.getEmail() %>"><br>
		주소 : <input type="text" name="address" value="<%=dto.getAddress() %>"><br>
		
		<input type="button" value="회원정보 수정" onclick="modifyFormCheck">
		
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		
		<input type="button" value="취소" onclick="javascript:window.location='main.jsp'">
	</form>
	
	<script>
		function modifyFormCheck(){
			var pw = document.modifyForm.pw.value;
			var pwCheck = document.modifyForm.pwCheck.value;
			if(pw=="" || pw.length==0){
				alert('비밀번호는 필수사항입니다.');
				document.modifyForm.pw.focus();
				return;
			}
			if(pw != pwCheck){
				alert('비밀번호가 일치하지 않습니다.');
				document.modifyForm.pw.focus();
				return;
			}
			document.modifyForm.submit();

		}
	</script>
</body>
</html>
