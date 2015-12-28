package ex1.dao;
// @author kosta, 2015. 9. 15 , 오전 10:12:28 , BoardDao 
// Board Service에서 사용될 JDBC 관련 명령어들을 한번에 관리하는 클래스 
import conn.MyConn;
import ex1.vo.BoardVo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class BoardDao {
    // 기능 분석 : 게시판 입력, 리스트 , 수정 , 삭제 등등 
    // 입력 처리를 위한 메소드 
    // 외부 에서 현재 메소드에게 사용자가 입력한 값을 인자값으로 전달하면 
    // 그 값을 받아서 JDBC 에서 데이터를 바인딩하여 처리할 메서드
    // 메소드에 반환형 ture 아니면 ,false 
    
    public boolean insertBoard(BoardVo vo){
        Connection conn =  null;
        PreparedStatement pstmt= null;
      
        try {
            conn = MyConn.getConn();
            String sql =  "INSERT INTO BOARD VALUES( board_seq.NEXTVAL , ? , ? , ? , ? , ? , SYSDATE )";
            System.out.println("LOG3 SQL : "+ sql );
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1 , vo.getSub() );
            pstmt.setString(2 , vo.getWriter() );
            pstmt.setString(3 , vo.getPwd() );
            pstmt.setString(4 , vo.getCont() );
            pstmt.setString(5 , vo.getReip() );
            int res =pstmt.executeUpdate();
            System.out.println("LOG4 SQL INSERT SUCCESS : " + res + "   --- 1 SUCCESS ROW , 0 FAIL");
            return  true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return  false;
        } finally{
           try {
                if (pstmt != null ) pstmt.close();
                if (conn != null )  conn.close();
                System.out.println("LOG5 SQL RESOUCE CLOSED SUCCESS! ");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    } // end insertBoard()
    
    // 연습문제 - 아래의 메소드는 Board 테이블의 모든 자료를 
    // SELECT 문으로 읽어와서 ArrayList 로 반환하는 메소드이다. 
    // 완성하시오. 
    public ArrayList<BoardVo> getList(){
        ArrayList<BoardVo> boradList = new ArrayList<BoardVo>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = MyConn.getConn();
            String sql = "SELECT NUM , SUB , WRITER , PWD , CONT , REIP , REDATE FROM BOARD_VIEW ORDER BY 1 DESC";
            System.out.println("LOG3 SQL : "+ sql );
            pstmt= conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                BoardVo vo = new BoardVo();
                vo.setNum(rs.getInt("NUM") );
                vo.setSub(rs.getString("SUB") );
                vo.setWriter(rs.getString("WRITER") );
                vo.setPwd(rs.getString("PWD"));
                vo.setCont(rs.getString("CONT") );
                vo.setReip(rs.getString("REIP") );
                vo.setRedate(rs.getString("REDATE") );
                // vo 객체의 주소값을 저장함.
                boradList.add(vo);
            }
        } catch (SQLException ex) {
            System.out.println("LOG4 SELECT - getList()  SQL FAIL");
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
        return  boradList;
    }
    
    
    // 많은 데이터 중에 인자로 전달 받은 주키를 기준으로
    // SELECT 한다.
    public BoardVo getView(int num){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        BoardVo vo = new BoardVo();
        try {
            conn = MyConn.getConn();
            String sql = "SELECT NUM , SUB , WRITER , PWD , CONT , REIP , REDATE"
                       + " FROM BOARD WHERE NUM=?";
            System.out.println("LOG3 SQL : "+ sql );
            pstmt= conn.prepareStatement(sql);
            pstmt.setInt(1, num);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                vo.setNum(rs.getInt("NUM") );
                vo.setSub(rs.getString("SUB") );
                vo.setWriter(rs.getString("WRITER") );
                vo.setPwd(rs.getString("PWD"));
                vo.setCont(rs.getString("CONT") );
                vo.setReip(rs.getString("REIP") );
                vo.setRedate(rs.getString("REDATE") );
            }
        } catch (SQLException ex) {
            System.out.println("LOG4 SELECT - getList()  SQL FAIL");
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
        return  vo;
    }
    
    
    
    public int delete(int num){
        Connection conn = null;
        PreparedStatement pstmt = null;
        int res = 0; // Query 의 Result 값을 저장
        try {
            conn = MyConn.getConn();
            String sql = "DELETE FROM BOARD WHERE NUM=?";
            System.out.println("LOG3 SQL : "+ sql );
            pstmt= conn.prepareStatement(sql);
            pstmt.setInt(1, num);
            res = pstmt.executeUpdate();
            System.out.println("LOG4 SQL DELETE SUCCESS : " + res + "DELETE 1 or more ROW :, 0 : FAIL");
            // res : 0 이면 DELETE 실패 , 1 이상이면 1 이상의 ROW 삭제
        } catch (SQLException ex) {
            System.out.println("LOG4 DELETE - delete()  SQL FAIL");
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
    } // end delete()
}
