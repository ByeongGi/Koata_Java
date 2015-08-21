package ex1;
// @author kosta, 2015. 8. 19 , 오전 9:31:42 , NewClass 
// 논리 연산자 : 비교 연산자가와 같이 결과 참, 거짓이 반환되는 
// 논리값을 가지고 다시 한번 조건 연산을 하는 것이다.
// - 연산자 중심으로 왼쪽으로 처리하게 되는데 ,그 처리 결과에 따라
// 오른쪽 조건의 수행 여부가 결정된다.
// && => 논리곱 (AND) 주어진 조건들이 모두 참 일떄만 참을 나타낸다.
// || => 논리합 (OR)  주어진 조건들이 하나라도 참 이면 참을 나타낸다.
// ! => 부정 (NOT)  참은 거짓으로  거짓은 참으로 나타낸다. 
public class Ex1_Oper {
    
    public static void main(String[] args) {
        System.out.println("============= 논리 연산자 =================");
        int a = 10; 
        int b = 20;
        // &&(AND ) 두 양쪽 항의 조건식의 참 여부를 검사한다.  (조건식)&&(조건식)
        boolean c= ((a+=12)>b) && (a==(b+=2)); 
        // (a =22) > 10 && ( a=22 ) == ( b =20+2)
        System.out.println("c="+c); // ture
        System.out.println("a="+a); // a = 22
        System.out.println("b="+b); // b = 22 
    } // end main
} // end class
/*
=> Result
============= 논리 연산자 =================
c=true
a=22
b=22
*/