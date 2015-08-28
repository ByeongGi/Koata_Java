package ex1;

// @author kosta, 2015. 8. 28 , 오전 10:29:18 , Ex2MyWindow 
public class Ex2MyWindow implements Ex2_MyInter{

    @Override
    public void paint() {
        System.out.println("색칠 하겠다");
    }

    @Override
    public void draw() {
        System.out.println("그림을 그리겠다");
    }

    @Override
    public void print() {
        System.out.println("출력 을 그리겠다");
    }
    
    public void myHiddenPay(){
        System.out.println("십억을 다 모았다 ^^");
    }
    
    public static void main(String[] args) {
        Ex2_MyInter ref = new Ex2MyWindow();
        ref.print();
        ref.draw();
        ref.paint();
        // ref.myHiddenPay(); 접근 불가능 // 인터페이스가 참조형으로 프로모션되어 접근 불가능 
    }
}
