package ex3;
// @author kosta, 2015. 8. 25 , 오후 2:14:30 , Ex1_Static 
public class Ex1_Static {
// static 예약어는 메소드나 멤버변수에 정의할수 없으며
// 지역변수나 클래스에게는 정의 할수 없다.
// 단 내부클래스는 예외이다.
// static 영역 : Static 예약어가 붙은 멤버들은 
// static 영역이라는 곳에 유일하게 만들어지면서 
// 모든 객체들이 사용할 수 있도록 공유개념을 가지고 있다.
    private int num;
    private static int num2; // 
    public static void main(String[] args) {
        // Static  자원은 생성업시 바로 접근이 가능하다.
        num2 = 100;
        
        // num = 1000;
    }
    
} // end class of Ex1_Static
