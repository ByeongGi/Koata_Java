package ex1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// 1. 최초로 한번 ojdbc를 라이브러이에 추가
// 2. Driver 로딩
public class DBConn {
    // 생성자보다 먼저 드라이버를 로딩 static 자원으로 선언
    static {
        try {
            // 문자열 주소값을 Class화 시킬때 필요함 
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Log0 : 드라이버 로딩 완료");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } 
    }
    
    public void dbConect(int  num, String id, String pwd ,String name,String gender) {
        
        Connection conn = null;
        Statement stmt = null;
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
            System.out.println(stmt);
            StringBuffer sql = new StringBuffer();
            sql.append("insert into testmem values(")
            .append(num).append(", '").append(id).append("' , '")
            .append(pwd).append("' , '")
            .append(name).append("' , '")
            .append(gender).append("' , sysdate )");
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
