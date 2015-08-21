package ex1;
// @author kosta, 2015. 8. 21 , 오후 1:46:15 , Ex1 
public class Ex1_BasicClass {
    // 멤버 변수 : 인스턴스 변수 : 멤버필드 
    String msg="Hi";
    int num = 10;
    public static void main(String[] args) {
        // 객체를 생성하고 멤버에 접근하는 기본적인 방법 
        // 선언과 동시에 생성 
        Ex1_BasicClass eb  = new Ex1_BasicClass();
        // num 의 값을 출력
        // 멤버 변수 : referenceVariable.memberVariable
        // "." : 객체의 주소.자원
        // 다른 예 
        // Scanner sc = new Scanner()
        // sc.nerxtInt() // 자원을 가져옴 
        // num 갱신 
        eb.num= 12; 
        System.out.println(eb.num); // eb에 저장된 힙의 주소값에 있는 num 이라는 변수의 값을 가져와라
        System.out.println(eb.msg); // eb에 저장되 힙의 주소값에 있는 msg 이라는 변수의 값을 가져와라
        System.out.println("=============자바 객체 주소값 확인 ===========");
        System.out.println("\n1. 첫번째 객체 주소 확인 \n"+eb.hashCode());
        eb= null;
        eb = new Ex1_BasicClass();
        System.out.println("2. 메모리에서 첫번 째 객체를 제거후 2번째 객체 주소 확인 \n"+eb.hashCode());
    } // end main 
} // end calss 
