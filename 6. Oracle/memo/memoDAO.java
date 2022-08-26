package com.jsp.memo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;


public class MemoDAO {
	
	private MemoDAO() {}
	
	private static MemoDAO instance = new MemoDAO();
	
	public static MemoDAO getInstance() {
		return instance;
	}
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private String driver = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	
	private String uid = "C##JSPUSER";
	private String upw = "jsp123";
	
	
	
	// 데이터를 받아서 데이터를 Memo 테이블에 넣는 메소드
	public int insertMemo(String nickName, String contents) {
		int result = 0;
		
		String query = "insert into memo(memoId, nickName, contents)" + "values(memo_seq.nextval,?,?) ";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,uid,upw);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, nickName);
			pstmt.setString(2, contents);
			result = pstmt.executeUpdate();
			
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
	
	
	
	// DB memo 테이블에서 전체데이터를 얻어와 전체데이터를 반환해주는 메소드
	public ArrayList<MemoDTO> memoList(){
		ArrayList<MemoDTO> list = new ArrayList<MemoDTO>();
		String query = "select * from memo order by memoId DESC";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int memoId = rs.getInt("memoId");
				String nickName = rs.getString("nickName");
				String contents = rs.getString("contents");
				Timestamp regTime = rs.getTimestamp("regTime");
				list.add(new MemoDTO(memoId, nickName, contents, regTime));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null)pstmt.close();
				if(conn != null)conn.close();
				
			}catch(Exception e2) {}
		
			
		}
		return list;
	}
	
	
	
	
	// 메모 글 삭제해주는 메소드
	public void deleteMemo(int memoId) {
		String query = "delete from memo where memoId";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, memoId);
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null)pstmt.close();
				if(conn != null)conn.close();
				
			}catch(Exception e2) {}
		}
		
	}
	
}
