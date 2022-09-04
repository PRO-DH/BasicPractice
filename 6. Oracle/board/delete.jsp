<%@page import="java.util.ArrayList"%>
<%@page import="com.jsp.board.BoardDAO"%>
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
	
		String bId = request.getParameter("bId");
		
		BoardDAO dao = BoardDAO.getInstance();
		
		int result = dao.delete(bId);
		
		if(result == 1){
	%>
		<script>
			alert('해당글이 삭제되었습니다.');
			window.location = 'boardList.jsp';
		</script>
	<%
		}else{
	%>
		<script>
			alert('해당글이 삭제되지 않앗습니다.');
			history.back();
		</script>		
	<%
		}
	%>

</body>
</html>
