package exam;
// @author kosta, 2015. 8. 27 , 오후 7:19:40 , Calss 
public abstract class AbstractTest01 {
    // proteced 필드 선언 이유는 ? 
    // 상속 받는 객체에서만 사용을 하고 외부에서 접근을 못하게 막기 위함 
    protected int a; // 상속 받는 객체 에서만 사용 
    protected int b; 
    protected int c;
    
    // 추후에 구현할 기능들을 메소드로 분리함 
    public abstract void test(); // 추상 클래스 선언 
    public abstract void test(String a); // 추상 클래스 오버로딩 
    
    // 추상 클래스안에 일반 메소드 선언- > 공통적으로 사용할 기능을 상속한 후에 ㅁ바로 쓸수 있도록 하기위해서 씀 
    public void test2(){
        System.out.println("추상 클래스는 메소드의 "
                + "몸체도 정의가 가능합니다."
                + " 다만 상속받는 클래스에서 객체 생성후 "
                + "사용가능합니다.");
    }
}
