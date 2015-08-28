package ex2inner;

// @author kosta, 2015. 8. 28 , 오전 11:38:19 , Ex1_MemberMain 
public class Ex1_MemberMain {
    public static void main(String[] args) {
        // 1. 외부 클래스를 생성 
        Ex1_MemberInner outer = new Ex1_MemberInner();
        // 2. 외부 클래스의 주소를 통해서 내부 클래스를 생성
        Ex1_MemberInner.Inner  inner;
        inner = outer.new Inner();
        outer.printA();
        System.out.println("");
        inner.printB();
        // 3. 내부 클래스에 접근 
        inner.printDate();
        
        // 연습 문제 ) new Ex1().test();
        // 이런 형식으로 내부 클래스의 printData() 호출하시오 
        new Ex1_MemberInner().new Inner().printDate();
        new Ex1_MemberInner().new Inner().printB();
                
       
        
       
        
        
    }
}
