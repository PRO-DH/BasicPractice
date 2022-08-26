<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
	h2{
		text-align:center;
		
	}
	form{
		margin : 0 auto;
		text-align:center;
	}
</style>
</head>
<body>

	<h2>나의 메모장</h2>

	<form action="memoCheck.jsp" method="post">
	
		닉네임 : <input type="text" name ="nickName" size="10"><br><br>
		메모작성 : <br>
		<textarea name="contents" rows="5" cols="20" ></textarea><br>
		<input type="submit" value="메모등록">
		
		
	
	
	</form>

</body>
</html>
