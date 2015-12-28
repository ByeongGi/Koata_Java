package pc.dao;
// @author kosta, 2015. 9. 15 , 오후 4:17:48 , MemberDao 

import conn.MyConn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import pc.vo.MemberVo;

public class MemberDao {

    // 중복 ID  검사 (미구현) 
    public boolean vaildate(String id) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = MyConn.getConn();
            StringBuffer sql = new StringBuffer();
            System.out.println("LOG3 SQL : "+ sql );
            pstmt = conn.prepareStatement(sql.toString());
            rs = pstmt.executeQuery();
            while (rs.next()) {
                if (id.equals(rs.getString("MID"))) return false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally{
           try {
                if (rs != null ) rs.close();
                if (pstmt != null ) pstmt.close();
                if (conn != null )  conn.close();
                // System.out.println("LOG5 SQL RESOUCE CLOSED SUCCESS! ");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return true;

    }

    // 회원가입  - (맵핑 완)
    public void insertMember(MemberVo vo) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = MyConn.getConn();
            /*insert into MemberTable values(MemberTable_seq.nextVal, ?,?,?,?,?,?,'1',?,sysdate) */
            StringBuffer sql = new StringBuffer();
            sql.append("insert into MemberTable values")
               .append("(MemberTable_seq.nextVal, ? , ? , ? , ? , ? , ? , '1' , ? , sysdate )");
            System.out.println("LOG3 SQL : "+ sql.toString() );
            pstmt = conn.prepareStatement(sql.toString() );
            // pstmt.setInt(1, vo.getMNum());
            pstmt.setString(1, vo.getMId());
            pstmt.setString(2, vo.getMName());
            pstmt.setString(3, vo.getMPwd());
            pstmt.setString(4, vo.getMAddr());
            pstmt.setString(5, vo.getMEamil());
            pstmt.setString(6, vo.getMGender());
            pstmt.setString(7, vo.getMRole());
            pstmt.setString(8, vo.getMTel());
            pstmt.setString(9, vo.getMRegDate());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally{
           try {
                if (pstmt != null ) pstmt.close();
                if (conn != null )  conn.close();
                System.out.println("LOG5 SQL RESOUCE CLOSED SUCCESS! ");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }

    // 회원 리스트 (회원) - 맵핑 완료 
    public ArrayList<MemberVo> listMember() {
        ArrayList<MemberVo> list = new ArrayList<MemberVo>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {

            conn = MyConn.getConn();
            /*select MId, MName, MPwd, MAddr, MEamil, MGender, MTel, MRegDate from MemberTable;*/
            StringBuffer sql = new StringBuffer();
            sql.append("select MId, MName, MPwd, MAddr, MEamil, MGender, MTel, MRegDate from MemberTable");
            System.out.println("LOG3 SQL : "+ sql );
            pstmt = conn.prepareStatement(sql.toString());
            rs = pstmt.executeQuery();
            while (rs.next()) {
                MemberVo vo = new MemberVo();
                vo.setMId(rs.getString("MID"));
                vo.setMName(rs.getString("MNAME"));
                vo.setMPwd(rs.getString("MPWD"));
                vo.setMAddr(rs.getString("MADDR"));
                vo.setMEamil(rs.getString("MEAMIL"));
                vo.setMGender(rs.getString("MGENDER"));
                vo.setMTel(rs.getString("MTEL"));
                // vo.setMRole(rs.getString("MROLE"));
                vo.setMRegDate(rs.getString("MREGDATE"));
                list.add(vo);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally{
           try { 
                if (rs != null ) rs.close();
                if (pstmt != null ) pstmt.close();
                if (conn != null )  conn.close();
                System.out.println("LOG5 SQL RESOUCE CLOSED SUCCESS! ");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return list;
    }

    // 회원 탈퇴 (맵핑 완)
    public int deleteMember(int delN) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        int res = 0;
        try {
            conn = MyConn.getConn();
            StringBuffer sql = new StringBuffer();
            /* delete from MemberTable where MNum=? */
            sql.append("delete from MemberTable where MNum=?");
            pstmt = conn.prepareStatement(sql.toString());
            System.out.println("LOG3 SQL : "+ sql );
            res = pstmt.executeUpdate();
            pstmt.setInt(1, delN);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally{
           try {
                if (pstmt != null ) pstmt.close();
                if (conn != null )  conn.close();
                System.out.println("LOG5 SQL RESOUCE CLOSED SUCCESS! ");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return res;
    }

    // 개인 정보 조회 (이름으로) 맵핑 완
    public MemberVo p_Info(String mName) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        MemberVo vo = new MemberVo();
        try {
            conn = MyConn.getConn();
            StringBuffer sql = new StringBuffer();
            /*select * from MemberTable like ?   --?가 '%'userNamev.getText().trim()'%'*/
            sql.append("select * from MemberTable")
               .append(" like ?");
            System.out.println("LOG3 SQL : "+ sql );
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1, '%'+mName+'%');
            rs = pstmt.executeQuery();

            if (rs.next()) {
                vo.setMId(rs.getString("MID"));
                vo.setMName(rs.getString("MNAME"));
                vo.setMPwd(rs.getString("MPWD"));
                vo.setMAddr(rs.getString("MADDR"));
                vo.setMEamil(rs.getString("MEAMIL"));
                vo.setMGender(rs.getString("MGENDER"));
                vo.setMRole(rs.getString("MROLE"));
                vo.setMTel(rs.getString("MTEL"));
                vo.setMRegDate(rs.getString("MREGDATE"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally{
           try {
                if (rs != null ) rs.close();
                if (pstmt != null ) pstmt.close();
                if (conn != null )  conn.close();
                // System.out.println("LOG5 SQL RESOUCE CLOSED SUCCESS! ");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return vo;

    }

    // 개인 정보 수정 
    public void u_p_Info(MemberVo vo) {
        Connection co = null;
        PreparedStatement pstmt = null;
        try {

            co = MyConn.getConn();
            /*update MemberTable set MPwd=?, MAddr=?, MEmail=?, MTel=? where MNum=? */
            StringBuffer sql = new StringBuffer();
            sql.append("update MemberTable set MPwd=?, MAddr=?, MEmail=?, MTel=? where MNum=?");
            System.out.println("LOG3 SQL : "+ sql );
            pstmt = co.prepareStatement(sql.toString());
            pstmt.setString( 1 , vo.getMPwd());
            pstmt.setString( 2, vo.getMAddr());
            pstmt.setString( 3 , vo.getMEamil());
            pstmt.setString( 4, vo.getMTel());
            pstmt.setInt( 5, vo.getMNum());
            pstmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

}
