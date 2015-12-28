package proejct.dao;
// @author kosta, 2015. 9. 15 , 오후 4:17:48 , MemberDao 


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import proejct.conn.MyConn;
import proejct.vo.MemberVo;

public class MemberDao  {

    // 로그인 체크 ->  
    public MemberVo vaildate(String id, String pwd) throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        MemberVo vo = new MemberVo();
        int res = 0 ; 
        try {
            conn = MyConn.getConn();
            StringBuffer sql = new StringBuffer();
            
            //sql.append("SELECT * FROM MEMBERTABLE WHERE MID = ? AND MPWD = ?");
            sql.append("SELECT m.MNUM,m.MID,m.MNAME,m.MADDR,m.MEMAIL,m.MGENDER,m.MROLE,")
            .append(" m.MTEL,m.MREGDATE,p.Payment,p.ChargeTime FROM MEMBERTABLE m, PCRoomTable p")
            .append(" where m.MNum = p.MNum and MId = ? AND MPwd = ? and MStatus = 1");        
            System.out.println("LOG3 SQL : "+ sql );
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString(1,id); 
            pstmt.setString(2,pwd); 
            rs = pstmt.executeQuery();
            
            if (rs.next()) {
                vo.setMNum(rs.getInt("MNUM"));
                vo.setMId(rs.getString("MID"));
                vo.setMName(rs.getString("MNAME"));
                vo.setMAddr(rs.getString("MADDR"));
                vo.setMEmail(rs.getString("MEMAIL"));
                vo.setMGender(rs.getString("MGENDER"));
                vo.setMRole(rs.getString("MROLE"));
                vo.setMTel(rs.getString("MTEL"));
                vo.setMRegDate(rs.getString("MREGDATE"));
                vo.setPayment(rs.getInt("Payment"));
                vo.setChargeTime(rs.getString("ChargeTime"));
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally{
           try {
                if (rs != null ) rs.close();
                if (pstmt != null ) pstmt.close();
                if (conn != null )  conn.close();
                // System.out.println("LOG5 SQL RESOUCE CLOSED SUCCESS! ");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return vo;

    }
    
    // insert할때 pay값 초기화
    public void insertPcRoom(int mNum){
        
        Connection conn = null;
        PreparedStatement pstmt = null;
        
        try {
            conn = MyConn.getConn();
            StringBuffer sql = new StringBuffer();
            sql.append("insert into PCRoomTable values (?, 0,sysdate )");
            System.out.println("LOG3 SQL : "+ sql.toString() );
            pstmt = conn.prepareStatement(sql.toString() );
           
            pstmt.setInt(1, mNum);
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
    
    // 회원가입 
    public int insertMember(MemberVo vo) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        int res = 0;
        
        
        try {
            conn = MyConn.getConn();
            /*insert into MemberTable values(MemberTable_seq.nextVal, ?,?,?,?,?,?,'1',?,sysdate) */
            StringBuffer sql = new StringBuffer();
            sql.append("insert into MemberTable values")
               .append("(MemberTable_seq.nextVal, ? , ? , ? , ? , ? , ? , '1' , ? , sysdate,1)");
            System.out.println("LOG3 SQL : "+ sql.toString() );
            pstmt = conn.prepareStatement(sql.toString() );
            // pstmt.setInt(1, vo.getMNum());
            pstmt.setString(1, vo.getMId());
            pstmt.setString(2, vo.getMName());
            pstmt.setString(3, vo.getMPwd());
            pstmt.setString(4, vo.getMAddr());
            pstmt.setString(5, vo.getMEmail());
            pstmt.setString(6, vo.getMGender());
            pstmt.setString(7, vo.getMTel());
            res = pstmt.executeUpdate();
            
            int mNum = getIdList(vo.getMId());
            //회원번호,충전금액,충전시간 초기화
            insertPcRoom(mNum);
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
    //아이디로 회원정보 뽑기
    public int getIdList(String mId){
        
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        int mNum = 0;
        try {
            conn = MyConn.getConn();
            StringBuffer sql = new StringBuffer();
            
            sql.append("SELECT MNUM FROM MemberTable")
            .append(" where MId like '%" + mId + "%'");    
            
            System.out.println("LOG3 SQL : "+ sql );
            pstmt = conn.prepareStatement(sql.toString());
            rs = pstmt.executeQuery();
           
            if (rs.next()) {
               mNum = rs.getInt("MNUM");
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
        return mNum;
        
    }
    
    // 회원 리스트
    public ArrayList<MemberVo> listMember() {
        ArrayList<MemberVo> list = new ArrayList<MemberVo>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {

            conn = MyConn.getConn();
            /*select MId, MName, MPwd, MAddr, MEamil, MGender, MTel, MRegDate from MemberTable;*/
            StringBuffer sql = new StringBuffer();
            sql.append("select MNum, MId, MName, MPwd, MAddr, MEmail, MGender, MTel, MRegDate from MemberTable");
            System.out.println("LOG3 SQL : "+ sql );
            pstmt = conn.prepareStatement(sql.toString());
            rs = pstmt.executeQuery();
            while (rs.next()) {
                MemberVo vo = new MemberVo();
                vo.setMId(rs.getString("MID"));
                vo.setMNum(rs.getInt("MNum"));
                vo.setMName(rs.getString("MNAME"));
                vo.setMPwd(rs.getString("MPWD"));
                vo.setMAddr(rs.getString("MADDR"));
                vo.setMEmail(rs.getString("MEmail"));
                vo.setMGender(rs.getString("MGENDER"));
                vo.setMTel(rs.getString("MTEL"));
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

    // 회원 탈퇴(delete아니고 update로 탈퇴처리)
    public int deleteMember(int delN) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        int res = 0;
        try {
            conn = MyConn.getConn();
            StringBuffer sql = new StringBuffer();
            sql.append("update MemberTable set MStatus=0 where MNum=?"); // 1 이면 로그인 가능  0 이면  불가 
            //sql.append("delete from MemberTable where MNum=?");
            System.out.println("MNum : " + delN);
            pstmt = conn.prepareStatement(sql.toString());
            System.out.println("LOG3 SQL : "+ sql );
            pstmt.setInt(1, delN);
            res = pstmt.executeUpdate();
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

    // 이름으로 회원 정보 조회
    public ArrayList<MemberVo> p_Info(String mName) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<MemberVo> list = null;
       
        try {
            conn = MyConn.getConn();
            StringBuffer sql = new StringBuffer();
            
            sql.append("SELECT m.MNUM,m.MID,m.MNAME,m.MADDR,m.MEMAIL,m.MGENDER,m.MROLE,")
            .append(" m.MTEL,m.MREGDATE,p.Payment,p.ChargeTime FROM MEMBERTABLE m, PCRoomTable p")
            .append(" where m.MNum = p.MNum and MName like '%" + mName + "%'");    
            
            System.out.println("LOG3 SQL : "+ sql );
            pstmt = conn.prepareStatement(sql.toString());
            rs = pstmt.executeQuery();
            list = new ArrayList<MemberVo>();
            while (rs.next()) {
                MemberVo vo = new MemberVo();
                vo.setMNum(rs.getInt("MNUM"));
                vo.setMId(rs.getString("MID"));
                vo.setMName(rs.getString("MNAME"));
                vo.setMAddr(rs.getString("MADDR"));
                vo.setMEmail(rs.getString("MEMAIL"));
                vo.setMGender(rs.getString("MGENDER"));
                vo.setMRole(rs.getString("MROLE"));
                vo.setMTel(rs.getString("MTEL"));
                vo.setMRegDate(rs.getString("MREGDATE"));
                vo.setPayment(rs.getInt("Payment"));
                vo.setChargeTime(rs.getString("ChargeTime"));
                list.add(vo);
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
        return list;

    }
    // 개인 정보 수정 
    public int u_p_Info(MemberVo vo) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        int res = 0;
        try {

            conn = MyConn.getConn();
            /*update MemberTable set MPwd=?, MAddr=?, MEmail=?, MTel=? where MNum=? */
            StringBuffer sql = new StringBuffer();
            sql.append("update MemberTable set MPwd=?, MAddr=?, MEmail=?, MTel=? where MNum=?");
            System.out.println("LOG3 SQL : "+ sql );
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setString( 1 , vo.getMPwd());
            pstmt.setString( 2, vo.getMAddr());
            pstmt.setString( 3 , vo.getMEmail());
            pstmt.setString( 4, vo.getMTel());
            pstmt.setInt( 5, vo.getMNum());
            res = pstmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
           try {
                if (pstmt != null ) pstmt.close();
                if (conn != null )  conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return res;
    }

    // 금액 충전
    public int payCharge(int mNum, int payC) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        int res = 0;
        try {

            conn = MyConn.getConn();
           
            StringBuffer sql = new StringBuffer();
            sql.append("update PCRoomTable set Payment=?, ChargeTime=sysdate where MNum=?");
            System.out.println("LOG3 SQL : "+ sql );
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.setInt(1, payC);
            pstmt.setInt(2 ,mNum);
            res = pstmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
           try {
                if (pstmt != null ) pstmt.close();
                if (conn != null )  conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return res;
    }
}
