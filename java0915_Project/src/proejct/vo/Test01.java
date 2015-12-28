package proejct.vo;

// KOSTA / 2015. 9. 16,¿ÀÈÄ 12:12:22 / Test01 /
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test01 {

    public int calc_pay(int money) {

        int time = 0;
        return time = ((int) (money / 1000));

    }

    public static void main(String[] args) {

        Test01 t = new Test01();
        System.out.println(t.calc_pay(5000));

     

       

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

        long timeInMillis = System.currentTimeMillis();

        Date timeInDate = new Date(timeInMillis);
        String timeInFormat = sdf.format(timeInDate);
        System.out.println(timeInFormat);
        
        
        
        

    }
}
