package ex2;
// @author kosta, 2015. 8. 25 , 오전 11:31:25 , Ex1_OverLoading 
// OverLoading : 같은 목적으로 비슷한 동작을 수행하는 메소드들을
// 일관되게 작업을 할수 있다.
// 1. 매개변수의 인자값, 갯수 다르고 , 리턴 타입이 동일해야한다.
// 2. 리턴 타입과는 무관하다.
public class Ex1_OverLoading {
    
    public void test(){
        System.out.println("여기는 테스트 ");
        
    };
    
    public void test(int n){
         System.out.println("여기는"+n + "테스트 ");
    }
    
    public void test(String s,int m){
         System.out.println("여기는" + "테스트 "+m);
    }
    
    public void test(int m, String n){
        System.out.println("여기는"+n + "테스트 "+m);
    }
}
