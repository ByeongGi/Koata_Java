package exam;
// @author kosta, 2015. 9. 8 , 오후 7:53:23 , DB_Connection 
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB_Connection_auto {
    private static Connection conn;
    private static String driver;
    private static String url;
    private static String username;
    private static String password;
    
    static {
        try {
            propertiesLoad(); // 설정값을 미리 로딩하고 
            Class.forName(driver);
            System.out.println("Log0 : 드라이버 로딩 완료");
            conn = DriverManager.getConnection(url,username,password);
            System.out.println("Log1 : Connection 객체 저장 완료 ");
            System.out.println("연결테스트 :"+conn);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }
    
    private DB_Connection_auto() {}
    public static Connection getConn() {
        return conn;
    }
    private static void propertiesLoad() {
        // The java.lang.Class.getResource() finds a resource with a given name
        // Class.getResource() 
        // 주어진 이름의 자원을 찾아내어 해당 클래스의 소스 파일 위치를 상대 경로에 따라서
        // 해당 자원의 URL 객체로 반환  
        // -> 해당 클래스의 상대경로에 있는 자원의 주소값을 가져옴 
        String path = DB_Connection_auto.class.getResource("jdbc.properties").getPath();
        System.out.println("Log Properties file Path :"+ path );
        
        Properties properties = new Properties();   
        try {
            path = URLDecoder.decode(path, "utf-8");
            // Properties 객체에 파일을 읽어와서 Driver 의 값을 가져옴 
            properties.load(new FileReader(path));   
            DB_Connection_auto.driver =  properties.getProperty("driver");
            DB_Connection_auto.url = properties.getProperty("url");
            DB_Connection_auto.username = properties.getProperty("username");
            DB_Connection_auto.password= properties.getProperty("password");
            } catch (IOException ex) {
                ex.printStackTrace();
        }
            
    } // end propertiesLoad()
} // end DB_Connection_auto();
