package ex2inner;

// @author kosta, 2015. 8. 28 , 오후 12:24:08 , Ex2_StaticInner 
public class Ex3_StaticInner {
    int a;
    private int b;
    static int c  = 300;
    
    public Ex3_StaticInner(){
        a = 10;
        b = 200;
    }
    
    static class Innner{
    static  int d = 1000;
    public static void printDate(){
         // System.out.println(b); static 변수는 static 메소드에서 사용 가능
        System.out.println(c);
        System.out.println(d);
    }
    public void printData2(){
        System.out.println(c);
        System.out.println(d);
    }
    
    } // end class inner
    
    public static void main(String[] args) {
        Ex3_StaticInner.Innner.printDate();
        // static 내부 클래스 안에 인스턴스 메소드가 있을때 
        // inner 클래스 생성 
        Ex3_StaticInner.Innner ref = new Ex3_StaticInner.Innner();
        ref.printData2();
    }
    
}
