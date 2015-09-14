package exam;
// @author kosta, 2015. 9. 8 , 오후 8:08:33 , TestCon 
import java.sql.Connection;
public class TestCon {
    public static void main(String[] args) {
        Connection conn=DB_Connection_auto.getConn();
    }
}
