<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%!
	
	private String id, pw, name, phone;
	private int age;
	private Connection conn;
	private Statement stmt;
	
	String driver = "oracle.jdbc.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String uid="C##JSPUSER";
	String upw="jsp123";
	
	%>

	<%
	
		request.setCharacterEncoding("UTF-8");
		
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		name =  request.getParameter("name");
		String str = request.getParameter("age");
		age = Integer.parseInt(str);
		phone = request.getParameter("phone");
	
		String query = "insert into KGMember values('"+
		id + "', '" + pw + "', '" + name + "', " + age + ", '" + phone + "') ";
		
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection(url, uid, upw);
			stmt = conn.createStatement();
			
			int result = stmt.executeUpdate(query);
			// executeUpdate 메소드의 반환값
			
			if(result ==1){
				System.out.println("insert 성공 !!");
				response.sendRedirect("joinResult.jsp");
			}else{
				System.out.println("insert 실패!!");
				response.sendRedirect("joinForm.html");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
			try{
				
				if(stmt != null)stmt.close();
				if(conn != null)conn.close();
				
			}catch(Exception e2){
				
			}
			
		}
	
	%>

</body>
</html>
