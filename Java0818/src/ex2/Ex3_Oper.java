package ex2;
// @author kosta, 2015. 8. 18 , 오후 5:15:51 , Ex3_Oper 
public class Ex3_Oper {
    // 비교연산자 : 변수나 상수의 값을 비교할때 사용되는 연산자
    // 결과는 항상 boolean 값 (F/T ) 이어여 한다.
    // >, < , <=, >= , == (같다) ,!=(다르다)
    // 제어문의 조건문으로 주로 활용함 
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean c = a < b; // a의 값은 b의 값보다 작다.
        System.out.println("a < b :"+c); // ture
        c= a == b;
        System.out.println("a == b :"+ c); // false
        c= a !=b;
        System.out.println("a != b :"+ c); // true     
    } // end mian
} // end class 
