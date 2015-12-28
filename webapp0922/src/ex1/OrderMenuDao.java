package ex1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
 
public class OrderMenuDao {
	private static OrderMenuDao dao;
	// 싱글톤을 사용해서 최초의 접속한 클라이언트일때 
	// 생성해서 static 영역에 두고  , 그 후에 그 주소만 찾아서 사용함 
	private OrderMenuDao() {}
	public synchronized static OrderMenuDao getDao() {
		if (dao == null) {
			dao =  new OrderMenuDao();
		} 
		return dao;
	}
	// 메뉴에 저장하는 메소드를 
	public void addMenu(MenuVo vo) {
		
		
		Connection conn = null;
		PreparedStatement pstmt= null;
		int res =0;
		try {
			conn = MyContext.getConn();
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO MENU VALUES( menu_seq.nextVal , ? , ? , ? )");
			System.out.println("LOG0 - SQL : "+sql);
			pstmt = conn.prepareStatement(sql.toString());
			// pstmt.setInt(1, vo.getMno());
			pstmt.setString(1, vo.getMcode());
			pstmt.setString(2, vo.getMname());
			pstmt.setInt(3, vo.getMprice());
			res=pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close(); 
				if (conn != null ) conn.close();
			} catch (SQLException e) {
				// TODO: handle exception
			}
		}
		
	} // end addMenu()
	
	
	public ArrayList<MenuVo> getMenuList(){
		ArrayList<MenuVo> list = new ArrayList<MenuVo>();
		Connection conn =null;	
		PreparedStatement pstmt= null;
		ResultSet rs = null;
		/*
		MNO	    NUMBER(3,0)
		MCODE	VARCHAR2(45 BYTE)
		MNAME	VARCHAR2(45 BYTE)
		MPRICE	NUMBER(5,0)
		*/
		try {
			conn = MyContext.getConn();
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT MNO , MCODE , MNAME , MPRICE FROM MENU");
			System.out.println("LOG SQL : "+sql);
			pstmt = conn.prepareStatement(sql.toString());
			rs=pstmt.executeQuery();
			
			while (rs.next()) {
				MenuVo vo = new MenuVo();
				int mno=rs.getInt("MNO");
				String mcode=rs.getString("MCODE");
				String mname=rs.getString("MNAME");
				int mprice = rs.getInt("MPRICE");
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close(); 
				if (pstmt != null) pstmt.close(); 
				if (conn != null ) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	
}
