package ex1;
// @author kosta, 2015. 9. 11 , 오전 10:41:49 , Ex1_Performance 
// Performance 테스트를 하기 위해서 1000000 만건의 데이터를 

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

// 입력하는 프로그램을 각가 만들어 보자 
public class Ex1_Performance_Statement {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        conn = MyConn.getConn();
        long start = System.currentTimeMillis();
        try {
            stmt=conn.createStatement();
            System.out.println("Log3 Statement 객체 생성 완료 ! "+stmt);
            for (int i = 0; i < 100000; i++) {
            String sql = "insert into PERPORMANCE values( "
                    + "'"+ i +"' , '"+ i + "' )";
            stmt.executeUpdate(sql);
            }
            
        } catch (SQLException ex) {
           ex.printStackTrace();
        } finally{
           try {
                if ( stmt!=null)  stmt.close();
                if ( conn!=null)  conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            
            
        }
       
         long end = System.currentTimeMillis();
         System.out.println("걸린 시간 : "+(end - start));
        
    }
}
