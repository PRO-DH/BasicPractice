<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>게시글 작성</h1>

	<form action="writeCheck.jsp" method="post">
	
		작성자 : <input type="text" name="bName" size="10"><br>
		

		제목&nbsp;&nbsp;&nbsp; : <input type="text" name="bTitle" size="10"><br><br>
		
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		
		내용<br><br>
		
		<textarea name="bContent" rows="5" cols="20"></textarea>
		<br>
		<input type="submit" value="글작성">
	</form>
	
	
</body>
</html>
