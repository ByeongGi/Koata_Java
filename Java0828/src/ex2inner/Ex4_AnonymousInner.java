package ex2inner;
// @author kosta, 2015. 8. 28 , 오후 12:33:30 , Ex4_AnoymousInner 
public class Ex4_AnonymousInner {
    // 이미 정의된 -클래스 , 추상 클래스 , 인터페이스를 익명 내부 클래스로 
    // 정의해서 사용할수 있다.
    // 참조할 이름이 없도록 만들수 있기 때문에 일회용으로 사용됨 
    public void mytest(){
        int bb = 100;
        // 익명 내부 클래스 
        new MyInter() {

            @Override
            public void printData() {
                System.out.println("data" +data +bb);
            }
            
        }.printData();
        
        // 임의의 추상 메소드를 가진 임의의 추상 클래스를 만들어보고
        // 여기서 익명 내부클래스로 생성해서 호출해보시오.
        new MyInter2() {

            @Override
            public void test() {
                System.out.println("테스트 ");
            }
        }.test();
        
    }
    
    public static void main(String[] args) {
        new Ex4_AnonymousInner();
    }
}
