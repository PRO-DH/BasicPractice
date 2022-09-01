<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="/JSPWeb/css/style.css">
</head>
<body>

	<div id="container">
	
		<header>
		
			<ul>
				<li><a href="#">MyHOME</a></li>
				<li><a href="#">나의 게시판</a></li>
				
				<%
				if(session.getAttribute("validMem") != null
					&& session.getAttribute("name") != null){
				%>
				<li><b><%=session.getAttribute("name")%>님 반갑습니다~!!</b></li>
				<li><a href="#">나의 정보수정</a>
				<li><a href="#">로그아웃</a></li>
				<%
				}else{
				%>
				<li><a href="#">로그인</a>
				<li><a href="#">회원가입</a>
				<%
				}
				%>
			</ul>
		
		</header>
		
		<main>
		
			<h1>KGITBank 8월 평일 JSP</h1>
		
		</main>
	
		<footer>
		
			<br><br>
			<h2>KG ITBank 강남 아이티빌딩 11층</h2>
		
		</footer>
	
	</div>


</body>
</html>
