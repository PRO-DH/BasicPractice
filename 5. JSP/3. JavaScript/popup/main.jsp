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
	
		boolean cookieCheck = false;
		Cookie[] c = request.getCookies();
		
		if(c != null){
			for(int i = 0; i<c.length; i++){
				if(c[i].getValue().equals("notShow")){
					cookieCheck = true;
				}
			}
		}
		
		if(cookieCheck == false){
		
			out.print("<script>");
			out.print("window.open('popUp.jsp','pop','width=500, height=700')");
			out.print("</script>");
		}
		
	
	%>


	
	

</body>
</html>
