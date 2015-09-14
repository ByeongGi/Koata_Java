package ex1;
// @author kosta, 2015. 8. 28 , 오전 9:34:44 , Ex1_Imple 
// 인터페이스 구현
public class Ex1_Imple implements Ex1_Inter{

    @Override
    public void test() {
        System.out.println("인터페이스에서 강제로 오버라이딩 한 메소드입니다.");
        System.out.println(num);
    }

    @Override
    public void test2() {
        System.out.println("인터페이스에서 강제로 오버라이딩 한 메소드입니다.");
        System.out.println(num2);
    }
    
    public static void main(String[] args) {
        // 인터페이스를 참조 자료형으로 힙 영역에 구현 객체를 생성하였음
        
        Ex1_Inter ref = new Ex1_Imple();
        
        // 둘다 인터페이스의 추상 메서드를 호출
        ref.test();
        ref.test2();
        System.out.println("ref : "+ref);
       
        // instanceof : 왼쪽 객체 오른쪽에 명시한 클래스로 부터
        // 생성되었는지 대한 형식을 비교하는 미리 정의된 연산자.
        // --- 객체와 클래스가 가족관계인지 판명 *****
        // 왼쪽에 오는 객체가 오른쪽의 객체이거나 서브 클래스인 경우 true 를 리턴 
        if (ref instanceof Ex1_Imple) {
            System.out.println("true");
        }
        if (ref instanceof Ex1_Imple) {
            System.out.println("true");
        }
        if (ref instanceof Object) {
            System.out.println("true");
        }
        
        
        
        
    }
}
