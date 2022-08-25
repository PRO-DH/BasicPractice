package com.jsp.circle;

import java.sql.*;
import java.util.ArrayList;

public class CircleMemberDAO {
	
	// DAO : Data Access Object
	// 데이터베이스에 접근해서 CRUD를 처리하는 객체9
	
	
	//생성자
	private CircleMemberDAO() {}
	
	//정적필드
	private static CircleMemberDAO instance = new CircleMemberDAO();
	
	//정적메소드
	public static CircleMemberDAO getInstance() {
		return instance;
	}
	
	// 싱글톤을 쓰는 이유
	// 고정된 메모리 영역을 얻으면서 한번의 new로 인스턴스를 사용하기 때문에 메모리 낭비를 방지할 수 있다.
	// 싱글톤으로 만들어진 클래스의 인스턴스는 전역 인스턴스이기 때문에 다른 클래스의 인스턴스들이 데이터를 공유하기 쉽다.
	// DBCP처럼 공통된 객체를 여러개 생성해서 사용해야하는 상황에서 많이 사용한다.
	
	private Connection conn;
	private PreparedStatement pstmt;
	// PreparedStatement 는 statemet를 상속받은 인터페이스
	// 1. Statement 의 기능향상
	// 2. 코드 안정성과 가독성 높음
	private ResultSet rs;
	
	private String driver = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	
	private String uid = "C##JSPUSER";
	private String upw = "jsp123";
	
	
	// 데이터를 받아서 해당하는 데이터를 DB에 insert하는 메소드
	public int insertCircle(CircleMemberDTO dto) {	
		
		int result = 0;
				
		try {
			
			Class.forName(driver);
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement("insert into circleMember() values(?,?,?,?)");
			// PreparedStatement 객체는 객체생성시에 SQL구문을 넣어서 객체를 생성한다.
			// 변수가 들어갈 자리는 ?로 작성한다
			pstmt.setString(1,dto.getName());
			pstmt.setInt(2, dto.getAge());
			pstmt.setString(3, dto.getPhone());
			pstmt.setString(4,dto.getEmail());
			// ?의 인덱스는 1부터 시작한다.
			result = pstmt.executeUpdate();
			//리턴결과는 행의 수. 아무 리턴이 없으면 0
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(pstmt != null)pstmt.close();
				if(conn != null)conn.close();
			}catch(Exception e2) {}
		}
		
		return result;
	}
	
	
	
	// DB에서 데이터를 얻어서 해당하는 데이터를 반환해주는 메소드
	public ArrayList<CircleMemberDTO> circleList(){
		
		ArrayList<CircleMemberDTO> list = new ArrayList<CircleMemberDTO>();
		
		String query = "select * from circleMember";
		try {
			
			Class.forName(driver);
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(query);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String phone = rs.getString("phone");
				String email = rs.getString("email");
				
				list.add(new CircleMemberDTO(name, age, phone, email));
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(rs != null)rs.close();
				if(pstmt !=null)pstmt.close();
				if(conn != null)conn.close();
				
			}catch(Exception e2) {}			
			
		}
		
		return list;
	}
	
	
	
	
}
