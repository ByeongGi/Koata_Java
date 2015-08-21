package ex2;
// @author kosta, 2015. 8. 18 , 오후 5:00:16 , Ex2_Oper 
public class Ex2_Oper {
    // 대입 연산자 : 특정상수값이나 변수값 또는 
    // 객체를 변수에 전달하여 기억시킬 때 사용하는 연산자.
    // =,+=,-=,*=,/=,%=
    // = 연산자 중심으로 오른쪽 변수값을 왼쪽 변수에 대입한다.
    // += : 왼쪽 변수에 더하면서 대입 
    public static void main(String[] args) {
        // 값 ? a : , a:
        int a = 10;
        int b = 7;
        System.out.println("+= 연산 ");
        System.out.println(a+b); // 17
        System.out.println("변수 a의 값 :"+a); // 10
        
        System.out.println(a += b); // 17
        System.out.println("변수 a의 값 :"+a); // 17
        
        System.out.println("-= 연산 ");
        System.out.println(a-b); // 17 -7 = 10 
        System.out.println("변수 a의 값 :"+a); // 17
        
        System.out.println(a -= b);
        System.out.println("변수 a의 값 :"+a);
        
        System.out.println("*= 연산 ");
        System.out.println(a*b);
        System.out.println("변수 a의 값 :"+a); 
        
        System.out.println(a *= b);
        System.out.println("변수 a의 값 :"+a);
        
        System.out.println("/= 연산 ");
        System.out.println(a/b);
        System.out.println("변수 a의 값 :"+a); 
        
        System.out.println(a /= b);
        System.out.println("변수 a의 값 :"+a);
        
        System.out.println("%= 연산 ");
        System.out.println(a%b);
        System.out.println("변수 a의 값 :"+a); 
        
        System.out.println(a %= b);
        System.out.println("변수 a의 값 :"+a);
        
    } // end main
} // end class 
