package ex2;
// @author kosta, 2015. 8. 27 , 오전 10:38:34 , Ex1_A 
public class Ex1_A {
    //  부모 클래스
    //  기본 : 자식에 의해서 확장될 클래스 . is  a 관계
    //  자식은 부모클래스를 extends 라는 키워드로 상속
    //  단일 상속 : (부모 클래스는 오직 하나만 선택할수 있다.)
    //  설계적인 개념 : Basic Class ,Container Class , 재 사용 기반, OCP(Open closed principle)
    int num = 1;
    public void methodA(){
        System.out.println("부모 A");
    }
    public void car(){
        System.out.println("부모의 빨간 자동차 : 페라리");
    }
}
