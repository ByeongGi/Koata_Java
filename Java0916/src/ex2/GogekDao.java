package ex2;

// @author kosta, 2015. 9. 16 , 오후 6:11:27 , GogekDao 

import conn.MyConn;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GogekDao {
/*
GONAME	VARCHAR2(10 BYTE)
GOTEL	VARCHAR2(18 BYTE)
GOJUMIN	CHAR(14 BYTE)
GODAM	NUMBER(3,0)    
*/    
    
    public void insert_GO_IN(GogekVo vo){
        Connection conn = null;
        CallableStatement cs = null;
        try {
            
            // 1. PROCEDURE GO_IN() CALL
            conn= MyConn.getConn();
            cs = conn.prepareCall("BEGIN GO_IN( ? , ? , ? , ? ); END;");
            // 2. BINDING INPUT PARAMETER 
            cs.setString(1, vo.getGoName());
            cs.setString(2, vo.getGoTel());
            cs.setString(3, vo.getGoJumin());
            cs.setInt(4, vo.getGoDam());
            // 3. CallableStatement - execute() CALL 
            cs.execute();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally{
            try {
                if( cs != null ) cs.close();
                if( conn != null ) conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
           
    } // end insert_GO_IN()
    
    public GogekVo select_GO_SHARCH(String goName){
        GogekVo vo = new GogekVo();
        Connection conn = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        try {
            // 1. PROCEDURE GO_SHARCH() CALL
            conn= MyConn.getConn();
            cs = conn.prepareCall("BEGIN GO_SEARCH( ? , ? ); END;");
            // 2. BINDING INPUT PARAMETER , OUTPUT PARAMETER 
            cs.setString(1, goName);
            cs.registerOutParameter(2, oracle.jdbc.OracleTypes.CURSOR);
            // 3. EXECUTE()
            cs.execute();
            // 4. CURSOR() RETURN -> RESULTSET
            rs=(ResultSet) cs.getObject(2);
            /*
            GONAME	VARCHAR2(10 BYTE)
            GOTEL	VARCHAR2(18 BYTE)
            GOJUMIN	CHAR(14 BYTE)
            GODAM	NUMBER(3,0)    
            */ 
            if (rs.next()) {
                vo.setGoName(rs.getString("GONAME"));
                vo.setGoTel(rs.getString("GOTEL"));
                vo.setGoJumin(rs.getString("GOJUMIN"));
                vo.setGoDam(rs.getInt("GODAM"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally{
            try {
                if( rs != null ) rs.close();
                if( cs != null ) cs.close();
                if( conn != null ) conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return vo;
    }
    
    public GogekVo select_GO_SHARCH2(String goName){
        GogekVo vo = new GogekVo();
        Connection conn = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        try {
            // 1. PROCEDURE GO_SHARCH() CALL
            conn= MyConn.getConn();
            cs = conn.prepareCall("BEGIN GO_SEARCH2( ? , ? ); END;");
            // 2. BINDING INPUT PARAMETER , OUTPUT PARAMETER 
            cs.setString(1, goName);
            cs.registerOutParameter(2, oracle.jdbc.OracleTypes.CURSOR);
            // 3. EXECUTE()
            cs.execute();
            // 4. CURSOR() RETURN -> RESULTSET
            rs=(ResultSet) cs.getObject(2);
            /*
            GONAME	VARCHAR2(10 BYTE)
            GOTEL	VARCHAR2(18 BYTE)
            GOJUMIN	CHAR(14 BYTE)
            GODAM	NUMBER(3,0)    
            */ 
            if (rs.next()) {
                vo.setGoName(rs.getString("GONAME"));
                vo.setGoTel(rs.getString("GOTEL"));
                vo.setGoJumin(rs.getString("GOJUMIN"));
                vo.setGoDam(rs.getInt("GODAM"));
                vo.setGoGender(rs.getString("GOGENDER"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally{
            try {
                if( rs != null ) rs.close();
                if( cs != null ) cs.close();
                if( conn != null ) conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return vo;
    }
   
}
