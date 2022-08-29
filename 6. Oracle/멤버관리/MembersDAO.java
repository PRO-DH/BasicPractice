package com.jsp.members;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MembersDAO {
	
	private DataSource ds;
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	// 싱글톤 패턴으로 하기
	// 생성자에서 DataSource 변수 초기화 하기
	
	private MembersDAO() {
		try {
			Context context = new InitialContext();
			ds = (DataSource)context.lookup("java:comp/env/jdbc/oracle");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private static MembersDAO instance = new MembersDAO();
	
	// get메소드 만들기
	public static MembersDAO getInstance() {
		return instance;
	}
	
	
	
	
	// 닫는 메소드 각각 만들기
	private void close(Connection conn) {
		
		try {
			if(conn != null) {
				conn.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void close(PreparedStatement pstmt) {
		
		try {
			if(pstmt != null) {
				pstmt.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void close(ResultSet rs) {
		
		try {
			if(rs != null) {
				rs.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	// 회원가입폼 작성 후 데이터를 DB에 넣어주는 메소드
	
	public int insertMember(MembersDTO dto) {
		int result = 0;
		String query = "insert into members(id, pw, name, email, regDate, address "
				+ "values(?,?,?,?,?,?)";
	
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPw());
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.getEmail());
			pstmt.setTimestamp(5, dto.getRegDate());
			pstmt.setString(6, dto.getAddress());
			
			result = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			close(pstmt);
			close(conn);
			
		}
		return result;
	}
	
	
	
	
	
	
	
	// members 테이블에 같은 아이디가 있는지 확인해주는 메소드
	public int confirmId(String id) {
		int result = 0;
		String query = "select id from members where id = ?";
		
		try {
			
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1,id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				result = 1;
			}else {
				result = 0;
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
			close(conn);
			
		}
		
		return result;
	}
	
	
	
	
	
	
	// 로그인 시 id, pw를 체크해주는 메소드
	public int userCheck(String id, String pw) {
		int result = 0;
		
		String query = "select pw from members where id = ?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String dbPw = rs.getString("pw");
				
				if(pw.equals(dbPw)) {
					result = 0;
				}else {
					result = -1;
				}
			}else {
				result = -1;				
			}
			
		}catch(Exception e ) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
			close(conn);
			
		}
		return result;
	}
	
	
	
	
	
	
	
	
	// 회원 정보를 얻는 메소드
	public MembersDTO getMember(String id) {
		MembersDTO dto = null;
		
		String query = " select * from members where id = ?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String dbId = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Timestamp regDate = rs.getTimestamp("regDate");
				String address = rs.getString("address");
				
				
				dto = new MembersDTO(dbId, pw, name, email, regDate, address);
				
			}
			
			
		}catch(Exception e ) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
			close(conn);
			
		}
		
		return dto;
	}
	
	
	
	
	
	
	
	// 회원정보를 수정해주는 메소드 - update로 비밀번호.이메일.주소 수정
	public int updateMember(MembersDTO dto) {
		int result = 0;
		
		String query = "update members set pw = ?, email = ?, address = ?"
				+ " where id = ?";
		
		try {
			
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, dto.getPw());
			pstmt.setString(2, dto.getEmail());
			pstmt.setString(3, dto.getAddress());
			pstmt.setString(4, dto.getId());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(conn);
		}
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	// 회원탈퇴 하는 메소드
	public int deleteMember(String id) {
		int result = 0;
		
		String query = "delete from members where id = ?";
		
		try {
			
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(conn);
		}
		
		return result;
	}
	

}
