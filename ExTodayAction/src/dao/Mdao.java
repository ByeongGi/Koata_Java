package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.MemberVo;

public class Mdao {
	
	public int insert(MemberVo vo){
		Connection conn = null;
		PreparedStatement pstmt = null;
		int res =0;
		/*
		NUM	NUMBER
		ID	VARCHAR2(20 BYTE)
		PWD	VARCHAR2(20 BYTE)
		NAME	VARCHAR2(45 BYTE)
		POST	CHAR(10 BYTE)
		
		ROADADDRESS	VARCHAR2(300 BYTE)
		JIBUNADDRESS	VARCHAR2(300 BYTE)
		EDATE	DATE*/
		try {
			conn = MyConn.getConn();
			String sql ="INSERT INTO MEM VALUES( mem_seq.NEXTVAL , ? , ? , ? , ? , ? , ? ,SYSDATE ) ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPwd());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getPost());
			pstmt.setString(5, vo.getRoadAddress());
			pstmt.setString(6, vo.getJibunaddress());
			res=pstmt.executeUpdate();
		} catch (SQLException e) {	
			e.printStackTrace();
		} finally {
			try {
				if (pstmt !=null) pstmt.close();
				if (conn !=null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
		
		return res;
	}
	
	public int findId(String id){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int res =0;
		try {
			conn = MyConn.getConn();
			String sql = "SELECT COUNT(*) CNT FROM MEM WHERE ID = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			if(rs.next()){
				res	= rs.getInt("CNT");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
				try {
					if (rs !=null) rs.close();
					if (pstmt !=null) pstmt.close();
					if (conn !=null) conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} 
		}
		
		
		return res;
	}
}
