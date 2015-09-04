package ex2;
// @author kosta, 2015. 9. 1 , 오후 5:29:17 , Member 
import java.io.Serializable;
public class Member implements Serializable{
    // 직렬화 대상이 되는 객체는 반드시 Serializable를 구현해야 한다.
    transient private String name; // 직렬화 과정에서 제외 ! 
    private int pay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }
}
