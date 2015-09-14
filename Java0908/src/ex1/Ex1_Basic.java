package ex1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

// 1. 최초로 한번 ojdbc를 라이브러이에 추가
// 2. Driver 로딩
public class Ex1_Basic {
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
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("입력하세요 ! : ");
        
        System.out.println("번호 : ");
        int num = Integer.parseInt(sc.nextLine());
        
        System.out.println("아이디: ");
        String id = sc.nextLine();
        
        System.out.println("비밀번호  : ");
        String pwd = sc.nextLine();
        
        System.out.println("이름 : ");
        String name = sc.nextLine();
        
        System.out.println("성별 <남자 / 여자> : ");
        String gender = sc.nextLine();
        
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
