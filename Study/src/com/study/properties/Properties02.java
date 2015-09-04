package com.study.properties;
// @author kosta, 2015. 9. 2 , 오후 6:34:55 , NewClass 

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.Properties;

public class Properties02 {
    public static void main(String[] args) {
        String path = Properties02.class.getResource("database.properties").getPath();
        String path2 = "C:\\kosta108\\filetest\\text.xml";
        System.out.println(path);
        Properties properties = new Properties();
        // 스프링 설정값 가져올때 사용 
        File f = new File(path);
        File f2 = new File(path2);
        File f3 = new File(path2);
        try {
            path = URLDecoder.decode(path, "utf-8");
             //properties.load(new BufferedReader(new FileReader(path)));
            properties.put("driver", "oracle.jdbc.OracleDriver");
            properties.put("url", "jdbc:oracle:thin:@localhost:1521:orcl");
            properties.put("username", "scott");
            properties.put("password", "tiger");
            
            properties.storeToXML(new BufferedOutputStream(new FileOutputStream(f2)),"text");
            //properties.loadFromXML(new FileInputStream(f3));
            Enumeration keys=properties.propertyNames();
            
            
            
            while (keys.hasMoreElements()) {
                String key = (String) keys.nextElement();
                String value =(String) properties.get(key);
                System.out.println(key);
                System.out.println(value);
            }
            } catch (IOException ex) {
                ex.printStackTrace();
        }
            
        
    }
}
