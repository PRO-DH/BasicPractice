<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="elMember" class="com.jsp.el.MemberEL" />
	
	<jsp:setProperty name="elMember" property="id"  value="sung"/>
	<jsp:setProperty name="elMember" property="pw"  value="1111"/>
	<jsp:setProperty name="elMember" property="name"  value="성춘향"/>
	<jsp:setProperty name="elMember" property="age"  value="20"/>



	<%--
		EL을 이용하면 자바빈의 프로퍼티를  JSP표현식이나 액션태그보다 쉽고 간결하게 사용할 수 있다.
		아래 식은 전부 프로퍼티를 꺼내는 방법들. (1.액션태그 / 2.표현식 / 3.EL)
	 --%>
	 
	 
	 아이디 : <jsp:getProperty property="id" name="elMember"/><br>
	 비밀번호 : <jsp:getProperty property="pw" name="elMember"/><br>
	 이름 : <jsp:getProperty property="name" name="elMember"/><br>
	 나이 : <jsp:getProperty property="age" name="elMember"/><br>
	 
	 <hr>
	 
	 아이디 : <%=elMember.getId() %><br>
	 비밀번호 : <%=elMember.getPw() %><br>
	 이름 : <%=elMember.getName() %><br>
	 나이 : <%=elMember.getAge() %><br>
	 
	 <hr>
	 
	 아이디 : ${elMember.id }<br>
	 비밀번호 : ${elMember.pw }<br>
	 이름 : ${elMember.name }<br>
	 나이 : ${elMember.age }<br>

</body>
</html>
