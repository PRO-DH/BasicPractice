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

	<%
		request.setCharacterEncoding("UTF-8");
	
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		
		MembersDAO dao = MembersDAO.getInstance();
		
		int result = dao.userCheck(id,pw);
		if(result == -1){	//회원이 없는경우
	%>
		<script>
			alert('아이디가 존재하지 않습니다.');
			history.back();
		</script>
	<%
		}else if(result ==0){	//비번 틀린경우
	%>
		<script>
			alert('비밀번호가 틀립니다.');
			history.back();
		</script>
		
	<% 
		}else if(result ==1 ){	//로그인 된 경우
		 MembersDTO dto = dao.getMember(id);
		
		 
			 if(dto == null){
			 	out.print("<script>");
			 	out.print("alert('존재하지 않는 회원입니다.')");
			 	out.print("history.back();");
			 	out.print("</script>");
	
			}else{
				
				String name = dto.getName();
				
				session.setAttribute("id",id);
				session.setAttribute("name",name);
				response.sendRedirect("main.jsp");
			}
		}
	%>

</body>
</html>
