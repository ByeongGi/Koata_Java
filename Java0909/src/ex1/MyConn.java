package ex1;

// @author kosta, 2015. 9. 9 , 오후 1:59:57 , MyConn 

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MyConn {
    static {
        try {
            Class Driver=Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver :"+Driver);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    public static Connection getCon() throws SQLException, IOException{
        Properties prop = new Properties();
        String path = MyConn.class.getResource("jdbc.properties").getPath();
        System.out.println("path : "+path);
        prop.load(new FileInputStream(path));
        String url = prop.getProperty("url");
        String user = prop.getProperty("user");
        String pass = prop.getProperty("password");
        return DriverManager.getConnection(url ,user, pass);   
    }
}
