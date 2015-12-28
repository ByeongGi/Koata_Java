package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import conn.MyContext;
import vo.MenuVo;
import vo.OrderCookVo;
 
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
			sql.append("SELECT MNO , MCODE , MNAME , MPRICE FROM MENU ORDER BY 2 DESC");
			System.out.println("LOG SQL : "+sql);
			pstmt = conn.prepareStatement(sql.toString());
			rs=pstmt.executeQuery();
			
			while (rs.next()) {
				MenuVo vo = new MenuVo();
				vo.setMno(rs.getInt("MNO"));
				vo.setMcode(rs.getString("MCODE"));
				vo.setMname(rs.getString("MNAME"));
				vo.setMprice(rs.getInt("MPRICE"));
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
	
public void addOrder(OrderCookVo vo) {
		
		
		Connection conn = null;
		PreparedStatement pstmt= null;
		int res =0;
		try {
			/*
			 * ONO	NUMBER(3,0)
			MNO	NUMBER(3,0)
			ONAME	VARCHAR2(45 BYTE)   /
			QTY	NUMBER(5,0)
			ODATE	DATE
			*/
			conn = MyContext.getConn();
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO ORDERCOOK VALUES( ORDERCOOK_SEQ.nextVal , ? , ? , ? , SYSDATE)");
			System.out.println("LOG0 - SQL : "+sql);
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setInt(1, vo.getMno());
			pstmt.setString(2, vo.getOname());
			pstmt.setInt(3, vo.getQty());
			System.out.println(vo.getMno());
			System.out.println(vo.getOname());
			System.out.println(vo.getQty());
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
	
public ArrayList<OrderCookVo> getOrderList(){
	ArrayList<OrderCookVo> list = new ArrayList<OrderCookVo>();
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
		sql.append("SELECT o.ONO , o.MNO , o.ONAME , o.QTY , o.ODATE , "
				+ "m.MPRICE*o.QTY as TOTAL , m.MNAME , m.MCODE "
				+ "FROM ORDERCOOK o , MENU m "
				+ "WHERE o.MNO = m.MNO "
				+ "ORDER BY 1 DESC");
		System.out.println("LOG SQL : "+sql);
		pstmt = conn.prepareStatement(sql.toString());
		rs=pstmt.executeQuery();
		
		while (rs.next()) {
			OrderCookVo vo = new OrderCookVo();
			MenuVo mvo = new MenuVo();
			vo.setOno(rs.getInt("ONO"));
			vo.setMno(rs.getInt("MNO"));
			vo.setOname(rs.getString("ONAME"));
			vo.setQty(rs.getInt("QTY"));
			vo.setOdate(rs.getString("ODATE"));
			
			mvo.setMprice(rs.getInt("TOTAL"));
			mvo.setMcode(rs.getString("MCODE"));
			mvo.setMname(rs.getString("MNAME"));
			
			
			System.out.println("ONO"+vo.getMno());
			System.out.println("MNO"+vo.getMno());
			System.out.println("ONAME"+vo.getOname());
			System.out.println("QTY"+vo.getQty());
			System.out.println("ODATE"+vo.getOdate());
			System.out.println("MNO"+mvo.getMprice());
			System.out.println("MCODE"+mvo.getMcode());
			System.out.println("MNAME"+mvo.getMname());
			vo.setMvo(mvo);
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
