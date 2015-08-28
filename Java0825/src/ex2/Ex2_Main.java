package ex2;

// @author kosta, 2015. 8. 25 , 오후 12:26:02 , Ex2_Main 
public class Ex2_Main {
    public static void main(String[] args) {
        Ex2_Car car;
        car = new Ex2_Car("페라리");
        System.out.println("페라리 객체 주소값 : "+car.hashCode());
        car = new Ex2_Car();        
        System.out.println("기본 생성자 객체 주소값 : "+car.hashCode());
    }
} // end class of Ex2_Main
