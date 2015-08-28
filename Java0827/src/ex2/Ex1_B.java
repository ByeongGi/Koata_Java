package ex2;
// @author kosta, 2015. 8. 27 , 오전 10:39:28 , Ex2_B 
// Ex1_A를 상속받는 자식 클래스 
// 상속받자 마자 컴파일 단계에서 하나로 취급됨!
public class Ex1_B extends Ex1_A{
    int num2 =2;
    public static void main(String[] args){
        // 부모를 참조 자료형으로 부모를 생성한다.
        //  Ex1_A ref = new Ex1_A();
        
        // 자식을 참조해서 자식 클래스를 생성한다.
        // -super를 호출해서 부모 객체부터 생성한다.
        // - 참조자료형이 자식이기 때문에 참조범위는 부모와 자식을 모두 
        // 참조 할수있는 주소값이 ref2 에 저장한다.
        Ex1_B ref2 = new Ex1_B();
        
        // 마치 부모의 자원을 내것인 양 사용할수 있다. (부모의 확장)
        System.out.println(ref2.num);
        System.out.println(ref2.num2);
        
        // 참조 자료형을 부모로해서 자식 클래스를 생성한다 ./***********
        Ex1_A ref3 = new Ex1_B();
        System.out.println(ref3.num);
        // System.out.println(ref3.num2);
        ref3.car();
        
        // 다형성 : 하나의 객체에서 다양한 객체들을 참조할수 있는 성질 
        Ex1_B ref4 = (Ex1_B) ref3;
        System.out.println(ref4.num2);
        
    }
    // Default  생성자
    public Ex1_B() {
        super(); // 부모의 기본 생성자 호출  / this() 자신의 생성자 호출 -> 시험 문제 출처
        
    }
      public void methodB(){
        System.out.println("자식 B");
    }
    
    // 메소드 재정의 목적 : 자식 클래스에서 새롭게 메소드 몸체를 변화    
    // 부모의 자원을 새롭게 재정의 해서 사용함
    //
    public void car(){
        super.car(); // 부모의 car() 클래스를 호출 
        System.out.println("자식 의 황금 자동차 : 페라리");
    } 
    
}
