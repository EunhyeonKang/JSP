package kr.co.member.ex.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {
	private DataSource ds;
	public MemberDAO() {
		try {
			Context ctx = new InitialContext();
			ds = (DataSource)ctx.lookup("java:/comp/env/jdbc/Oracle11g");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public int JoinOk(MemberDTO member) {
		int result = 0;
		try {
			//conn = JDBCConnection.getConnection();
			conn = ds.getConnection();
			// SQL 쿼리 작성
			String sql = "INSERT INTO member (id, pw, name, phone1,phone2,phone3,gender) VALUES (?, ?, ?, ?,?,?,?)";

			// PreparedStatement를 생성하여 SQL 쿼리 실행 준비
			pstmt = conn.prepareStatement(sql);

			// PreparedStatement의 파라미터 설정
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPw());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getPhone1());
			pstmt.setString(5, member.getPhone2());
			pstmt.setString(6, member.getPhone3());
			pstmt.setString(7, member.getGender());
			// SQL 쿼리 실행
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public MemberDTO LoginOk(String ids) {
		MemberDTO md = new MemberDTO();
		try {
			//conn = JDBCConnection.getConnection();
			conn = ds.getConnection();
			String sql = "SELECT * FROM member where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ids);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				md.setId(rs.getString("ID"));
				md.setPw(rs.getString("PW"));
				md.setName(rs.getString("NAME"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return md;
	}
	
	public ArrayList<MemberDTO> selectMember() {
		MemberDTO md= new MemberDTO();
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		try {
			//conn = JDBCConnection.getConnection();
			conn = ds.getConnection();
			String sql = "SELECT * FROM member";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {

				md.setId(rs.getString("ID"));
				md.setPw(rs.getString("PW"));
				md.setName(rs.getString("NAME"));
				list.add(md);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public int ModifyOk(String id, String pw, String phone) {
		// SQL 쿼리 작성
		String sql = "UPDATE member SET pw=?, phone1=? WHERE id=?";
		int result = 0;
		// PreparedStatement 생성
		try {
			//conn = JDBCConnection.getConnection();
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			// PreparedStatement 파라미터 설정
			pstmt.setString(1, pw); // pw 변수로 설정
			pstmt.setString(2, phone); // phone 변수로 설정
			pstmt.setString(3, id);
			// SQL 쿼리 실행
			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}
}
