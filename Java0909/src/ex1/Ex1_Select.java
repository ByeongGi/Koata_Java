package ex1;
// @author kosta, 2015. 9. 9 , 오후 1:51:50 , Ex1_Select 
// Select일 경우  ResultSet으로 오라클의 Cursor를 반환 받아서 

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex1_Select {
    
    // Basic 버전
    public void printSawonList(){
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            conn = MyConn.getCon();
            System.out.println("Connection conn :"+conn);
            StringBuffer sql = new StringBuffer();
            // order by 기준컬럼 desc(내림차순)
            // order by 기준컬럼 asc(오름차순)
            sql.append("SELECT SABUN , SANAME , SAJOB , SASEX , SAPAY , SAHIRE ")
               .append(" FROM SAWON ORDER BY 1 DESC");
            pstm = conn.prepareStatement(sql.toString());
            System.out.println("PreparedStatement pstm :"+pstm);
            rs=pstm.executeQuery();
            System.out.println("ResultSet rs :"+pstm);
            while(rs.next()){
                System.out.println("사원번호 : "+rs.getInt("SABUN"));
                System.out.println("사원이름 : "+rs.getString("SANAME"));
                System.out.println("사원직책 : "+rs.getString("SAJOB"));
                System.out.println("사원성별 : "+rs.getString("SASEX"));
                System.out.println("사원급여 : "+rs.getInt("SAPAY"));
                System.out.println("사원입사일 : "+rs.getString("SAHIRE"));
                System.out.println("===================================");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally{
            try {
                if (rs !=null ) rs.close();
                if (pstm !=null ) pstm.close();
                if (conn !=null ) conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println("LOG  : SQL 자원 반환 오류 ");
            }
            
        }
    } // end printSawonList()
    
    public static void main(String[] args) {

        
        
        
        
        
        
        
        
        
        Ex1_Select s = new Ex1_Select();
        s.printSawonList();
    }
    
}
