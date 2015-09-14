package ex1;
// @author kosta, 2015. 9. 11 , 오전 10:41:49 , Ex1_Performance 
// Performance 테스트를 하기 위해서 1000000 만건의 데이터를 

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// 입력하는 프로그램을 각각 만들어 보자 
public class Ex1_Performance_Preparestatement {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement psmt = null;
        conn = MyConn.getConn();
        long start = System.currentTimeMillis();
        try {
            String sql = "insert into PERPORMANCE values( ? , ? )";
            psmt=conn.prepareStatement(sql);
            System.out.println("Log3 Statement 객체 생성 완료 ! "+psmt);
            for (int i = 0; i < 100000; i++) {
            psmt.setString(1, String.valueOf(i));
            psmt.setString(2, String.valueOf(i));
            psmt.executeUpdate();
            }
            
        } catch (SQLException ex) {
           ex.printStackTrace();
        } finally{
           try {
                if ( psmt!=null)  psmt.close();
                if ( conn!=null)  conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
       
        long end = System.currentTimeMillis();
        System.out.println("걸린 시간 : "+(end - start));
        
    }
}
