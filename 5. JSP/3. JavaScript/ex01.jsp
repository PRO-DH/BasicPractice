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
		 스크립트릿 알아보기
		 
		 <% %> : 이안에는 자바에서 쓰는 모든것을 사용할 수 있는 자바의 영역이다. 자바의 기능을 가지고 여러가지 작업을 할 수 있다.
	
	 --%>
	 
	 <%
	 	for(int i = 0; i< 10; i++){
	 		if(i % 2 == 1){
	 			out.print(i);
	 			// out : jsp 페이지가 생성하는 결과를 출력할 때 사용되는 출력스트림 내장객체
	 			
	 		}
	 	}
	 %>
	 
	 <%
	 	for(int i=0; i<5; i++){
	 %>
	 
	 <p> JSP 시작합니다!</p>
	 
	 <%
	 	}
	 %>

  
  
	<%--
		선언문 알아보기
		jsp 페이지 내에서 사용되는 전역변수 또는 메소드를 선언할 때 사용
		여기서 선언된 변수 및 메소드는 전역의 의미로 사용된다
	 --%>
	 
	 <%!
	 	String name = "홍길동";
	 	int age = 20;
	 %>
	 <%!
	 	public int add(int x, int y){
		 return x+y;
	 }
	 %>
	 <%
	 	out.print("이름 : " + name + "<br>");
	 	out.print("나이 : " + age + "<br>");
	 	out.print("10 + 20 : " + add(10,20));
	 %>

  
  
	<%--
		표현식 알아보기
		jsp 페이지 내에서 사용되는 변수의 값 또는 메소드 호출 등 결과값을 출력하기 위해 사용된다. (세미콜론은 사용할 수 없다.)
	 --%>
	 
	 <%!
	 	String id="hong";
	 	String pw="1234";
	 	
	 	public int add(int x, int y){
	 		return x + y;
	 	}
	 %>
	 
	 아이디 : <%=id %><br>
	 비밀번호 : <%=pw %><br>
	 100 + 200 : <%=add(100,200) %><br>
	 <%--
	 	표현식은 out.print();를 대체한다.
	  --%>

  
  	<%--
		선언문으로 이름 나이 전화번호 변수 선언하기
		스크립트릿으로 변수 초기화하기
		표현식으로 웹브라우저에 변수 출력하기
	 --%>
	 
	 <%!
	 	String name;
	 	int age;
	 %>
	 <%
	 	name = "성춘향";
	 	age = 25;
	 %>
	 이름 : <%=name %>
	 나이 : <%=age %>
</body>
</html>
