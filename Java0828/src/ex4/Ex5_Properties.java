package ex4;
// @author kosta, 2015. 8. 28 , 오후 5:41:42 , Ex5_Properties 

import java.util.Enumeration;
import java.util.Properties;

public class Ex5_Properties {
    public static void main(String[] args) {
        // Properties 는 key/ Value 로 저장할수 있다 .
        // kor = 한국입니다.
        Properties prop = new Properties();
        // 속성 저장하기
        prop.setProperty("lovely", "김길동");
        prop.setProperty("deDev", "oracle.jdbc.driver.OracleDriver");
        // 속성값 가져오기 
        String a = prop.getProperty("lovely");
        String b = prop.getProperty("deDev");
        System.out.println(a);
        System.out.println(b);
        System.out.println("===================");
        // key 값만 얻어내기 ------------- 중요 .....
        Enumeration keys = prop.propertyNames();
        while (keys.hasMoreElements()) {
            System.out.println(keys.nextElement());
        }
        
        
        
    }
}
