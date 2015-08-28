package ex1;

// @author kosta, 2015. 8. 27 , 오전 9:14:58 , Ex2_HasaOrder 
public class Ex2_HasaOrder {
    private Ex2_HasaTarget ht;
    // Targer 객체의 주소값을 멤버 필드로 선언.
    public Ex2_HasaOrder() {
        // 현재 객체가 생성될때 Targer객체를 생성해서
        // 초기화 한다.
        ht = new Ex2_HasaTarget(this); // Has a 관계 
    }

    public Ex2_HasaTarget getHt() {
        return ht;
    }
     public String orderMetheod(){
        return "Order";
    }
}
