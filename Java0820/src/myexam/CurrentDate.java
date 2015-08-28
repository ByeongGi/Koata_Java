package myexam;


import java.text.SimpleDateFormat;
import java.util.Date;

// @author kosta, 2015. 8. 21 , 오전 10:40:10 , CurrentDate 
public class CurrentDate {
    public static void main(String[] args) {
           long time = System.currentTimeMillis(); 
           SimpleDateFormat dayTime = new SimpleDateFormat("yyyy");
           String str = dayTime.format(new Date(time));
           System.out.println(str);
          
    }
}
