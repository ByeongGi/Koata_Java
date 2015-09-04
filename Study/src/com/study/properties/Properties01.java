package com.study.properties;
// @author kosta, 2015. 9. 2 , 오후 6:34:55 , NewClass 

import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.Properties;

public class Properties01 {
    public static void main(String[] args) {
        String path = Properties01.class.getResource("database.properties").getPath();
        Properties properties = new Properties();
        // 스프링 설정값 가져올때 사용 
        try {
            path = URLDecoder.decode(path, "utf-8");
            properties.load(new FileReader(path));
            
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
