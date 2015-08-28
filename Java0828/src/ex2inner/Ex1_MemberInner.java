package ex2inner;
// @author kosta, 2015. 8. 28 , 오전 11:24:00 , Ex1_MemberInner 
// 멤버 내부 클래스를 생성하고 할때 
// 반드시 외부 클래스를 생성한 후에 그 주소로 다시 내부 클래스를 생성해야 한다.
// 외부 클래스에서는 Container 나 , Base 객체를 상속 
public class Ex1_MemberInner extends SuperAContainer{
    int a;
    private int b;
    private static int c;

    public Ex1_MemberInner() 
    {
        a= 10; b = 100; c = 200;
    }
    
    // 멤버 영역에 내부 클래스를 정의한다.
    // 내부 클래스에서는 부가적인 긴으을 상속으로 재사용이 가능하다.
    public class Inner extends SuperB{
        
        public void printDate()
        {    
            System.out.println("int a : "+ a );
            System.out.println("private int b : "+ b );
            System.out.println("private static int c : "+ c );    
        }
    } // end class of Inner
    
    
}
