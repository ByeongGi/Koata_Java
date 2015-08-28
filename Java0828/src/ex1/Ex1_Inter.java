package ex1;
// interface 의 다형성 - 하나의 객체 슈퍼 클래스로 다양한 객체 자식 객체의
// 자원에 접근하고 사용하는 것 

// Interface 의 구성 : 상숭와 추상 메서드로 되어있음 
public interface Ex1_Inter {
    public static  final int num = 100;
    public abstract void test();
    
    // 축약형(컴파일 과정중에 생략한 것들을 자동으로 선언해줌)
    public int num2 = 20;
    public void test2();
    
    
}
