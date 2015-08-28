package ex1;

// @author kosta, 2015. 8. 27 , 오전 9:15:23 , Ex2_HasaTarget 
public class Ex2_HasaTarget {
    private Ex2_HasaOrder order;
    //Ex2_HasaOrder order는 메소드로 호출시 this의 주소값
    public Ex2_HasaTarget(Ex2_HasaOrder order) {
        this.order= order;
    }
    
    public void targetMethoed(){
        System.out.println("Target메소드 호출");
    }
    
}
