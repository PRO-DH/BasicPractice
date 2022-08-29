<%@page import="com.jsp.members.MembersDAO"%>
<%@page import="java.sql.Timestamp"%>
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
		2.현재시간으로 timestamp객체 생성하기
		3. DTO 객체 생성 후 프로퍼티 셋팅하기
		4. DAO 객체 생성하기
		5. DAO의 confirmId 메소드 호출하여 같은 아이디가 없다면 insertMember메소드 호출하여 회원가입하기
		6. 회원가입이 잘 되었다면 login.jsp로 redirect시키기 - 회원가입이 잘 되지 않았다면 다시 join.jsp로 가기
		
	 --%>

	<%
		// 1번
		
		request.setCharacterEncoding("UTF-8");
		
	
	%>

	
	
	<%
		//2번
		Timestamp time = new Timestamp(System.currentTimeMillis());
		
	%>
	<%-- 3번 
		넘어온 파라미터의 데이터가 많을경우 셋팅해야될 프로퍼티 속성값을 *로 주면 넘어온 모든 파라미터가 프로퍼티 값으로 셋팅된다.
		join.jsp에서 넘어오는 파라미터의 이름과 DTO에 정의된 파라미터의 이름이 일치해야한다.
	--%>
	<jsp:useBean id="dto" class="com.jsp.members.MembersDTO"/>
	<jsp:setProperty property="*" name="dto" />
	<%
		dto.setRegDate(time);
	
		//4번
		MembersDAO dao = MembersDAO.getInstance();
		if(dao.confirmId(dto.getId())==1){	// 체크해서 같은 아이디가 있을때
			
	%>
			<script>
				alert('아이디가 이미 존재합니다.');
				history.back();
			</script>
	<%
		}else{	// 아이디가 없을때
			int result = dao.insertMember(dto);
			if(result ==1){	// 정상적으로 DB에 데이터가 들어갔다면

	%>
				<script type="text/javascript">
					alert('회원가입을 축하합니다.');
					window.location = 'login.jsp';
				</script>
	<%
			}else{
	%>
		
				<script>
					alert('회원가입에 실패하였습니다.');
					history.back();
				</script>
	
	<%
			}
		}
	%>
	
	
</body>
</html>
