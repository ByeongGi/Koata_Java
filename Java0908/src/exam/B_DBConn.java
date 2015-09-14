package exam;
// @author kosta, 2015. 9. 8 , 오후 5:11:04 , B_DBConn 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class B_DBConn {
     static {
        try {
            // 문자열 주소값을 Class화 시킬때 필요함 
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Log0 : 드라이버 로딩 완료");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } 
    }
    public void dbConect(int  nid, String subject, String author ,String pwd,String ip) {
        
        Connection conn = null;
        Statement stmt = null;
        PreparedStatement psmt = null;
        
        //                   Protocol : HOST     :PORT:SID
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user= "kira";
        String pss = "fkrldhs77";
        try {
            // 2. Connection 획득
            conn = DriverManager.getConnection(url, user, pss);
            System.out.println("Log1 : Connection 객체 저장 완료 ");
            System.out.println("연결테스트 :"+conn);
            // 3. Connection 으로 부터 SQL 명령문을 전송할 객체를 생성
            stmt = conn.createStatement();
            StringBuffer sql = new StringBuffer();
            /*
            --1번 
            INSERT INTO TESTBOARD (NID , SUJECT, AUTHOR, PWD , IP, R_DATE )
            VALUES ( 1 , '1번글' , '김병기1' , '1234' , '123.123.13.12' , SYSDATE );

            */
            sql.append("insert into testboard values(")
            .append(nid).append(", '").append(subject).append("' , '")
            .append(author).append("' , '")
            .append(pwd).append("' , '")
            .append(ip).append("' , sysdate )");
            // 반드시 출력해서 확인
            System.out.println("SQL : "+ sql);
            int res = stmt.executeUpdate(sql.toString());
            System.out.println("result :"+ res);
        } catch (SQLException ex) {
            ex.printStackTrace(); // 반드시 출력할것 
        } finally {
                try {
                    if (conn != null) {conn.close();}
                    if (stmt != null) {stmt.close();}
                } catch (SQLException ex) {
                   ex.printStackTrace();
                }
        } // end finally 
    } // end main 
     
     
     
}
