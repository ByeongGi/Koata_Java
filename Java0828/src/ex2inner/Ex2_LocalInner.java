package ex2inner;
// @author kosta, 2015. 8. 28 , 오후 12:15:50 , Ex2_LocalInner 
// 로컬 내부 클래스 : 지역영역 안에 정의된 내부 클래스 
public class Ex2_LocalInner {
    private int a;
    
    public Ex2_LocalInner(){
        
    }
    
    public void insertTest(int num){
        int b = 200;
        int c = num;
        class Inner{ // 생존 범위는 메서드 안에 있기 때문에 
            // 메소드가 스택에서 실행될때 나갈때 소멸된다.
            public void getData(){
                // JDK 7 이하 버전에서는 로컬 내부 클래스에서는
                // 지역 변수를 사용하지 못한다. => ㄴ그래서 상수로 모두 바꾸어야 한다.
                System.out.println("int a : "+ a);
                System.out.println("int b : "+ b);
                System.out.println("int c : "+ c);
            }
        }
    }
    
    public static void main(String[] args) {
        Ex2_LocalInner ref  = new Ex2_LocalInner();
        ref.insertTest(10);
    }
    
    
}
