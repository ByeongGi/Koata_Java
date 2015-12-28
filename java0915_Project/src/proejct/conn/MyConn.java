package proejct.conn;

// @author kosta, 2015. 9. 11 , ���� 10:45:55 , MyConn 

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MyConn {
    private static String driver;
    private static String url;
    private static String user;
    private static String password;
    
    static {
        try {
            propetiesLoad();
            Class Driver=Class.forName(driver);
            System.out.println("Log1 Driver Load  : "+driver);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
    }
    public static Connection getConn(){
        Connection conn =null;
        try {
            conn= DriverManager.getConnection(MyConn.url, MyConn.user, MyConn.password);
            System.out.println("Log2 Connection ��ü ���� �Ϸ� ! "+ conn);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return conn;
    }
    
    private static void propetiesLoad(){
        String path = MyConn.class.getResource("jdbc.properties").getPath();
        Properties properties = new Properties();
        try {
            properties.load(new FileReader(path));
            MyConn.driver=properties.getProperty("driver");
            MyConn.url= properties.getProperty("url");
            MyConn.user= properties.getProperty("user");
            MyConn.password = properties.getProperty("password");
            System.out.println("Log0 ����̹� ������ �б�");
            System.out.println("Driver  : "+driver);
            System.out.println("url  : "+url);
            System.out.println("user  : "+user);
            System.out.println("password  : "+password);
        } catch (IOException ex) {
           ex.printStackTrace();
        }
    }
}
